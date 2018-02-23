package selenium.webdriver.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	public WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println(" Login Successful!!");

		driver.quit();

	}

	@BeforeMethod
	public void beforeMethod() {

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\teams2\\selenium\\drivers\\geckodriver.exe"); // Create a new instance
		 * of the Firefox driver driver = new FirefoxDriver();
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\teams2\\selenium\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		// Put a Implicit wait, this means that any search for elements on the page
		// could take the time the implicit wait is set for before throwing exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the Online Store Website

		driver.get("https://www.freecrm.com");

	}

	@AfterMethod
	public void afterMethod() {

		// Close the driver

		driver.quit();

	}
}
