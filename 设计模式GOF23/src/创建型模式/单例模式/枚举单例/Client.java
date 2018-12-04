package 创建型模式.单例模式.枚举单例;

public class Client {
	public static void main(String[] args) {
		SingletonDemo5 instance = SingletonDemo5.INSTANCE;
		instance.singletonOperation();
	}
}
