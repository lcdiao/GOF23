package ������ģʽ.����ģʽ;

import java.util.concurrent.CountDownLatch;

import ������ģʽ.����ģʽ.˫�ؼ����ʽ.SingletonDemo3;
import ������ģʽ.����ģʽ.����ʽ.SingletonDemo2;
import ������ģʽ.����ģʽ.ö�ٵ���.SingletonDemo5;
import ������ģʽ.����ģʽ.��̬�ڲ���ʽ.SingletonDemo4;
import ������ģʽ.����ģʽ.����ʽ.SingletonDemo1;

/**
 * ���Զ��̻߳��������ִ�������ģʽ��Ч��
 * @author lcd
 *
 */
public class Client3 {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		
		int threadNum = 10;
		//ͬ��������,�����һ�����������߳���ִ�еĲ���֮ǰ��������һ�������߳�һֱ�ȴ�
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		//countDown()��ǰ�̵߳��˷������������һ(�������finally��ִ��)
		//await()�����ô˷�����һֱ������ǰ�̣߳�ֱ����ʱ����ֵΪ0
		
		for(int j=0;j<threadNum;j++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000000;i++) {
						//Object o = SingletonDemo1.getInstance();	//����ʽ		�ܺ�ʱ:16
						//Object o = SingletonDemo2.getInstance();	//����ʽ		�ܺ�ʱ:120
						//Object o = SingletonDemo3.getInstance();	//˫�ؼ����ʽ	�ܺ�ʱ:45
						Object o = SingletonDemo4.getInstance();	//��̬�ڲ���ʽ	�ܺ�ʱ:25		��Ҫ�ӳټ��������
						//Object o = SingletonDemo5.INSTANCE;		//ö��ʽ		�ܺ�ʱ:10		����Ҫ�ӳټ��������
					}
					
					countDownLatch.countDown();//�൱��10-1,ֱ��0
					//��Ҫ�ȴ��߳�ȫ��ִ����Ż����
				}
			}).start();
		}
		
		countDownLatch.await();	//main�߳�������ֱ����������Ϊ0���Ż��������ִ��!!!
		
		long end = System.currentTimeMillis();
		System.out.println("�ܺ�ʱ:"+(end-start));
	}
}
