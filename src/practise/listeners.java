package practise;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("start of execution");
		System.out.println(result.getTestName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("success of execution");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
	}

	public void onTestSkipped(ITestResult result) {
		// not implemented
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		System.out.println("start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finish");
	}
}
