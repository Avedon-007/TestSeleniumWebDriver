package SelenideTesting.SelenideTestProject;



import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RedmineDeleteConfirmPageEdge 
{

	private final InternetExplorerDriver driver;
	

	public RedmineDeleteConfirmPageEdge(InternetExplorerDriver driver) 
	{
		this.driver = driver;
	}


	public void deleteAccounr() 
	{		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/label/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/input[3]")).click();		
	}
	
	
}
