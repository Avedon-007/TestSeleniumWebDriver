package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RedmineDeleteConfirmPageFirefox 
{
	private final  ChromeDriver driver;	
	
	public RedmineDeleteConfirmPageFirefox(ChromeDriver driver) 
	{
		this.driver = driver;
	}


	public void deleteAccounr() 
	{		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/label")));
		//driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[3]/div[2]/div[1]/form/label/input")).click();
		driver.findElement(By.id("confirm")).click();		
		driver.findElement(By.name("commit")).click();
	}

}
