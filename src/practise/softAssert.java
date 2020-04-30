package practise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {

	SoftAssert softassert = new SoftAssert();

	@Test
	public void test1() {
		System.out.println("login test1 method");
		softassert.assertEquals(true, false,"test1 method faled");
		System.out.println("logout test1 method");
		softassert.assertAll();
	}

	@Test
	public void test2() {
		System.out.println("login test2 method");
		softassert.assertEquals(true, false,"test2 method faled");
		System.out.println("logout test2 method");
		softassert.assertAll();
	}

	@Test
	public void test3() {
		SoftAssert s = new SoftAssert();
		System.out.println("login test3 method");
		s.assertEquals(true, false,"test3 method faled");
		System.out.println("logout test3 method");
		s.assertAll();
	}
}
