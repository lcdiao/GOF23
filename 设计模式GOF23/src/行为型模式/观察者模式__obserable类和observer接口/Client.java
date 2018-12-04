package 行为型模式.观察者模式__obserable类和observer接口;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //将观察者对象添加到目标对象subject的观察者容器种
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);

        //改变subject的状态
        subject.set(3000);
        System.out.println("====================");
        //观察者的状态发生了变化
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
        subject.set(6666);
        System.out.println("====================");
        //观察者的状态发生了变化
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

    }
}
