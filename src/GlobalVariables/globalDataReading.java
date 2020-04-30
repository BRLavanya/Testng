package GlobalVariables;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class globalDataReading {
	@Test
	public void readData() throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\BRLAVAN\\Desktop\\DL\\Personal\\Selenium_Learning\\src\\GlobalVariables\\data.properties");
		prop.load(fis);
		System.out.println("username is " + prop.getProperty("username"));
		System.out.println("password is " + prop.getProperty("password"));
		System.out.println("the url is: " + prop.getProperty("url"));
		String b=prop.getProperty("browser");
		if (b.equalsIgnoreCase("firefox"))
		{
			System.out.println("its firefox browser");
		}
		else if (prop.getProperty("browser").equals("chrome")) 
		{
			System.out.println("chrome browser");
		}
		else
		{
			System.out.println("browser is not supported");
		}
		
	}

}
