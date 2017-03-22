package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class RedmineMyAccountPageFirefox 
{
	private final  ChromeDriver driver;
	//private final FirefoxDriver driver;

	//public RedmineMyAccountPageFirefox(FirefoxDriver driver) 
	public RedmineMyAccountPageFirefox(ChromeDriver driver) 
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
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/h2")));
		return driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/h2")).getText();
	}

	public String getUpdateNotificationText()
	{	
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("flash_notice")));
		return driver.findElement(By.id("flash_notice")).getText();
	}

	public RedmineHomePageFirefox logOut() 
	{
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		return new RedmineHomePageFirefox(driver);
	}

	public RedmineDeleteConfirmPageFirefox openDeleteAccountPage() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div[1]/div[3]/div[1]/p[2]/a")));
		driver.findElement(By.xpath("html/body/div/div/div[1]/div[3]/div[1]/p[2]/a")).click();
		return new RedmineDeleteConfirmPageFirefox(driver);
	}
	
}
