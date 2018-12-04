package 创建型模式.原型模式;

import java.util.Date;

public class Sheep2 implements Cloneable{
	private String sname;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();	//直接调用Object对象的clone()方法
		
		//添加如下代码实现深克隆(deep clone)
		Sheep2 s = (Sheep2)obj;
		s.birthday = (Date) this.birthday.clone();//把属性也进行克隆!!!
		
		return obj;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Sheep2(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	public Sheep2() {
		
	}
}
