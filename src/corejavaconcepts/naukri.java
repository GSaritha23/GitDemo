package corejavaconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad=1&gclid=EAIaIQobChMI3o_Q8YqfgAMV3JJmAh108A3bEAAYASAAEgJ4dfD_BwE&gclsrc=aw.ds");
		
		//driver.findElement(By.xpath("//span/a")).click();
		//driver.findElement(By.tagName("https://www.naukri.com/nlogin/login")).click();
		//driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']")).click();
		
		
		
		
		
		

	}

}
