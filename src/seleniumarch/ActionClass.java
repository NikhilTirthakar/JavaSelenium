package seleniumarch;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void titleget() throws InterruptedException
	{
	  driver.get("https://www.facebook.com/login/");	
	 // driver.getTitle();
	  
	  String val = driver.getTitle();
	  System.out.println(val);
	 // Assert.
	  
	}
	
	
	@AfterTest
	public void aftertest()
	{
	 	driver.quit();
	}
	

}
