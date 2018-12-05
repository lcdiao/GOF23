package 结构型模式.装饰模式;

/**
 * Created by lcd on 2018/12/5.
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("增加新的功能，飞行----------");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("再增加新的功能,水里游---------");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
    }
}
