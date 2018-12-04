package 创建型模式.单例模式;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.lang.reflect.Constructor;

import 创建型模式.单例模式.防止反射和反序列化漏洞.SingletonDemo6;

/**
 * 测试反射和反序列化破解单例模式
 * @author lcd
 *
 */
public class Client2 {
	public static void main(String[] args) throws Exception {
		SingletonDemo6 s1 = SingletonDemo6.getInstance();
		SingletonDemo6 s2 = SingletonDemo6.getInstance();
		System.out.println(s1);			//单例模式.防止反射和反序列化漏洞.SingletonDemo6@7852e922
		System.out.println(s2);			//单例模式.防止反射和反序列化漏洞.SingletonDemo6@7852e922
		System.out.println(s1==s2);		//true
		
		//通过反射的方式直接调用私有构造器
//		Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("单例模式.防止反射和反序列化漏洞.SingletonDemo6");
//		
//		Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
//		
//		c.setAccessible(true); 	//跳过权限的检查
//		
//		SingletonDemo6 s3 = c.newInstance();
//		SingletonDemo6 s4 = c.newInstance();
//		
//		System.out.println(s3);		//单例模式.防止反射和反序列化漏洞.SingletonDemo6@4e25154f
//		System.out.println(s4);		//单例模式.防止反射和反序列化漏洞.SingletonDemo6@70dea4e
//		System.out.println(s3==s4);	//false
		
		/*没防止反射的结果:
	 	单例模式.防止反射和反序列化漏洞.SingletonDemo6@4e25154f
	 	单例模式.防止反射和反序列化漏洞.SingletonDemo6@70dea4e
	 	false	
	 	
	 加上防止反射后抛出异常	
	 SingletonDemo6() {	//私有化构造器
		if(instance!=null) {
			throw new RuntimeException();	//多次调用直接抛出异常
		}
	}	
	 */
		
		
		
		//通过反序列化的方式构造多个对象
		//序列化
		FileOutputStream fos = new FileOutputStream("d:/myjava/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);	//	将对象s1存到d:/myjava/a.txt
		oos.close();
		fos.close();
		
		//反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/myjava/a.txt"));
		SingletonDemo6 s3 = (SingletonDemo6) ois.readObject();
		System.out.println(s3);		
		System.out.println(s1==s3);		
		/*
		//反序列化时，如果定义了readResolve()则直接返回该方法指定的对象。而不需要单独在创建新对象！
		private Object readResolve() throws ObjectStreamException{
			return instance;
		}
		
		加上该方法前的结果：
		单例模式.防止反射和反序列化漏洞.SingletonDemo6@776ec8df
		false		反序列化后对象不相同！！！！！！
		
		加上该方法后的结果：
		单例模式.防止反射和反序列化漏洞.SingletonDemo6@7852e922
		true
		 */
	}
}
