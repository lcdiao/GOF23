package 行为型模式.备忘录模式;

/**
 * 源发器类
 * Created by lcd on 2018/12/10.
 */
public class Emp {
    private String ename;
    private int age;
    private double salary;

    //进行备忘操作,并返回备忘录对象
    public EmpMemento memento(){
        return new EmpMemento(this);
    }
    //进行数据恢复，恢复成指定备忘录对象的值
    public void recovery(EmpMemento mmt){
        this.ename = mmt.getEname();
        this.age = mmt.getAge();
        this.salary = mmt.getSalary();
    }


    public Emp(){}
    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
