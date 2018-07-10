package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterTest;

public class AdvDay2 {
	WebDriver driver;
	

	  @BeforeTest
	  public void beforeTest() {
		 
		  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		  driver.manage().window().maximize();  //ainvai
		  
	  }
	  
  @Test
  public void f() {
 
	  driver.findElement(By.name("txtUsername")).clear();
	  driver.findElement(By.name("txtUsername")).sendKeys("Sysadmin");
	  driver.findElement(By.name("txtPassword")).clear();
	  driver.findElement(By.name("txtPassword")).sendKeys("sysadmin");
	  driver.findElement(By.id("btnLogin")).click();
	  
	 // @FindBy(how = How.ID, using= "account-name")
	  //WebElement actual_result;
  }
  


  @AfterTest
  public void afterTest() {
	 driver.close();//hfgj
	 System.out.println("closing"); //gsddh
  }

}
