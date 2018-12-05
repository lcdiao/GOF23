package 行为型模式.观察者模式.观察者模式observer;

public class ObserverA implements Observer {
    private int myState;//myState需要跟目标对象的state值保存一致
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
