package ��Ϊ��ģʽ.�۲���ģʽobserver;

public class ConcreteSubject extends Subject{
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();//Ŀ�����ֵ�����˱仯��֪ͨ���ԵĹ۲���
    }
}
