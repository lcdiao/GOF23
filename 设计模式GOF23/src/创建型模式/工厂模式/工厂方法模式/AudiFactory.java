package ������ģʽ.����ģʽ.��������ģʽ;

public class AudiFactory implements CarFactory{
	@Override
	public Car createCar() {
		return new Audi();
	}
}
