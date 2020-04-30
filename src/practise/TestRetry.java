package practise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetry {
	
	@Test(retryAnalyzer = practise.RetryAnalyzer.class)
	public void test1()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2()
	{
		Assert.assertTrue(false);
	}

}
