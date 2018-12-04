package ������ģʽ.����ģʽ.��ֹ����ͷ����л�©��;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ��������ʽ����ģʽ����η�ֹ����ͷ����л�©����
 * @author lcd
 *
 */
public class SingletonDemo6 implements Serializable{
	private static SingletonDemo6 instance;//���ʼ��ʱ������ʼ���������(��ʱ���أ������õ�ʱ���ڴ���)
	SingletonDemo6() {	//˽�л�������
		if(instance!=null) {	//��ֹ��������Ȩ�޼�飡��������
			throw new RuntimeException();	//��ε���ֱ���׳��쳣
		}
	}			
	
	//����ͬ��������Ч�ʵ�
	public static SingletonDemo6 getInstance() {		
		if(instance==null) {
			instance = new SingletonDemo6();
		}
		return instance;	//���ض������۵��ü��Σ����صĶ�����ͬһ��(����)
	}
	
	//�����л�ʱ�����������readResolve()��ֱ�ӷ��ظ÷���ָ���Ķ��󡣶�����Ҫ�����ڴ����¶���
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
