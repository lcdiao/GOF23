package 行为型模式.命令模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Client {
    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        Invoke i = new Invoke(command);
        i.call();
        //其实就是new Receiver().action(); 但这样在执行前后执行相关的命令，方便扩展！！！
    }
}
