package ������ģʽ.����ģʽ.���󹤳�ģʽ;

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
