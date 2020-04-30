package practise;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test");
	}
	@Test
	public void demo()
	{
		System.out.println("hello ");
	}
	
	@Test
	public void demo1()
	{
		System.out.println("bye hello");
	}

}
