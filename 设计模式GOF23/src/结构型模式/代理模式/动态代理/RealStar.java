package 结构型模式.代理模式.动态代理;

public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
		System.out.println("真实角色面谈");
	}

	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
		System.out.println("真实角色签合同");
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
		System.out.println("真实角色订票");
	}

	@Override
	public void sing() {
		System.out.println("RealStar.sing()");
		System.out.println("真实角色唱歌");
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
		System.out.println("真实角色收尾款");
	}

}
