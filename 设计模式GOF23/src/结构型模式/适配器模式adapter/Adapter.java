package 结构型模式.适配器模式adapter;
/**
 * 适配器(相当于usb和ps/2的转接器)
 * 类适配器方式
 * @author lcd
 *
 */
public class Adapter extends Adaptee implements Target{
	@Override
	public void handleReq() {
		super.request();
	}
}
