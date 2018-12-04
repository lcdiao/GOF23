package 结构型模式.代理模式.静态代理;

public class Client {
	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();//只有sing是真实角色执行
		proxy.collectMoney();
	}
}
