package 创建型模式.建造者模式;

public class SxtAirShipBuilder implements AirShipBuilder{	//StringBuilder，XML解析中，JDOM库中的类:DmoBuilder,SaxBuilder

	@Override
	public Engine builderEngine() {
		System.out.println("构建尚学堂牌发动机!");
		return new Engine("尚学堂牌发动机");//也可跟工厂模式结合起来
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建尚学堂牌轨道舱!");
		return new OrbitalModule("尚学堂牌轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建尚学堂牌逃逸舱!");
		return new EscapeTower("尚学堂牌逃逸舱");
	}

}
