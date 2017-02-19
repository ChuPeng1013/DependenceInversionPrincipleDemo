package DependenceInversionPrincipleDesign;

/**
 * 司机的类实现司机的接口，重写driver()方法
 * Created by ChuPeng on 2017/2/19.
 */

public class Driver implements IDriver
{
	public void driver(ICar car) 
	{
		car.run();
	}

}
