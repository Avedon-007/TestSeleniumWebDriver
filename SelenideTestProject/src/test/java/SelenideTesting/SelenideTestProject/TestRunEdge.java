package SelenideTesting.SelenideTestProject;


import static org.testng.AssertJUnit.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;






public class TestRunEdge
{
	private static InternetExplorerDriver driver;

	
	@BeforeMethod
	public void setUpDriver()
	{
		System.out.println("Launching Microsoft Edge browser.");
		System.setProperty("webdriver.ie.driver", "D:\\Programs\\TEST\\Selenium\\MicrosoftEdgeWebDriver.exe");
		driver = new InternetExplorerDriver();		
		driver.manage().window().maximize();
		open("http://demo.redmine.org/");
		System.out.println("Microsoft Edge browser launched successfully");
	}		

	@AfterMethod
	public static void tearDown()
	{
		driver.manage().deleteAllCookies();		
		//driver.quit();
		if(driver!=null) {
			driver.close();
		}
	}	

	@Test(priority = 1)
	public void testCreateNewIssue() throws InterruptedException
	{
		System.out.println("Launch Test #1");
		RedmineHomePageEdge startPage = new RedmineHomePageEdge(driver);
		RedmineRegisterNewIssueEdge registerNewIssue = startPage.openSignUpPage();
		RedmineMyAccountPageEdge myAccount = registerNewIssue
				.signUpNewUser("test-user-1", "1234567890", "1234567890", "user",
				"userenko", "testuser1@gmail.con");
		//assertTrue(myAccount.getConfirmText().equals("Ваша учётная запись активирована. Вы можете войти."));			
		assertTrue(myAccount.getLoginText().equals("test-user-1"));		
		startPage = myAccount.logOut();	
		System.out.println("Test #1 is Passed!");
	}
	
	@Test(priority = 2)
	public void testUpdateIssue() throws InterruptedException
	{
		System.out.println("Launch Test #2");
		RedmineHomePageEdge startPage = new RedmineHomePageEdge(driver);
		RedmineLoginPageEdge loginPage = startPage.openLogInPage();
		RedmineLoggedInPageEdge loggedPage = loginPage.logging("test-user-1", "1234567890");
		RedmineMyAccountPageEdge myAccount = loggedPage.openAccoutPage();
		myAccount.updateAccount();
		assertTrue(myAccount.getUpdateNotificationText().equals("Account was successfully updated."));
		assertTrue(myAccount.getUpdatedPageNameText().equals("My account"));
		startPage = myAccount.logOut();
		System.out.println("Test #2 is Passed!");
	}		
	
	@Test(priority = 3)
	public void testDeleteIssue() throws InterruptedException
	{
		System.out.println("Deleting Issue...");		
		RedmineHomePageEdge startPage = new RedmineHomePageEdge(driver);
		RedmineLoginPageEdge loginPage = startPage.openLogInPage();
		RedmineLoggedInPageEdge loggedPage = loginPage.logging("test-user-1", "1234567890");
		RedmineMyAccountPageEdge myAccount = loggedPage.openAccoutPage();		
		RedmineDeleteConfirmPageEdge deleteConfirm = myAccount.openDeleteAccountPage();
		deleteConfirm.deleteAccounr();		
		//assertTrue(myAccount.getDeletedAccountNotificationText().equals("Your account has been permanently deleted."));
		System.out.println("Issue has been deleted.");
	}
}
