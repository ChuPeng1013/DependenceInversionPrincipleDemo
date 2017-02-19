package DependenceInversionPrincipleDesign;

/**
 * 具体实现的类
 * Created by ChuPeng on 2017/2/19.
 */

public class Client 
{
	public static void main(String[] args) 
	{
		Driver driver = new Driver();
		Benz benz = new Benz();
		BMW bmw = new BMW();
		Audi audi = new Audi();
		driver.driver(benz);
		driver.driver(bmw);
		driver.driver(audi);
	}
}
