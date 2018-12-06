package 行为型模式.中介者模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Development implements Department {
    private Mediator m;//持有中介者(总经理)的引用
    public Development(Mediator m) {
        this.m = m;
        m.register("development",this);
    }
    @Override
    public void selfAction() {
        System.out.println("研发部：汇报工作！申请资金！");
    }
    @Override
    public void outAction() {
        System.out.println("研发部：专心科研，开发项目");
    }
}
