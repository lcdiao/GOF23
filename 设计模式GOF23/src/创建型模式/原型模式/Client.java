package ������ģʽ.ԭ��ģʽ;

import java.util.Date;

/**
 * ����ԭ��ģʽ	(ǳ��¡:��JAVA�У�ǳ������ָ��������ֶ�ֵ������ʱ,�ֶ����õĶ��󲻻ᱻ����.����,���һ��������һ��ָ���ַ������ֶ�,�������ǶԸö�������һ��ǳ����,����������������ͬһ���ַ���)
 * @author lcd
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date d = new Date(123123123222L);
		Sheep s1 = new Sheep("����",d);
		System.out.println(s1);					//ԭ��ģʽ.Sheep@7852e922
		System.out.println(s1.getSname());		//����
		System.out.println(s1.getBirthday());	//Mon Nov 26 08:52:03 CST 1973
		
		//��s1Ϊԭ�ͽ��¶���
		Sheep s2 = (Sheep) s1.clone();
		
		//�޸�s1������
		d.setTime(24124124124L);
		System.out.println(s1.getBirthday());	//Wed Oct 07 13:08:44 CST 1970
		
		System.out.println(s2);					//ԭ��ģʽ.Sheep@4e25154f
		System.out.println(s2.getSname());		//����
		System.out.println(s2.getBirthday());	//Wed Oct 07 13:08:44 CST 1970
		s2.setSname("����");
		System.out.println(s2.getSname());		//����
		//	������ͬ��ֵ��ͬ!
	}
}
