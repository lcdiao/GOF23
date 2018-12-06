package 行为型模式.中介者模式;

/**
 * Created by lcd on 2018/12/6.
 */
public interface Mediator {
    void register(String dname,Department department);
    void  command(String dname);
}
