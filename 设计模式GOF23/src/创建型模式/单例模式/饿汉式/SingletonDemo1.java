package ������ģʽ.����ģʽ.����ʽ;
/**
 * ���Զ���ʽ����ģʽ���̰߳�ȫ������Ч�ʸߣ�������ʱ���أ�
 * @author lcd
 *
 */
public class SingletonDemo1 {
	//���ڼ���������������ʱ����Ȼ�����̰߳�ȫ��
	private static SingletonDemo1 instance = new SingletonDemo1();	//���ʼ��ʱ�����������������(û����ʱ���ص�����)��
	private SingletonDemo1() {}			//˽�л�������
	
	//����û��ͬ��������Ч�ʸ�
	public static SingletonDemo1 getInstance() {		//���ض������۵��ü��Σ����صĶ�����ͬһ��
		return instance;
	}
}
