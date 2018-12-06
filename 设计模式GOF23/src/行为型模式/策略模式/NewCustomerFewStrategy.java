package 行为型模式.策略模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折，原价！");
        return standardPrice;
    }
}
