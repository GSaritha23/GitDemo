package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		driver.findElement(By.cssSelector("#draggable")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(0);
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));
		
        a.dragAndDrop(source, target).build().perform();
        
        
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[contains(text(),'Accordion')]")).click();
        
        
        
        
        
        
        
        
        
	}

}
