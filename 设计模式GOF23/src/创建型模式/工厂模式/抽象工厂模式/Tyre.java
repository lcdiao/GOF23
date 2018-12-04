package 创建型模式.工厂模式.抽象工厂模式;

public interface Tyre {
	void revolve();
}
class LuxuryTyre implements Tyre{
	@Override
	public void revolve() {
		System.out.println("旋转不磨损！");
	}
}
class LowTyre implements Tyre{
	@Override
	public void revolve() {
		System.out.println("旋转快！");
	}
}