package seleniumarch;

import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class WindowHandler 
{ 
	WebDriver driver;
	
	@BeforeClass
	public void beforetest()
	{
	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	}
	
	@Test
	public void f3() throws InterruptedException
	{
		String mainwindow= driver.getWindowHandle();
		
		Set<String> win= driver.getWindowHandles();
		
		System.out.println(win.size());
		
		for (String xyz : win)
		{
		   driver.switchTo().window(xyz);
		   
		   System.out.println("Title of the page: "+driver.getTitle());
		   
		  if(driver.getTitle().equals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com")) 
		   
		  {
			  System.out.println("Main Window");
			  
		  }
		  else
		  {
			  driver.close();
			  
		  }
		  
		   
		}
	}
		
		@AfterClass
		public void aftertest() throws InterruptedException
		{
			Thread.sleep(5000);
			//driver.close();
		}
		
	}
	


