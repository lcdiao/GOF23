package 创建型模式.建造者模式;

public class Client {
	public static void main(String[] args) {
		
		AirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());
		
		AirShip ship = director.directorAirShip();
		
		System.out.println(ship.getEngine().getName());
		
		ship.launch();
	}
}
