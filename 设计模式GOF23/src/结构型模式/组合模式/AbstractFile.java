package 结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象构建
 * Created by lcd on 2018/12/4.
 */
public interface AbstractFile {
    void killVirus();   //杀毒
}

class ImageFile implements AbstractFile{    //相当于Leaf（叶子组件）
    private String name;
    public ImageFile(String name){
        super();
        this.name=name;
    }

    @Override
    public void killVirus() {    //相当于Leaf（叶子组件）
        System.out.println("----图像文件:"+name+",进行查杀！");
    }
}
class TextFile implements AbstractFile{
    private String name;
    public TextFile(String name){
        super();
        this.name=name;
    }

    @Override
    public void killVirus() {    //相当于Leaf（叶子组件）
        System.out.println("----文本文件:"+name+",进行查杀！");
    }
}
class VideoFile implements AbstractFile{
    private String name;
    public VideoFile(String name){
        super();
        this.name=name;
    }

    @Override
    public void killVirus() {
        System.out.println("----视频文件:"+name+",进行查杀！");
    }
}

class Folder implements AbstractFile{                   //相当于容器组件
    private String name;
    //定义容器，用来存放本容器构建下的子节点
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    public void add(AbstractFile file){
        list.add(file);
    }
    public void remove(AbstractFile file){
        list.remove(file);
    }
    public AbstractFile getChild(int index){
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("----文件夹:"+name+"，进行查杀!");
        list.forEach(AbstractFile::killVirus);//递归
    }
}