package ������ģʽ.����ģʽ.�򵥹���ģʽ;
/**
 * �򵥹�����
 * @author lcd
 *
 */
public class CarFactory {
	
	public static Car createCar(String type) {
		if("�µ�".equals(type)) {
			return new Audi();
		}else if("���ǵ�".equals(type)) {
			return new Byd();
		}else {
			return null;
		}//С����:Υ������ԭ��:���������������Car��Ҫ�޸Ĵ���
	}
}
