package introduction;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,5);
		 
		String[] vegies= {"Cucumber","Brocolli","Potato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
	    int j=0;
		List<WebElement>  products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++) {
			
			String[] name=products.get(i).getText().split("-");
			 String formatedName = name[0].trim();
			
	        List itemsnedded = Arrays.asList(vegies);

			
			if(itemsnedded.contains(formatedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==formatedName.length()) {
					
				break;	
					
				}
			}
			
		
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		
		//driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		driver.findElement(By.className("promoBtn")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		driver.findElement(By.cssSelector("select[style='width: 200px;']")).click();
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		
		
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
		
	}
	
	
	
	
	

}
