package 行为型模式.中介者模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Finacial implements Department {
    private Mediator m;//持有中介者(总经理)的引用
    public Finacial(Mediator m) {
        this.m = m;
        m.register("finacial",this);
    }
    @Override
    public void selfAction() {
        System.out.println("财务部：汇报工作！给钱！");
    }
    @Override
    public void outAction() {
        System.out.println("财务部：数钱！");
    }
}
