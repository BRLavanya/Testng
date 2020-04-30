package practise;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo
{
	@BeforeSuite()
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	@Test(dependsOnMethods = "demo1",timeOut = 4000,invocationCount = 2,alwaysRun = true)
	public void demo()
	{
		System.out.println("hello world");
	}
	
	@Test(description = "testing description",successPercentage = 100)
	public void demo1()
	{
		System.out.println("bye");
		assertTrue(false);
	
	}
}
