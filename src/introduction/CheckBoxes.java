package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
	
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	    	
		
		

	}

}
