package 行为型模式.策略模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八折");
        return standardPrice*0.8;
    }
}
