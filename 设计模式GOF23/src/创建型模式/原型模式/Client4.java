package 创建型模式.原型模式;
/**
 * 测试普通new方式创建对象和clone方式创建对象的效率差异!
 * 如果需要短时间创建大量对象，并且new的过程比较耗时。则可以考虑使用原型模式!
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
		System.out.println("new的方式耗时:"+(end-start));
	}
	public static void testClone(int size) throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		Laptop t = new Laptop();
		for(int i=0;i<size;i++) {
			Laptop temp = (Laptop) t.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("clone的方式耗时:"+(end-start));
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		testNew(1000);		//new的方式耗时:10010
		testClone(1000);	//clone的方式耗时:10
		//当创建对象耗时久时用clone可以极大节省时间!!!!!!!!!
	}
}



class Laptop implements Cloneable{//笔记本电脑
	public Laptop(){
		try {
			Thread.sleep(10);	//模拟创建对象耗时的过程!
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