package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void yahooLoginTest() throws InterruptedException{
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromerdriver_Latest\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.yahoo.com");
  
	  driver.findElement(By.linkText("Sign in")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.cssSelector("input#login-username")).sendKeys("naveen");
	  
	  driver.findElement(By.cssSelector("input#login-signin")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.cssSelector("input#login-passwd")).sendKeys("1234");
	  
	  driver.findElement(By.cssSelector("button#login-signin")).click();
	  
	  
  }
}
