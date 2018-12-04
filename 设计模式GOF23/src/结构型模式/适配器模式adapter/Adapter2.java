package 结构型模式.适配器模式adapter;
/**
 * 适配器(相当于usb和ps/2的转接器)
 * 对象适配器方式,使用了组合的方式跟被适配对象整合
 * @author lcd
 *
 */
public class Adapter2 implements Target{
	private Adaptee adaptee;
	@Override
	public void handleReq() {
		adaptee.request();
	}
	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
}
