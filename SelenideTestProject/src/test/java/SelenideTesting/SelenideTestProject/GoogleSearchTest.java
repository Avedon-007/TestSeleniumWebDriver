package SelenideTesting.SelenideTestProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.size;

/**
 * Unit test for simple App.
 */
public class GoogleSearchTest 
  
{
	@Test
    public void userCanSearchAnyKeyword()
    {
		//System.setProperty("webdriver.gecko.driver", "D:\\Programs\\TEST\\Selenium\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\Programs\\TEST\\Selenium\\MicrosoftEdgeWebDriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\Programs\\TEST\\Selenium\\chromedriver.exe");
		Configuration.browser = "edge";
		
		open("http://google.com/");
    	$(By.name("q")).val("selenide").pressEnter();
    	$$("#ires .g").shouldHave(size(10));
    	$("#ires .g").shouldHave(text("selenid.org"));
    }
}
