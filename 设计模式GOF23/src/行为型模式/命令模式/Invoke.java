package 行为型模式.命令模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Invoke {//调用者/发起者
    private Command command;//也可以通过容器List<Command>容纳很多命令对象，进行批处理。数据库底层的事务管理就是类似的结构！
    public Invoke(Command command) {
        this.command = command;
    }
    public void call(){//业务方法，用于调用命令类的方法
        command.execute();
    }
}
