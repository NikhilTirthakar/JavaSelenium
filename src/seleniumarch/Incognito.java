package seleniumarch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Incognito {

    WebDriver driver;
    
    @BeforeTest
    public void beforeclass()
    {
    	
    	System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}
    
    @Test
    public void testone() throws InterruptedException
    {
    	driver.findElement(By.id("txtUsernam")).sendKeys("admin");
    	driver.findElement(By.id("txtPassword")).sendKeys("admi");
		driver.findElement(By.id("btnLogin")).click();
	
		
		//Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/dashboard");
       // System.out.println("TestCase Passed");
        
		SoftAssert soft= new SoftAssert();
        soft.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/dashboard");
        soft.assertAll();
		Thread.sleep(2000);
    }
    
    @AfterTest
    public void afterclass()
    {
    	driver.close();
    }

}
