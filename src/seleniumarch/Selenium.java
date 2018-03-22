package seleniumarch;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium 
{
     static WebDriver driver;
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		screenshot();
		driver.close();
		}
		
		public static void screenshot() throws IOException 
		{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination= new File("screenshot/Screen1.png");
		
		FileUtils.copyFile(source, destination);
		
			
		}
		
		
	}
	

	

