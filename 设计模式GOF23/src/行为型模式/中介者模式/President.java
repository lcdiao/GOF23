package 行为型模式.中介者模式;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lcd on 2018/12/6.
 */
public class President implements Mediator{
    private Map<String,Department> map = new HashMap<>();
    @Override
    public void register(String dname, Department department) {
        map.put(dname,department);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}
