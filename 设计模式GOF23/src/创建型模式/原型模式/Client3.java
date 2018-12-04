package ������ģʽ.ԭ��ģʽ;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * ԭ��ģʽ(���¡:ʹ�����л��ͷ����л�ʵ��)
 * @author lcd
 *
 */
public class Client3 {
	public static void main(String[] args) throws Exception {
		Date d = new Date(123123123222L);
		Sheep s1 = new Sheep("����",d);
		System.out.println(s1);					//ԭ��ģʽ.Sheep@7852e922
		System.out.println(s1.getSname());		//����
		System.out.println(s1.getBirthday());	//Mon Nov 26 08:52:03 CST 1973
		
		//��s1Ϊԭ�ͽ��¶���
//		Sheep s2 = (Sheep) s1.clone();
		//ʹ�����л��ͷ����л�ʵ�����¡
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();	//���л�
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep) ois.readObject();		//�����л�
		
		
		
		//�޸�s1������
		d.setTime(24124124124L);
		System.out.println(s1.getBirthday());	//Wed Oct 07 13:08:44 CST 1970
		
		System.out.println(s2);					//ԭ��ģʽ.Sheep@4e25154f
		System.out.println(s2.getSname());		//����
		System.out.println(s2.getBirthday());	//Mon Nov 26 08:52:03 CST 1973
		s2.setSname("����");
		System.out.println(s2.getSname());		//����
	}
}
