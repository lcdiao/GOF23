package ������ģʽ.����ģʽ;

import ������ģʽ.����ģʽ.ö�ٵ���.SingletonDemo5;
import ������ģʽ.����ģʽ.����ʽ.SingletonDemo1;

public class Client {
	public static void main(String[] args) {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		System.out.println(s1);			//����ģʽ.����ʽ.SingletonDemo1@7852e922
		System.out.println(s2);			//����ģʽ.����ʽ.SingletonDemo1@7852e922
		System.out.println(s1==s2);		//true
		
		
		SingletonDemo5 s3 = SingletonDemo5.INSTANCE;
		SingletonDemo5 s4 = SingletonDemo5.INSTANCE;
		System.out.println(s3);			//INSTANCE
		System.out.println(s4);			//INSTANCE
		System.out.println(s3==s4);		//true
	}
}
