package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RedmineHomePageChrome 
{	
	private final  ChromeDriver driver;
	
	public RedmineHomePageChrome(ChromeDriver driver)
	{
		this.driver = driver;
	}

	public RedmineRegisterNewIssueChrome openSignUpPage() 
	{		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("register")));
		driver.findElement(By.className("register")).click();		
		return new RedmineRegisterNewIssueChrome(driver);
	}

	public RedmineLoginPageCrome openLogInPage() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("login")));
		driver.findElement(By.className("login")).click();		
		return new RedmineLoginPageCrome(driver);
	}
}
