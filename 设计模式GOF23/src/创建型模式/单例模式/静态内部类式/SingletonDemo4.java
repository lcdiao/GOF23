package ������ģʽ.����ģʽ.��̬�ڲ���ʽ;
/**
 * ���Ծ�̬�ڲ���ʽ����ģʽ���̰߳�ȫ������Ч�ʸߣ�����ʱ���أ�
 * @author lcd
 *
 */
public class  SingletonDemo4 {
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	private SingletonDemo4() {}			//˽�л�������
	
	public static SingletonDemo4 getInstance() {		
		return SingletonClassInstance.instance;
	}
}
