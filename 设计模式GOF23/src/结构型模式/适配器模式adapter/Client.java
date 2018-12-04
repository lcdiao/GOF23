package 结构型模式.适配器模式adapter;
/**
 * 客户端类(相当于例子中的笔记本，只有USB接口)
 * @author lcd
 *
 */
public class Client {
	public void test1(Target t) {
		t.handleReq();
	}
	
	public static void main(String[] args) {
//		Client c = new Client();	//客户端类(相当于例子中的笔记本，只有USB接口)
//		Adaptee a = new Adaptee();	//被适配的类(相当于例子中的，PS/2键盘)
//		Target t = new Adapter();	//适配器(相当于usb和ps/2的转接器)
//		c.test1(t);//类适配器方式
		
		
		Client c = new Client();	//客户端类(相当于例子中的笔记本，只有USB接口)
		Adaptee a = new Adaptee();	//被适配的类(相当于例子中的，PS/2键盘)
		Target t = new Adapter2(a);	//适配器(相当于usb和ps/2的转接器)
		c.test1(t);//对象适配器方式
	}
}
