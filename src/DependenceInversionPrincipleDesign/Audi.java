package DependenceInversionPrincipleDesign;

/**
 * 奥迪车的类实现汽车的接口，重写run()方法
 * Created by ChuPeng on 2017/2/19.
 */

public class Audi implements ICar 
{
	public void run() 
	{
		System.out.println("奥迪车开始启动...");
	}
}
