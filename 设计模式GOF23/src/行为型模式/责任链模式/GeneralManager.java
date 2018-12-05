package 行为型模式.责任链模式;

/**
 * Created by lcd on 2018/12/5.
 */
public class GeneralManager extends Leader{   //总经理审批
    public GeneralManager(String name) {
        super(name);
    }
    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDay()<30){
            System.out.println("员工："+request.getEmpName()+"请假"+request.getLeaveDay()+"天，理由："+request.getReason());
            System.out.println("总经理："+this.name+"审批通过");
        }else{
            System.out.println("请假不通过!");
        }
    }
}
