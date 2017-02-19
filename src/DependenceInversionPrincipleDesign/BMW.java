package DependenceInversionPrincipleDesign;

/**
 * 宝马车的类实现汽车的接口，重写run()方法
 * Created by ChuPeng on 2017/2/19.
 */

public class BMW implements ICar
{
	public void run() 
	{
		System.out.println("宝马车开始启动...");
	}

}
