package 行为型模式.状态模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class CheckedInState implements State{//已入住状态
    @Override
    public void handle() {
        System.out.println("房间已被人入住！请勿打扰！");
    }
}
