package selenium.webdriver.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class GridTest {
	
  @Test
  public void test() throws MalformedURLException {
  
	  DesiredCapabilities cap = DesiredCapabilities.firefox();
	  cap.setPlatform(Platform.WINDOWS);
	  
	  URL url = new URL("http://localhost:4444/wd/hub");	 
	  WebDriver driver = new RemoteWebDriver(url,cap);
	  
	  driver.get("https://www.mbusa.com");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  System.out.println("Title is:"+driver.getTitle());
	  
	  driver.quit();
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\teams2\\selenium\\drivers\\chromedriver.exe");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
