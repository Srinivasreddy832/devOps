package tsl949devOps;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.*;

public class udemylogin {
	WebDriver driver;
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.udemy.com/");

	  driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();
	  driver.findElement(By.name ("email")).sendKeys ("admin");

	  driver.findElement(By.name ("password")).sendKeys ("admin123");
	  driver.findElement(By.name("submit")).click();
       boolean x =driver.findElement(By.xpath("//div[ contains (text(), 'We found your account. It looks like a***")).isDisplayed();
      Assert.assertTrue(x);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	  driver= new ChromeDriver();
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(1000);
	  driver.close();
  }

}
