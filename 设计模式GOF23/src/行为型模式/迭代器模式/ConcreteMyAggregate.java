package 行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 * Created by lcd on 2018/12/6.
 */
public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<>();

    public void addObject(Object obj){
        this.list.add(obj);
    }
    public void removeObject(Object obj){
        this.list.remove(obj);
    }
    public List<Object> getList() {
        return list;
    }
    public void setList(List<Object> list) {
        this.list = list;
    }
    public MyIterator createIterator(){//获得迭代器
        return new ConcreteIterator();
    }
    //使用内部类定义迭代器，可以直接使用外部类的属性
    private class ConcreteIterator implements MyIterator{
        private int cursor;//定义游标，记录遍历时的位置
        @Override
        public void first() {
            cursor=0;
        }
        @Override
        public void next() {
            if(hasNext())
                cursor++;
        }

        @Override
        public boolean hasNext() {
            return cursor!=list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor==0;
        }

        @Override
        public boolean isLast() {
            return cursor==list.size()-1;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
