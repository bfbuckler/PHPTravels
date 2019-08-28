package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initialiizeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Bruce\\eclipse-workspace\\PHPTravels\\src\\main\\java\\resources\\data.properties");
		
		prop.load(file);
		String browserName = prop.getProperty("browser");

		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer32bit.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		}
		
//		public void getScreenshot(String result) throws IOException
//		{
//			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(src, new File("C:\\Users\\Bruce\\Documents\\selenium\\screenshots\\"+result+"screenshot.png"));
//		}
	
}
