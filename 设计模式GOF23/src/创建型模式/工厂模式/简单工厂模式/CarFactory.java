package 创建型模式.工厂模式.简单工厂模式;
/**
 * 简单工厂类
 * @author lcd
 *
 */
public class CarFactory {
	
	public static Car createCar(String type) {
		if("奥迪".equals(type)) {
			return new Audi();
		}else if("比亚迪".equals(type)) {
			return new Byd();
		}else {
			return null;
		}//小问题:违反开闭原则:如果有其他的类型Car就要修改代码
	}
}
