package 创建型模式.工厂模式.抽象工厂模式;

public interface CarFactory {//发动机、座椅、轮胎组成一个产品族
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
