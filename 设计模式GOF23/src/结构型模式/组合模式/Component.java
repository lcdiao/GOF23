package 结构型模式.组合模式;

/**
 * 抽象组件
 * Created by lcd on 2018/12/4.
 */
public interface Component {
    void operation();
}

//叶子组件
interface Leaf extends Component{

}
//容器组件
interface Composite extends Component{
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}
