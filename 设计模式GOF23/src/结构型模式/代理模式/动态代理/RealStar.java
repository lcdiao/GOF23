package �ṹ��ģʽ.����ģʽ.��̬����;

public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
		System.out.println("��ʵ��ɫ��̸");
	}

	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
		System.out.println("��ʵ��ɫǩ��ͬ");
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
		System.out.println("��ʵ��ɫ��Ʊ");
	}

	@Override
	public void sing() {
		System.out.println("RealStar.sing()");
		System.out.println("��ʵ��ɫ����");
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
		System.out.println("��ʵ��ɫ��β��");
	}

}
