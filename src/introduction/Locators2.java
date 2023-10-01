package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
	
	public static void main(String[] args) throws InterruptedException {
		String name = "saritha";
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getpassword(driver);
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("name");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	    //driver.close();
	
	}
   public static String  getpassword(WebDriver driver) throws InterruptedException {
	   driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText=driver.findElement(By.cssSelector("form p")).getText();
	   //Please use temporary password 'rahulshettyacademy' to Login
	  String[] passwordArray= passwordText.split("'");
	  String password=passwordArray[1].split("'")[0];
	  return password; 
	   
	   
   }
	
	
	
	
	
	
	
	
}
