package 行为型模式.责任链模式;

/**
 * Created by lcd on 2018/12/5.
 */
public class Director extends Leader{   //主任审批
    public Director(String name) {
        super(name);
    }
    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDay()<3){
            System.out.println("员工："+request.getEmpName()+"请假"+request.getLeaveDay()+"天，理由："+request.getReason());
            System.out.println("主任："+this.name+"审批通过");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.handleRequest(request);//交给后继对象处理
            }
        }
    }
}
