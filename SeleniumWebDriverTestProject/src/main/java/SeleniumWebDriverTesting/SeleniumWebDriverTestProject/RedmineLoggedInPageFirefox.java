package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class RedmineLoggedInPageFirefox 
{
	private final  ChromeDriver driver;
	//private final FirefoxDriver driver;

	//public RedmineLoggedInPageFirefox(FirefoxDriver driver) 
	public RedmineLoggedInPageFirefox(ChromeDriver driver) 
	{
		this.driver = driver;
	}

	public RedmineMyAccountPageFirefox openAccoutPage() 
	{
		driver.findElement(By.className("my-account")).click();
		return new RedmineMyAccountPageFirefox(driver);
	}

}
