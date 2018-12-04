package 创建型模式.工厂模式.抽象工厂模式;

public interface Seat {//座椅
	void massage();
}

class LuxurySear implements Seat{
	@Override
	public void massage() {
		System.out.println("可以自动按摩!");
	}
}

class LowSear implements Seat{
	@Override
	public void massage() {
		System.out.println("不能按摩!");
	}
}