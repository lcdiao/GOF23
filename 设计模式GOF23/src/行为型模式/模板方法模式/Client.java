package 行为型模式.模板方法模式;

/**
 * Created by lcd on 2018/12/6.
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMoney();
        btm.process();
        //采用匿名内部类
        new BankTemplateMethod(){@Override
        public void transact() {
            System.out.println("我要存款");
        }}.process();
        new BankTemplateMethod(){@Override
        public void transact() {
            System.out.println("我要理财！！！！");
        }}.process();
    }
}
class DrawMoney extends BankTemplateMethod{
    @Override
    public void transact() {
        System.out.println("我要取款!!!");
    }
}
