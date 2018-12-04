package 创建型模式.工厂模式.抽象工厂模式;

public class LowCarFactory implements CarFactory{
	@Override
	public Engine createEngine() {
		return new LowEngine();
	}
	@Override
	public Seat createSeat() {
		return new LowSear();
	}
	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}
}
