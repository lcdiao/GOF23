package �ṹ��ģʽ.����ģʽ.��̬����;

public class ProxyStar implements Star{
	private Star star;
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}
	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
		System.out.println("�����ɫ��̸");
	}
	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
		System.out.println("�����ɫǩ��ͬ");
	}
	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
		System.out.println("�����ɫ��Ʊ");
	}
	@Override
	public void sing() {
		star.sing();//������ʵstar��sing����
	}
	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
		System.out.println("�����ɫ��β��");
	}
}
