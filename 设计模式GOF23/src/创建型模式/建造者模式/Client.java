package ������ģʽ.������ģʽ;

public class Client {
	public static void main(String[] args) {
		
		AirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());
		
		AirShip ship = director.directorAirShip();
		
		System.out.println(ship.getEngine().getName());
		
		ship.launch();
	}
}
