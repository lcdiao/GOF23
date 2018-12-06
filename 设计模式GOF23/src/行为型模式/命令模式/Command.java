package 行为型模式.命令模式;

/**
 * Created by lcd on 2018/12/6.
 */
public interface Command {
    /**
     * 这个方法是一个返回结果为空的方法。
     * 实际项目中，科研根据需求设计多个不同的方法
     */
    void execute();
}
class ConcreteCommand implements Command{
    private Receiver receiver;//命令的真正执行者
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        //命令真正执行前或后，执行相关的命令
        receiver.action();
    }
}