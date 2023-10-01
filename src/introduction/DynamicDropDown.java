package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
	    driver.findElement(By.xpath("//a[@value='BHO']")).click();
	    
	    Thread.sleep(2000);
	
	    driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	
	
	   System.out.println(driver.findElement(By.xpath("//a[@value='BHO']")).getText());
	   
	   
	   
	   System.out.println(driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).getText());
	   
	   driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
	   
	   System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	   driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	   System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	   
	   if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	   {
		   
		 System.out.println("its enabled");  
		   
		   
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

}
}