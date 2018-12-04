package 结构型模式.桥接模式bridge;

public class Client {
	public static void main(String[] args) {
		//销售联想的笔记本电脑
		Computer2 c = new Laptop2(new Lenovo());
		c.sale();
		
		 c = new Desktop2(new Shenzhou());
		 c.sale();
	}
}
