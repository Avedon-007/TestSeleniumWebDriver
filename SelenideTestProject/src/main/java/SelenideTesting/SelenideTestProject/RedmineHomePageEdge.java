package SelenideTesting.SelenideTestProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class RedmineHomePageEdge 
{

	private final InternetExplorerDriver driver;

	public RedmineHomePageEdge(InternetExplorerDriver driver) 
	{
		this.driver = driver;
	}

	public RedmineRegisterNewIssueEdge openSignUpPage() 
	{		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("register")).click();		
		return new RedmineRegisterNewIssueEdge(driver);
	}

	public RedmineLoginPageEdge openLogInPage() 
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();		
		return new RedmineLoginPageEdge(driver);
	}

}
