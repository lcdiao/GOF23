package 行为型模式.备忘录模式;


import java.util.Stack;

/**
 * 负责人类----负责管理备忘录对象
 * Created by lcd on 2018/12/10.
 */
public class CareTaker {
    private EmpMemento memento;
    //private Stack<EmpMemento> stack;      //备忘点较多时压栈

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
