package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverLifecycleManagement 
{
	protected static FirefoxDriver driver;
	
	@Before
	public void setUpDriver()
	{
		System.out.println("Launching Firefox browser.");
		//System.setProperty("webdriver.gecko.driver", "D:\\Programs\\TEST\\Selenium\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Programs\\TEST\\Selenium\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.redmine.org/");
		System.out.println("Firefox browser launched successfully");
	}		

	@After
	public  void tearDown()
	{
		driver.manage().deleteAllCookies();
		driver.quit();
	}	
}
