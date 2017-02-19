package CommonDesign;

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
		//司机开动奔驰
		driver.dirve(benz);
	}
}