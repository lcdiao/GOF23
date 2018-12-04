package 创建型模式.原型模式;

import java.util.Date;

/**
 * 原型模式(深克隆)
 * @author lcd
 *
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date d = new Date(123123123222L);
		Sheep2 s1 = new Sheep2("少利",d);
		System.out.println(s1);					//原型模式.Sheep2@7852e922
		System.out.println(s1.getSname());		//少利
		System.out.println(s1.getBirthday());	//Mon Nov 26 08:52:03 CST 1973

		
		
		//以s1为原型建新对象
		Sheep2 s2 = (Sheep2) s1.clone();		//s2对象的birthday是一个新对象
		
		//修改s1的属性
		d.setTime(24124124124L);
		System.out.println(s1.getBirthday());	//Wed Oct 07 13:08:44 CST 1970
		
		
		System.out.println(s2);					//原型模式.Sheep@4e25154f
		System.out.println(s2.getSname());		//少利
		System.out.println(s2.getBirthday());	//Mon Nov 26 08:52:03 CST 1973
		s2.setSname("多利");
		System.out.println(s2.getSname());		//多利
		//	对象不相同，值相同!
	}
}
