package �ṹ��ģʽ.�Ž�ģʽbridge;
/**
 * Ʒ��
 * @author YY
 *
 */
public interface Brand {
	void sale();
}
class Lenovo implements Brand{
	@Override
	public void sale() {
		System.out.println("�����������");
	}
}
class Dell implements Brand{
	@Override
	public void sale() {
		System.out.println("����Dell����");
	}
}
class Shenzhou implements Brand{
	@Override
	public void sale() {
		System.out.println("�������۵���");
	}
}