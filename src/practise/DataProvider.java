package practise;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(priority = -1,dataProvider = "getData" )
	public void MobileLogin(String username,String password)
	{
		System.out.println("Mobile login ");
		System.out.println("username is: "+username);
		System.out.println("password is: "+password);
	}
	
	@Test(priority = 1, enabled = true)
	public void DesktopLogin()
	{
		System.out.println("Desktop login ");
	}
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object [][]data= new Object[3][2];
		data[0][0]="user1";
		data[0][1]="pass1";
		
		data[1][0]="user2";
		data[1][1]="pass2";
		
		data[2][0]="user3";
		data[2][1]="pass3";
		
		return data;
	}
}
