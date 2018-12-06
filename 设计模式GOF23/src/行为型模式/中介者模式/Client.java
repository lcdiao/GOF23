package 行为型模式.中介者模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();
        Market market = new Market(m);
        Development development = new Development(m);
        Finacial finacial = new Finacial(m);
        market.selfAction();
        market.outAction();
    }
}
