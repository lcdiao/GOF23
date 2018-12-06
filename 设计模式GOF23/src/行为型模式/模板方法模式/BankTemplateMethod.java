package 行为型模式.模板方法模式;

/**
 * Created by lcd on 2018/12/6.
 */
public abstract class BankTemplateMethod {
    public void takeNumber(){System.out.println("取号排队");}//具体方法
    public abstract void transact();//办理具体的业务   钩子方法
    public void evaluate(){System.out.println("反馈评分");}
    public final void process(){//模板方法
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
