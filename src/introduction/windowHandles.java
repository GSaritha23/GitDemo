package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		//driver.findElement(By.linkText("https://rahulshettyacademy.com/documents-request")).click();
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		 Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it =windows.iterator();
		
	String	parentId=it.next();
	String childId=it.next();	
		
	driver.switchTo().window(childId);	
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());	
	driver.findElement(By.cssSelector(".im-para.red")).getText();	
		
	//String email="driver.findElement(By.cssSelector(".im-para.red")).getText().split(\"at\")[1].trim().split(\" \")[0]"	

	String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	driver.switchTo().window(parentId);
	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("learning");
	driver.findElement(By.className("checkmark")).click();
	driver.findElement(By.xpath("//select[@class='form-control']"));
	driver.findElement(By.name("terms")).click();
	driver.findElement(By.cssSelector("#signInBtn")).click();
	
	
	
	
	
	
	}

}
