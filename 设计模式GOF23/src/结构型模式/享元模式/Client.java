package 结构型模式.享元模式;

/**
 * Created by lcd on 2018/12/5.
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
        System.out.println(chess1==chess2); //true

        System.out.println("===========增加外部状态的处理=============");
        chess1.display(new Coordinate(10,10));
        chess1.display(new Coordinate(20,20));
    }
}
