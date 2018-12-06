package 行为型模式.中介者模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Market implements Department {
    private Mediator m;//持有中介者(总经理)的引用
    public Market(Mediator m) {
        this.m = m;
        m.register("market",this);
    }
    @Override
    public void selfAction() {
        System.out.println("市场部：汇报工作！项目 承接的进度！申请资金！");
        m.command("finacial");
    }
    @Override
    public void outAction() {
        System.out.println("市场部：跑去接项目！");
    }
}
