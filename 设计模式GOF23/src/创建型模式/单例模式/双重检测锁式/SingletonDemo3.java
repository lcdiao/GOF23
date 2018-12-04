package 创建型模式.单例模式.双重检测锁式;
/**
 * 测试双重检查锁式单例模式（由于JVM底层内部模型原因，偶尔会出问题，不建议使用！）
 * @author lcd
 *
 */
public class SingletonDemo3 {
	private static SingletonDemo3 instance;
	private SingletonDemo3() {}			
	
	
	public static SingletonDemo3 getInstance() {		
		if(instance==null) {
			SingletonDemo3 sc;
			synchronized (SingletonDemo3.class) {
				sc=instance;
				if(sc==null) {
					synchronized (SingletonDemo3.class) {
						if(sc==null) {
							sc=new SingletonDemo3();
						}
					}
				}
				instance = sc;
			}
		}
		return instance;	//返回对象，无论调用几次，返回的对象都是同一个(单例)
	}
}
