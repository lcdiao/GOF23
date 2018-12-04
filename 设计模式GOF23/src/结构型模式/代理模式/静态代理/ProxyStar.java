package 结构型模式.代理模式.静态代理;

public class ProxyStar implements Star{
	private Star star;
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}
	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
		System.out.println("代理角色面谈");
	}
	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
		System.out.println("代理角色签合同");
	}
	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
		System.out.println("代理角色订票");
	}
	@Override
	public void sing() {
		star.sing();//调用真实star的sing方法
	}
	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
		System.out.println("代理角色收尾款");
	}
}
