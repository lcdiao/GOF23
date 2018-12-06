package 行为型模式.策略模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Client {
    public static void main(String[] args) {
        Strategy s1 = new OldCustomerFewStrategy();
        Context ctx = new Context(s1);
        ctx.printPrice(998);
    }
}
