package ��Ϊ��ģʽ.�۲���ģʽ__obserable���observer�ӿ�;

import java.util.Observable;

//Ŀ�����
public class ConcreteSubject extends Observable {

    private int state;

    public void set(int s){
        state = s;  //Ŀ������״̬�����˱仯

        setChanged();//��ʾĿ������Ѿ����˸���
        notifyObservers(state);//֪ͨ���еĹ۲���
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
