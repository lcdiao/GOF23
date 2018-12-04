package 创建型模式.建造者模式;

public class SxtAirShipDirector implements AirShipDirector{
	
	private AirShipBuilder builder;
	
	
	public SxtAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}



	@Override
	public AirShip directorAirShip() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		//配置成飞船对象
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		
		return ship;
	}

}
