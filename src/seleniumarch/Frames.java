package seleniumarch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Frames 
{
	WebDriver driver;
	
	@BeforeClass
	public void beforetest()
	{
	   System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	   driver = new ChromeDriver();
	   
	   driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	   			
	}
	
	@Test
	public void f1()
	{
	  	
		
	}
	
	@AfterClass
	public void aftertest()
	{
		//driver.close();
	}

}
