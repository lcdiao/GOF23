package �ṹ��ģʽ.������ģʽadapter;
/**
 * ������(�൱��usb��ps/2��ת����)
 * ������������ʽ,ʹ������ϵķ�ʽ���������������
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
