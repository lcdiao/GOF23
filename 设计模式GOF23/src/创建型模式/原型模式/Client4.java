package ������ģʽ.ԭ��ģʽ;
/**
 * ������ͨnew��ʽ���������clone��ʽ���������Ч�ʲ���!
 * �����Ҫ��ʱ�䴴���������󣬲���new�Ĺ��̱ȽϺ�ʱ������Կ���ʹ��ԭ��ģʽ!
 * @author lcd
 *
 */
public class Client4 {
	public static void testNew(int size) {
		long start = System.currentTimeMillis();
		for(int i=0;i<size;i++) {
			Laptop t = new Laptop();
		}
		long end = System.currentTimeMillis();
		System.out.println("new�ķ�ʽ��ʱ:"+(end-start));
	}
	public static void testClone(int size) throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		Laptop t = new Laptop();
		for(int i=0;i<size;i++) {
			Laptop temp = (Laptop) t.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("clone�ķ�ʽ��ʱ:"+(end-start));
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		testNew(1000);		//new�ķ�ʽ��ʱ:10010
		testClone(1000);	//clone�ķ�ʽ��ʱ:10
		//�����������ʱ��ʱ��clone���Լ����ʡʱ��!!!!!!!!!
	}
}



class Laptop implements Cloneable{//�ʼǱ�����
	public Laptop(){
		try {
			Thread.sleep(10);	//ģ�ⴴ�������ʱ�Ĺ���!
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}