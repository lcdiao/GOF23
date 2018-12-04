package 创建型模式.单例模式.饿汉式;
/**
 * 测试饿汉式单例模式（线程安全，调用效率高！不能延时加载）
 * @author lcd
 *
 */
public class SingletonDemo1 {
	//由于加载这个对象加载类时，天然的是线程安全的
	private static SingletonDemo1 instance = new SingletonDemo1();	//类初始化时，立即加载这个对象(没有延时加载的优势)！
	private SingletonDemo1() {}			//私有化构造器
	
	//方法没有同步，调用效率高
	public static SingletonDemo1 getInstance() {		//返回对象，无论调用几次，返回的对象都是同一个
		return instance;
	}
}
