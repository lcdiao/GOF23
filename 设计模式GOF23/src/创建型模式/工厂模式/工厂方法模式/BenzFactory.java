package ������ģʽ.����ģʽ.��������ģʽ;

public class BenzFactory implements CarFactory{
	@Override
	public Car createCar() {
		return new Benz();
	}
}
