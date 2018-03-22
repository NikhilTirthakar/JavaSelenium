package seleniumarch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alart 
{
  WebDriver driver;
  
  @BeforeTest
  public void TestOne()
  {
	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  //options.addArguments("--incognito");
	  options.addArguments("--start-maximized");
	  driver = new ChromeDriver(options);
	  driver.get("http://output.jsbin.com/usidix/1");
	  //driver.get("http://opensource.demo.orangehrmlive.com/");
	  
			  
  }
  
  @Test
  public void beforeAlartClass()
  {
	  driver.findElement(By.xpath("//input[@type='button']")).click();
	  
	  Alert alt= driver.switchTo().alert();
	  
	  alt.accept();
	  
	  

  }
  
  @AfterTest
  public void afterAlartClass()
  {
	  driver.close();
	  
  }
}
