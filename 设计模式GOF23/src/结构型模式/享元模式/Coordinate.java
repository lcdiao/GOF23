package 结构型模式.享元模式;

/**
 * Created by lcd on 2018/12/5.
 */
public class Coordinate {//棋子的坐标类   外部状态UnSharedConcreteFlyWeight
    private int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
