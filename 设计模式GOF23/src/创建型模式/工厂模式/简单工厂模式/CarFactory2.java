package 创建型模式.工厂模式.简单工厂模式;
/**
 * 简单工厂类
 * @author lcd
 *
 */
public class CarFactory2 {
	
	public static Car createAudi() {
		return new Audi();
	}
	public static Car createByd() {
		return new Byd();
	}
}
