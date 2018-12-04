package 创建型模式.单例模式;

import java.util.concurrent.CountDownLatch;

import 创建型模式.单例模式.双重检测锁式.SingletonDemo3;
import 创建型模式.单例模式.懒汉式.SingletonDemo2;
import 创建型模式.单例模式.枚举单例.SingletonDemo5;
import 创建型模式.单例模式.静态内部类式.SingletonDemo4;
import 创建型模式.单例模式.饿汉式.SingletonDemo1;

/**
 * 测试多线程环境下五种创建单例模式的效率
 * @author lcd
 *
 */
public class Client3 {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		
		int threadNum = 10;
		//同步辅助类,在完成一组正在其他线程中执行的操作之前，它允许一个或多个线程一直等待
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		//countDown()当前线程调此方法，则计数减一(建议放在finally里执行)
		//await()，调用此方法会一直阻塞当前线程，直到计时器的值为0
		
		for(int j=0;j<threadNum;j++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000000;i++) {
						//Object o = SingletonDemo1.getInstance();	//饿汉式		总耗时:16
						//Object o = SingletonDemo2.getInstance();	//懒汉式		总耗时:120
						//Object o = SingletonDemo3.getInstance();	//双重检测锁式	总耗时:45
						Object o = SingletonDemo4.getInstance();	//静态内部类式	总耗时:25		需要延迟加载用这个
						//Object o = SingletonDemo5.INSTANCE;		//枚举式		总耗时:10		不需要延迟加载用这个
					}
					
					countDownLatch.countDown();//相当于10-1,直到0
					//需要等待线程全部执行完才会继续
				}
			}).start();
		}
		
		countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行!!!
		
		long end = System.currentTimeMillis();
		System.out.println("总耗时:"+(end-start));
	}
}
