package �ṹ��ģʽ.����ģʽ.��̬����;

public class Client {
	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();//ֻ��sing����ʵ��ɫִ��
		proxy.collectMoney();
	}
}
