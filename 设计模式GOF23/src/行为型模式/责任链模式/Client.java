package 行为型模式.责任链模式;

/**
 * Created by lcd on 2018/12/5.
 */
public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");
        //组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(c);
        //开启请假请求
        LeaveRequest req1 = new LeaveRequest("TOM",10,"世界那么大。。。");
        a.handleRequest(req1);
    }
}
