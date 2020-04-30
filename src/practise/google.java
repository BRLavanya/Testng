package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class google 
{

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BRLAVAN\\Desktop\\Data_backup\\DL\\Personal\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void googleTitle()
	{
		System.out.println("title is "+driver.getTitle());
	}
	@Test
	public void googleGmail()
	{
		System.out.println(" is it enabled ? "+driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
