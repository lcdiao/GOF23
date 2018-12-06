package 行为型模式.状态模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new FreeState());
        context.setState(new BookedState());
    }
}
