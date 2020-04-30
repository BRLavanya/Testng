package practise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logout {
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
	}
	@Test
	public void WebLogout()
	{
		System.out.println("Web Logout ");
	}
	@Test
	public void WebLogout1()
	{
		System.out.println("Web Logout ");
	}
	@Test(groups = {"smoke"})
	public void WebLogout2()
	{
		System.out.println("Web Logout ");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	@Test
	public void MobileLogout()
	{
		System.out.println("Mobile Logout ");
	}
	
	@Test
	public void DesktopLogout()
	{
		System.out.println("Desktop Logout ");
	}
	@AfterSuite()
	public void beforeSuite()
	{
		System.out.println("After suite");
	}
}
