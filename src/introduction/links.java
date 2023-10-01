package introduction;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerstep = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerstep.findElements(By.tagName("a")).size());
		
	WebElement coloumn=	footerstep.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
	System.out.println(coloumn.findElements(By.tagName("a")).size());
		
		for(int i=1;i<coloumn.findElements(By.tagName("a")).size();i++) {
			
	String	openlinks=	Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumn.findElements(By.tagName("a")).get(i).sendKeys(openlinks);
			Thread.sleep(3000);
			
			
		}
		
		
	Set<String> it=	driver.getWindowHandles();
   Iterator<String> open = it.iterator();
		
	while(open.hasNext()) {
		driver.switchTo().window(open.next());
		
		System.out.println(driver.getTitle());
	}
		
		
		
		
		
		

	}

}
