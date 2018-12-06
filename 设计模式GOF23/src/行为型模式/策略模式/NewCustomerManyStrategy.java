package 行为型模式.策略模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打九折");
        return standardPrice*0.9;
    }
}
