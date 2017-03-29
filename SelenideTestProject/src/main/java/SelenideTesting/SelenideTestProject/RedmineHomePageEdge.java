package SelenideTesting.SelenideTestProject;


import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;




public class RedmineHomePageEdge 
{

	private final InternetExplorerDriver driver;

	public RedmineHomePageEdge(InternetExplorerDriver driver) 
	{
		this.driver = driver;
	}

	public RedmineRegisterNewIssueEdge openSignUpPage() 
	{				
		$(By.className("register")).click();		
		return new RedmineRegisterNewIssueEdge(driver);
	}

	public RedmineLoginPageEdge openLogInPage() 
	{
	
		$(By.className("login")).click();		
		return new RedmineLoginPageEdge(driver);
	}

}
