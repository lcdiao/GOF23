package 行为型模式.迭代器模式;

/**
 * Created by lcd on 2018/12/6.
 */
public interface MyIterator {
    void first();         //将游标指向第一个元素
    void next();          //将游标指向下一个元素
    boolean hasNext();
    boolean isFirst();
    boolean isLast();
    Object getCurrentObj();//获取当前游标指定的对象
}
