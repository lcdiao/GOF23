package ������ģʽ.����ģʽ.���󹤳�ģʽ;

public interface Seat {//����
	void massage();
}

class LuxurySear implements Seat{
	@Override
	public void massage() {
		System.out.println("�����Զ���Ħ!");
	}
}

class LowSear implements Seat{
	@Override
	public void massage() {
		System.out.println("���ܰ�Ħ!");
	}
}