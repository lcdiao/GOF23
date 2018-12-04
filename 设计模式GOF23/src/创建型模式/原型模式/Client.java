package 创建型模式.原型模式;

import java.util.Date;

/**
 * 测试原型模式	(浅克隆:在JAVA中，浅复制是指当对象的字段值被复制时,字段引用的对象不会被复制.例如,如果一个对象有一个指向字符串的字段,并且我们对该对象做了一个浅复制,那麽两个对象将引用同一个字符串)
 * @author lcd
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date d = new Date(123123123222L);
		Sheep s1 = new Sheep("少利",d);
		System.out.println(s1);					//原型模式.Sheep@7852e922
		System.out.println(s1.getSname());		//少利
		System.out.println(s1.getBirthday());	//Mon Nov 26 08:52:03 CST 1973
		
		//以s1为原型建新对象
		Sheep s2 = (Sheep) s1.clone();
		
		//修改s1的属性
		d.setTime(24124124124L);
		System.out.println(s1.getBirthday());	//Wed Oct 07 13:08:44 CST 1970
		
		System.out.println(s2);					//原型模式.Sheep@4e25154f
		System.out.println(s2.getSname());		//少利
		System.out.println(s2.getBirthday());	//Wed Oct 07 13:08:44 CST 1970
		s2.setSname("多利");
		System.out.println(s2.getSname());		//多利
		//	对象不相同，值相同!
	}
}
