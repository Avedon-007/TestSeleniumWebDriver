package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class RedmineLoginPageCrome 
{
	private final  ChromeDriver driver;

	public RedmineLoginPageCrome(ChromeDriver driver)
	{
		this.driver = driver;
	}

	public RedmineLoggedInPageChrome logging(String login, String pass) 
	{
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(login);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.name("login")).submit();
		
		return new RedmineLoggedInPageChrome(driver);
	}

}
