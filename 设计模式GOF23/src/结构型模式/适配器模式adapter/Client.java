package �ṹ��ģʽ.������ģʽadapter;
/**
 * �ͻ�����(�൱�������еıʼǱ���ֻ��USB�ӿ�)
 * @author lcd
 *
 */
public class Client {
	public void test1(Target t) {
		t.handleReq();
	}
	
	public static void main(String[] args) {
//		Client c = new Client();	//�ͻ�����(�൱�������еıʼǱ���ֻ��USB�ӿ�)
//		Adaptee a = new Adaptee();	//���������(�൱�������еģ�PS/2����)
//		Target t = new Adapter();	//������(�൱��usb��ps/2��ת����)
//		c.test1(t);//����������ʽ
		
		
		Client c = new Client();	//�ͻ�����(�൱�������еıʼǱ���ֻ��USB�ӿ�)
		Adaptee a = new Adaptee();	//���������(�൱�������еģ�PS/2����)
		Target t = new Adapter2(a);	//������(�൱��usb��ps/2��ת����)
		c.test1(t);//������������ʽ
	}
}
