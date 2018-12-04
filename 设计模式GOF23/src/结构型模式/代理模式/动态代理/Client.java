package 结构型模式.代理模式.动态代理;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
		proxy.sing();
		/*
		 结果：
		 	真正的方法执行前:
			面谈，签合同，预付款，订机票
			RealStar.sing()
			真实角色唱歌
			真正的方法执行后:
			收尾款
		 */
	}
}
