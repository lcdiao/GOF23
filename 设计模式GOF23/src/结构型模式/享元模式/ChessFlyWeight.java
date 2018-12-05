package 结构型模式.享元模式;

/**
 * Created by lcd on 2018/12/5.
 */
public interface ChessFlyWeight {   //享元类   围棋棋子
    void setColor(String color);
    String getColor();
    void display(Coordinate c);
}
class ConcreteChess implements ChessFlyWeight{//具体的享元类
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色:"+color+"\t棋子位置:("+c.getX()+","+c.getY()+")");
    }

}
