package SelenideTesting.SelenideTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class RedmineLoginPageEdge 
{
	private final InternetExplorerDriver driver;
	
	public RedmineLoginPageEdge(InternetExplorerDriver driver) 
	{
		this.driver = driver;
	}
	
	public RedmineLoggedInPageEdge logging(String login, String pass) 
	{
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(login);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.name("login")).submit();
		
		return new RedmineLoggedInPageEdge(driver);
	}
}
