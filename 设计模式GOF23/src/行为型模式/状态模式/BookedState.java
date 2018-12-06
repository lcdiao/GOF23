package 行为型模式.状态模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class BookedState implements State{//已预定状态
    @Override
    public void handle() {
        System.out.println("房间已预定！别人不能订");
    }
}
