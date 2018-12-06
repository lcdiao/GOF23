package 行为型模式.命令模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Receiver {//真正命令的执行者
    public void action(){
        System.out.println("Receiver.action()");
    }
}
