package 创建型模式.工厂模式.抽象工厂模式;

public class Client {
	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.run();
		e.start();
	}
}
