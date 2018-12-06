package 行为型模式.中介者模式;

/**
 * Created by lcd on 2018/12/6.
 */
public interface Department {//同事类的接口
    void selfAction();//做本部门的事情
    void outAction();//向总经理(中介者)发出申请
}
