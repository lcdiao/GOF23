package 创建型模式.工厂模式.简单工厂模式;
/**
 * 测试在没有工厂模式的情况下
 * @author lcd
 *
 */
public class Client01 {	//调用者
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
	}
}
