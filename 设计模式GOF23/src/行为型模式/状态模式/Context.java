package 行为型模式.状态模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Context {//房间状态！   维持不同状态间的切换
    //如果是银行系统，这个Context类就是账号。根据金额不同，切换不同的状态！
    private State state;
    public void setState(State s){
        System.out.println("修改状态！");
        state = s;
        state.handle();
    }
}
