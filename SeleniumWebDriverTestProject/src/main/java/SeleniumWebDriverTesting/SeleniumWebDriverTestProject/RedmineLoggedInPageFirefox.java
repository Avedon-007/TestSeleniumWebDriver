package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedmineLoggedInPageFirefox 
{

	private final FirefoxDriver driver;

	public RedmineLoggedInPageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	public RedmineMyAccountPageFirefox openAccoutPage() 
	{
		driver.findElement(By.className("my-account")).click();
		return new RedmineMyAccountPageFirefox(driver);
	}

}
