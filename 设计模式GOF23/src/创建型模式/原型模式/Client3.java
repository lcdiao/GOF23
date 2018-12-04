package 创建型模式.原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式(深克隆:使用序列化和反序列化实现)
 * @author lcd
 *
 */
public class Client3 {
	public static void main(String[] args) throws Exception {
		Date d = new Date(123123123222L);
		Sheep s1 = new Sheep("少利",d);
		System.out.println(s1);					//原型模式.Sheep@7852e922
		System.out.println(s1.getSname());		//少利
		System.out.println(s1.getBirthday());	//Mon Nov 26 08:52:03 CST 1973
		
		//以s1为原型建新对象
//		Sheep s2 = (Sheep) s1.clone();
		//使用序列化和反序列化实现深克隆
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();	//序列化
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep) ois.readObject();		//反序列化
		
		
		
		//修改s1的属性
		d.setTime(24124124124L);
		System.out.println(s1.getBirthday());	//Wed Oct 07 13:08:44 CST 1970
		
		System.out.println(s2);					//原型模式.Sheep@4e25154f
		System.out.println(s2.getSname());		//少利
		System.out.println(s2.getBirthday());	//Mon Nov 26 08:52:03 CST 1973
		s2.setSname("多利");
		System.out.println(s2.getSname());		//多利
	}
}
