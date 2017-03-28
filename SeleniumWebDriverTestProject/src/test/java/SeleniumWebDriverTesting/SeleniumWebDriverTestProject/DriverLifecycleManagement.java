package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverLifecycleManagement 
{	
	protected static ChromeDriver driver;
	
	@Before
	public void setUpDriver()
	{
		System.out.println("Launching Google Chrome browser.");		
		System.setProperty("webdriver.chrome.driver", "D:\\Programs\\TEST\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("http://demo.redmine.org/");
		System.out.println("Google Chrome browser launched successfully");
	}		

	@After
	public  void tearDown()
	{
		driver.manage().deleteAllCookies();
		driver.quit();
	}	
}
