package ������ģʽ.����ģʽ.����ʽ;
/**
 * ��������ʽ����ģʽ���̰߳�ȫ������Ч�ʲ��ߣ�����ʱ���أ�
 * @author lcd
 *
 */
public class SingletonDemo2 {
	private static SingletonDemo2 instance;//���ʼ��ʱ������ʼ���������(��ʱ���أ������õ�ʱ���ڴ���)
	private SingletonDemo2() {}			//˽�л�������
	
	//����ͬ��������Ч�ʵ�
	public static synchronized SingletonDemo2 getInstance() {
		if(instance==null) {
			instance = new SingletonDemo2();
		}
		return instance;	//���ض������۵��ü��Σ����صĶ�����ͬһ��(����)
	}
}
