package 创建型模式.工厂模式.抽象工厂模式;

import java.awt.image.Kernel;

public class LuxuryCarFactory implements CarFactory{
	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}
	@Override
	public Seat createSeat() {
		return new LuxurySear();
	}
	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}
}

