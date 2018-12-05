package 行为型模式.责任链模式;

/**
 * Created by lcd on 2018/12/5.
 */
public class LeaveRequest {//封装请假的基本信息
    private String empName;
    private int leaveDay;
    private String reason;

    public LeaveRequest(String empName, int leaveDay, String reason) {
        this.empName = empName;
        this.leaveDay = leaveDay;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(int leaveDay) {
        this.leaveDay = leaveDay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
