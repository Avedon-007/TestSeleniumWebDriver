package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaRunChrome {


	protected static ChromeDriver driver;
	
	public static void main(String[] args) 
	{

		System.out.println("Launching Google Chrome browser.");		
		System.setProperty("webdriver.chrome.driver", "D:\\Programs\\TEST\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("test-type");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.navigate().to("http://www.goolge.com");;
		driver.get("http://demo.redmine.org/");
		System.out.println("Google Chrome browser launched successfully");

	}

}
