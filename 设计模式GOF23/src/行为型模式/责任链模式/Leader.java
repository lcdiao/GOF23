package 行为型模式.责任链模式;

/**
 * Created by lcd on 2018/12/5.
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;//责任链上的后继对象
    public void setNextLeader(Leader nextLeader) { //设置责任链上的后继对象
        this.nextLeader = nextLeader;
    }
    public Leader(String name) {
        this.name = name;
    }
    /**处理请求的核心业务方法*/
    public abstract void handleRequest(LeaveRequest request);
}
