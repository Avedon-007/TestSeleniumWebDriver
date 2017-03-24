package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class RedmineLoggedInPageChrome 
{
	private final  ChromeDriver driver;	
	
	public RedmineLoggedInPageChrome(ChromeDriver driver) 
	{
		this.driver = driver;
	}

	public RedmineMyAccountPageChrome openAccoutPage() 
	{
		driver.findElement(By.className("my-account")).click();
		return new RedmineMyAccountPageChrome(driver);
	}

}
