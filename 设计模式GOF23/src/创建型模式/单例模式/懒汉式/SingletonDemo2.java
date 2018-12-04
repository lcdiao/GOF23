package 创建型模式.单例模式.懒汉式;
/**
 * 测试懒汉式单例模式（线程安全，调用效率不高！能延时加载）
 * @author lcd
 *
 */
public class SingletonDemo2 {
	private static SingletonDemo2 instance;//类初始化时，不初始化这个对象(延时加载，真正用的时候在创建)
	private SingletonDemo2() {}			//私有化构造器
	
	//方法同步，调用效率低
	public static synchronized SingletonDemo2 getInstance() {
		if(instance==null) {
			instance = new SingletonDemo2();
		}
		return instance;	//返回对象，无论调用几次，返回的对象都是同一个(单例)
	}
}
