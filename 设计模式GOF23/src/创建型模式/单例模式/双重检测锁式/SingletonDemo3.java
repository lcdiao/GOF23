package ������ģʽ.����ģʽ.˫�ؼ����ʽ;
/**
 * ����˫�ؼ����ʽ����ģʽ������JVM�ײ��ڲ�ģ��ԭ��ż��������⣬������ʹ�ã���
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
		return instance;	//���ض������۵��ü��Σ����صĶ�����ͬһ��(����)
	}
}
