package ��Ϊ��ģʽ.�۲���ģʽobserver;

public class ObserverA implements Observer {
    private int myState;//myState��Ҫ��Ŀ������stateֵ����һ��
    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
