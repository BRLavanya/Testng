package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterByDataprovider {

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Guru99";
		data[0][1] = "India";
		data[1][0] = "Krishna";
		data[1][1] = "UK";
		data[2][0] = "Bhupesh";
		data[2][1] = "USA";
		return data;
	}

	@Test(dataProvider = "getData")
	public void searchdata(String author, String name) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRLAVAN\\Desktop\\Data_backup\\DL\\Personal\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(name);
		String testValue = search.getAttribute("value");
		System.out.println(testValue);

	}

}
