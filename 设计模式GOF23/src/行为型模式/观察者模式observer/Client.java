package ��Ϊ��ģʽ.�۲���ģʽobserver;

public class Client {
    public static void main(String[] args) {
        //Ŀ�����
        ConcreteSubject subject = new ConcreteSubject();

        //��������۲���
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //����subject����Ĺ۲��߶���
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);

        //�ı�subject��״̬
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
