package ������ģʽ.����ģʽ;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.lang.reflect.Constructor;

import ������ģʽ.����ģʽ.��ֹ����ͷ����л�©��.SingletonDemo6;

/**
 * ���Է���ͷ����л��ƽⵥ��ģʽ
 * @author lcd
 *
 */
public class Client2 {
	public static void main(String[] args) throws Exception {
		SingletonDemo6 s1 = SingletonDemo6.getInstance();
		SingletonDemo6 s2 = SingletonDemo6.getInstance();
		System.out.println(s1);			//����ģʽ.��ֹ����ͷ����л�©��.SingletonDemo6@7852e922
		System.out.println(s2);			//����ģʽ.��ֹ����ͷ����л�©��.SingletonDemo6@7852e922
		System.out.println(s1==s2);		//true
		
		//ͨ������ķ�ʽֱ�ӵ���˽�й�����
//		Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("����ģʽ.��ֹ����ͷ����л�©��.SingletonDemo6");
//		
//		Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
//		
//		c.setAccessible(true); 	//����Ȩ�޵ļ��
//		
//		SingletonDemo6 s3 = c.newInstance();
//		SingletonDemo6 s4 = c.newInstance();
//		
//		System.out.println(s3);		//����ģʽ.��ֹ����ͷ����л�©��.SingletonDemo6@4e25154f
//		System.out.println(s4);		//����ģʽ.��ֹ����ͷ����л�©��.SingletonDemo6@70dea4e
//		System.out.println(s3==s4);	//false
		
		/*û��ֹ����Ľ��:
	 	����ģʽ.��ֹ����ͷ����л�©��.SingletonDemo6@4e25154f
	 	����ģʽ.��ֹ����ͷ����л�©��.SingletonDemo6@70dea4e
	 	false	
	 	
	 ���Ϸ�ֹ������׳��쳣	
	 SingletonDemo6() {	//˽�л�������
		if(instance!=null) {
			throw new RuntimeException();	//��ε���ֱ���׳��쳣
		}
	}	
	 */
		
		
		
		//ͨ�������л��ķ�ʽ����������
		//���л�
		FileOutputStream fos = new FileOutputStream("d:/myjava/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);	//	������s1�浽d:/myjava/a.txt
		oos.close();
		fos.close();
		
		//�����л�
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/myjava/a.txt"));
		SingletonDemo6 s3 = (SingletonDemo6) ois.readObject();
		System.out.println(s3);		
		System.out.println(s1==s3);		
		/*
		//�����л�ʱ�����������readResolve()��ֱ�ӷ��ظ÷���ָ���Ķ��󡣶�����Ҫ�����ڴ����¶���
		private Object readResolve() throws ObjectStreamException{
			return instance;
		}
		
		���ϸ÷���ǰ�Ľ����
		����ģʽ.��ֹ����ͷ����л�©��.SingletonDemo6@776ec8df
		false		�����л��������ͬ������������
		
		���ϸ÷�����Ľ����
		����ģʽ.��ֹ����ͷ����л�©��.SingletonDemo6@7852e922
		true
		 */
	}
}
