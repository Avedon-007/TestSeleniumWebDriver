package SelenideTesting.SelenideTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class RedmineRegisterNewIssueEdge 
{
	private final InternetExplorerDriver driver;
	

	public RedmineRegisterNewIssueEdge(InternetExplorerDriver driver) 
	{
		this.driver = driver;
	}


	public RedmineMyAccountPageEdge signUpNewUser(String login,
			String pass, String confirmPass, String userName, String lastName,
			String email) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("user_login")));
		driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.id("user_login")).sendKeys(login);
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys(pass);
		driver.findElement(By.id("user_password_confirmation")).clear();
		driver.findElement(By.id("user_password_confirmation")).sendKeys(confirmPass);
		driver.findElement(By.id("user_firstname")).clear();
		driver.findElement(By.id("user_firstname")).sendKeys(userName);
		driver.findElement(By.id("user_lastname")).clear();
		driver.findElement(By.id("user_lastname")).sendKeys(lastName);
		driver.findElement(By.id("user_mail")).clear();
		driver.findElement(By.id("user_mail")).sendKeys(email);
		
		//Working with Drop down menu
		driver.findElement(By.id("user_language")).click();		
		Select se=new Select(driver.findElement(By.id("user_language")));
		se.selectByValue("");
		Thread.sleep(2000);
				
		driver.findElement(By.name("commit")).submit();		
		
		return new RedmineMyAccountPageEdge(driver);
	}

}
