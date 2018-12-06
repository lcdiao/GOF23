package 行为型模式.状态模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class FreeState implements State{//空闲状态
    @Override
    public void handle() {
        System.out.println("房间空闲，没人住！");
    }
}
