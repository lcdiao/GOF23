package �ṹ��ģʽ.�Ž�ģʽbridge;

public class Client {
	public static void main(String[] args) {
		//��������ıʼǱ�����
		Computer2 c = new Laptop2(new Lenovo());
		c.sale();
		
		 c = new Desktop2(new Shenzhou());
		 c.sale();
	}
}
