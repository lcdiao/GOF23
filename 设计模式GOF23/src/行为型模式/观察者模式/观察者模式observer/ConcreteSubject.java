package 行为型模式.观察者模式.观察者模式observer;

public class ConcreteSubject extends Subject{
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();//目标对象值发生了变化，通知所以的观察者
    }
}
