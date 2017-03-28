package SelenideTesting.SelenideTestProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class RedmineMyAccountPageEdge 
{
	private final InternetExplorerDriver driver;

	public RedmineMyAccountPageEdge(InternetExplorerDriver driver)
	{
		this.driver = driver;
	}
	public String getConfirmText() 
	{		
		return driver.findElement(By.id("flash_notice")).getText();
	}

	public String getLoginText() 
	{		
		return driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[1]/p[1]/strong/a")).getText();
	}

	public void updateAccount() throws InterruptedException 
	{
		// Working with Drop down menu
		driver.findElement(By.id("user_language")).click();		
		Select se=new Select(driver.findElement(By.id("user_language")));
		se.selectByValue("en");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).submit();
	}

	public String getUpdatedPageNameText() 
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/h2")).getText();
	}

	public String getUpdateNotificationText()
	{	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver.findElement(By.id("flash_notice")).getText();
	}

	public RedmineHomePageEdge logOut() 
	{
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		return new RedmineHomePageEdge(driver);
	}
	public RedmineDeleteConfirmPageEdge openDeleteAccountPage() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div[1]/div[3]/div[1]/p[2]")));
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[1]/p[2]/a")).click();
		return new RedmineDeleteConfirmPageEdge(driver);
	}

	
}
