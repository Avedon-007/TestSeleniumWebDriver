package SeleniumWebDriverTesting.SeleniumWebDriverTestProject;

import static org.junit.Assert.*;
import org.junit.Test;



public class TestRunFirefoxTest extends DriverLifecycleManagement
{
	
	//CreateNewIssue
	@Test
	public void test1() throws InterruptedException
	{		
		System.out.println("Launch Test #1");
		RedmineHomePageFirefox startPage = new RedmineHomePageFirefox(driver);
		RedmineRegisterNewIssueFirefox registerNewIssue = startPage.openSignUpPage();
		RedmineMyAccountPageFirefox myAccount = registerNewIssue
				.signUpNewUser("test-user-1", "1234567890", "1234567890", "user",
				"userenko", "testuser1@gmail.con");
		assertTrue(myAccount.getConfirmText().equals("Ваша учётная запись активирована. Вы можете войти."));			
		assertTrue(myAccount.getLoginText().equals("test-user-1"));		
		startPage = myAccount.logOut();
		System.out.println("Test #1 is Passed!");
	}		
	//UpdateIssue
	@Test
	public void test2() throws InterruptedException
	{
		System.out.println("Launch Test #2");
		RedmineHomePageFirefox startPage = new RedmineHomePageFirefox(driver);
		RedmineLoginPageFirefox loginPage = startPage.openLogInPage();
		RedmineLoggedInPageFirefox loggedPage = loginPage.logging("test-user-1", "1234567890");
		RedmineMyAccountPageFirefox myAccount = loggedPage.openAccoutPage();
		myAccount.updateAccount();
		assertTrue(myAccount.getUpdateNotificationText().equals("Account was successfully updated."));
		assertTrue(myAccount.getUpdatedPageNameText().equals("My account"));
		startPage = myAccount.logOut();
		System.out.println("Test #2 is Passed!");
	}	
	
	//DeleteIssue
	@Test
	public void test3() throws InterruptedException
	{
		System.out.println("Deleting Issue...");		
		RedmineHomePageFirefox startPage = new RedmineHomePageFirefox(driver);
		RedmineLoginPageFirefox loginPage = startPage.openLogInPage();
		RedmineLoggedInPageFirefox loggedPage = loginPage.logging("test-user-1", "1234567890");
		RedmineMyAccountPageFirefox myAccount = loggedPage.openAccoutPage();		
		RedmineDeleteConfirmPageFirefox deleteConfirm = myAccount.openDeleteAccountPage();
		deleteConfirm.deleteAccounr();		
		//assertTrue(myAccount.getDeletedAccountNotificationText().equals("Your account has been permanently deleted."));
		System.out.println("Issue has been deleted.");
	}
}
