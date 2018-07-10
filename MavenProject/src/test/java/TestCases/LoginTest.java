package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	 WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	 
	  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
	  driver.manage().window().maximize();
	  
  }
  
  @Test
  public void f() {
  }
 
	

  
}
