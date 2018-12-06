package 行为型模式.策略模式;

/**
 * Created by lcd on 2018/12/6.
 */
public interface Strategy {//所有实现该接口的类构成算法族
    public double getPrice(double standardPrice);
}
