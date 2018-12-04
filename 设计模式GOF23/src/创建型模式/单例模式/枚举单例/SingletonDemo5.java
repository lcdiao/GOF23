package 创建型模式.单例模式.枚举单例;
/**
 * 测试枚举式实现单例模式（线程安全，调用效率高！不能延时加载）
 * @author lcd
 *
 */
public enum SingletonDemo5 {
	
	//这个枚举元素，本身就是单例对象！
	INSTANCE;
	
	//添加自己需要的操作
	public void singletonOperation() {
		
	}
}
