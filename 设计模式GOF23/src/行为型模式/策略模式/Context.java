package 行为型模式.策略模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Context {//负责和具体的策略类交互，这样的话，具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端独立的变化
    private Strategy strategy;//当前采用的算法对象
    public Context(Strategy strategy) {//通过构造器来注入
        this.strategy = strategy;
    }
    public void printPrice(double s){
        System.out.println("原价："+s+",报价："+strategy.getPrice(s));
    }
}
