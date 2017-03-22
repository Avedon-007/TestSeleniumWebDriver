package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedmineLoginPageFirefox 
{
	//private final  ChromeDriver driver;
	private final FirefoxDriver driver;

	public RedmineLoginPageFirefox(FirefoxDriver driver) 
	//public RedmineLoginPageFirefox(ChromeDriver driver)
	{
		this.driver = driver;
	}

	public RedmineLoggedInPageFirefox logging(String login, String pass) 
	{
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(login);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.name("login")).submit();
		
		return new RedmineLoggedInPageFirefox(driver);
	}

}
