package ������ģʽ.������ģʽ;

public class SxtAirShipBuilder implements AirShipBuilder{	//StringBuilder��XML�����У�JDOM���е���:DmoBuilder,SaxBuilder

	@Override
	public Engine builderEngine() {
		System.out.println("������ѧ���Ʒ�����!");
		return new Engine("��ѧ���Ʒ�����");//Ҳ�ɸ�����ģʽ�������
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("������ѧ���ƹ����!");
		return new OrbitalModule("��ѧ���ƹ����");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("������ѧ�������ݲ�!");
		return new EscapeTower("��ѧ�������ݲ�");
	}

}
