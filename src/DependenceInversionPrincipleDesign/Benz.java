package DependenceInversionPrincipleDesign;

/**
 * 奔驰车的类实现汽车的接口，重写run()方法
 * Created by ChuPeng on 2017/2/19.
 */

public class Benz implements ICar
{
	public void run() 
	{
		System.out.println("奔驰车开始启动...");
	}
}
