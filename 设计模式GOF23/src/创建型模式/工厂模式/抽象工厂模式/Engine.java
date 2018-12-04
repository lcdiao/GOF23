package 创建型模式.工厂模式.抽象工厂模式;

public interface Engine {//发动机
	void run();
	void start();
}

class LuxuryEngine implements Engine{
	@Override
	public void run() {
		System.out.println("发动机转的快");
	}
	@Override
	public void start() {
		System.out.println("启动快！可以自动启停!");
	}
}
class LowEngine implements Engine{
	@Override
	public void run() {
		System.out.println("发动机转的慢");
	}
	@Override
	public void start() {
		System.out.println("启动慢！");
	}
}