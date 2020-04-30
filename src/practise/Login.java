package practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@Parameters({"url"})
	@Test(priority = 1, groups = {"smoke"})
	public void WebLogin1(String url_name)
	{
		System.out.println("Web login ");
		System.out.println(url_name);
	}
	
	

	
	@Test(priority = -1)
	public void MobileLogin()
	{
		System.out.println("Mobile login ");
	}
	
	@Test(priority = 1, enabled = false)
	public void DesktopLogin()
	{
		System.out.println("Desktop login ");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("after class");
	}
}
