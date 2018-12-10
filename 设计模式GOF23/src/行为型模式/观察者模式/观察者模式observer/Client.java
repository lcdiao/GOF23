package 行为型模式.观察者模式.观察者模式observer;

public class Client {
    public static void main(String[] args) {
        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建多个观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //加入subject对象的观察者队列
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
        //改变subject的状态
        subject.setState(300);
        System.out.println("##############");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
        subject.setState(3240);
        System.out.println("##############");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());


    }
}
