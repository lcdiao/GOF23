package 结构型模式.适配器模式adapter;
/**
 * 被适配的类(相当于例子中的，PS/2键盘)
 * @author lcd
 *
 */
public class Adaptee {
	public void request() {
		System.out.println("可以完成客户请求需要的功能！");
	}
}
