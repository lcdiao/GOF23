package ������ģʽ.����ģʽ.��������ģʽ;

public class BydFactory implements CarFactory{
	@Override
	public Car createCar() {
		return new Byd();
	}
}
