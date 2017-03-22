package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;



import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RedmineHomePageFirefox 
{
	private final FirefoxDriver driver;
	//private final  ChromeDriver driver;

	public RedmineHomePageFirefox(FirefoxDriver driver) 
	//public RedmineHomePageFirefox(ChromeDriver driver)
	{
		this.driver = driver;
	}

	public RedmineRegisterNewIssueFirefox openSignUpPage() 
	{		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("register")));
		driver.findElement(By.className("register")).click();		
		return new RedmineRegisterNewIssueFirefox(driver);
	}

	public RedmineLoginPageFirefox openLogInPage() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("login")));
		driver.findElement(By.className("login")).click();		
		return new RedmineLoginPageFirefox(driver);
	}
}
