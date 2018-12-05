package 结构型模式.装饰模式;

/**
 * Created by lcd on 2018/12/5.
 */
public interface ICar {//抽象构件
    void move();
}
class Car implements ICar{  //真实对象:具体构件
    @Override
    public void move() {
        System.out.println("陆地上跑！");
    }
}

class SuperCar implements ICar{//Decorator装饰角色
    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }
    @Override
    public void move() {
        car.move();
    }
}
class FlyCar extends SuperCar{  //ConcreteDecorator具体装饰角色
    public FlyCar(ICar car) {
        super(car);
    }
    public void fly(){
        System.out.println("天上飞!");
    }
    @Override
    public void move(){
        super.move();
        fly();
    }
}
class WaterCar extends SuperCar{  //ConcreteDecorator具体装饰角色
    public WaterCar(ICar car) {
        super(car);
    }
    public void swim(){
        System.out.println("水上游!");
    }
    @Override
    public void move(){
        super.move();
        swim();
    }
}
class AICar extends SuperCar{  //ConcreteDecorator具体装饰角色
    public AICar(ICar car) {
        super(car);
    }
    public void autoMove(){
        System.out.println("自动跑!");
    }
    @Override
    public void move(){
        super.move();
        autoMove();
    }
}
