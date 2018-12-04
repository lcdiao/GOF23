package 创建型模式.单例模式.防止反射和反序列化漏洞;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模式（如何防止反射和反序列化漏洞）
 * @author lcd
 *
 */
public class SingletonDemo6 implements Serializable{
	private static SingletonDemo6 instance;//类初始化时，不初始化这个对象(延时加载，真正用的时候在创建)
	SingletonDemo6() {	//私有化构造器
		if(instance!=null) {	//防止反射跳过权限检查！！！！！
			throw new RuntimeException();	//多次调用直接抛出异常
		}
	}			
	
	//方法同步，调用效率低
	public static SingletonDemo6 getInstance() {		
		if(instance==null) {
			instance = new SingletonDemo6();
		}
		return instance;	//返回对象，无论调用几次，返回的对象都是同一个(单例)
	}
	
	//反序列化时，如果定义了readResolve()则直接返回该方法指定的对象。而不需要单独在创建新对象！
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
