package ������ģʽ.������ģʽ;

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
		
		//���óɷɴ�����
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		
		return ship;
	}

}
