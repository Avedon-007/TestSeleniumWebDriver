package SelenideTesting.SelenideTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class RedmineLoggedInPageEdge 
{
	private final InternetExplorerDriver driver;
	
	public RedmineLoggedInPageEdge(InternetExplorerDriver driver) 
	{
		this.driver = driver;
	}

	public RedmineMyAccountPageEdge openAccoutPage() 
	{
		driver.findElement(By.className("my-account")).click();
		return new RedmineMyAccountPageEdge(driver);
	}
}
