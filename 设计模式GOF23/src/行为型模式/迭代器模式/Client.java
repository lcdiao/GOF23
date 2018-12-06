package 行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.Comparator;
/**
 * Created by lcd on 2018/12/6.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");
        cma.addObject("dd");
        MyIterator iterator = cma.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
