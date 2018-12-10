package 行为型模式.备忘录模式;

/**
 * Created by lcd on 2018/12/10.
 */
public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Emp emp = new Emp("diao",23,-770);
        System.out.println("第一次打印对象:"+emp);
        taker.setMemento(emp.memento());//备忘一次
        emp.setAge(38);
        emp.setSalary(666666);
        System.out.println("第二次打印对象:"+emp);
        emp.recovery(taker.getMemento());//恢复到备忘录对象保存的状态
        System.out.println("第三次打印对象:"+emp);
    }
}
