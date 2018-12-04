package ������ģʽ.����ģʽ.���󹤳�ģʽ;

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

