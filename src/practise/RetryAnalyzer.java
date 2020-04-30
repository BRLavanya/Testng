package practise;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int limit = 3;
	int count = 0;

	@Override
	public boolean retry(ITestResult result) {
		if(count<limit)
		{
			count++;
			return true;
		}
		return false;
	}

}
