package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.rahulshettyacademy.com");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());	
driver.close();


	}

}
