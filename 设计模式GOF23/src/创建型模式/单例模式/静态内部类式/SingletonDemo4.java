package 创建型模式.单例模式.静态内部类式;
/**
 * 测试静态内部类式单例模式（线程安全，调用效率高！能延时加载）
 * @author lcd
 *
 */
public class  SingletonDemo4 {
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	private SingletonDemo4() {}			//私有化构造器
	
	public static SingletonDemo4 getInstance() {		
		return SingletonClassInstance.instance;
	}
}
