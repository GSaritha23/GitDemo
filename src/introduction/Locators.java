package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("saritha");
		driver.findElement(By.name("inputPassword")).sendKeys("hello2329");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.linkText("Forgot your password?")).click();		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("venkat");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sar123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("6303129781");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		driver.findElement(By.xpath("//div/button[2]")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("saritha");
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.xpath("//input[contains(@id,'chkboxOne')]")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
		
		
		
	}

}
