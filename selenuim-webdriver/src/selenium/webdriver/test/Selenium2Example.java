package selenium.webdriver.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium2Example  {
		
	 
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\teams2\\selenium\\drivers\\geckodriver.exe");
			
			System.setProperty("webdriver.chrome.driver", "C:\\teams2\\selenium\\drivers\\chromedriver.exe");
			
		  /*WebDriver driver = new FirefoxDriver();
			
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
	 
			String title = driver.getTitle();
			
			System.out.println("Title:"+title);
			
			//Thread.sleep(5000);
			driver.quit();*/
			
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window-size=1400,800");
			options.addArguments("headless");
			
	
			WebDriver chromeDriver = new ChromeDriver(options);
			
			//WebDriver chromeDriver = new ChromeDriver();
			
			
			
			chromeDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			chromeDriver.get("https://www.freecrm.com");
	 
			String title1 = chromeDriver.getTitle();
			
			System.out.println("Home Page Title:"+title1);
			
			
			chromeDriver.findElement(By.name("username")).sendKeys("naveenk");
			chromeDriver.findElement(By.name("password")).sendKeys("test@123");
			Thread.sleep(5000);
			
			
			chromeDriver.findElement(By.xpath("//input[@type='submit']")).click();
			
			System.out.println("After Login Title:"+chromeDriver.getTitle());
			
			
			chromeDriver.quit();
	
			
		}
	
	
}