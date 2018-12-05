package 结构型模式.享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lcd on 2018/12/5.
 */
public class ChessFlyWeightFactory {//享元工厂类
    private static Map<String,ChessFlyWeight> map = new HashMap<>();    //享元池
    public static ChessFlyWeight getChess(String color){
        if(map.get(color)!=null){
            return map.get(color);
        }else{
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color,cfw);
            return cfw;
        }
    }
}
