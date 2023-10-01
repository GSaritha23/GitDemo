package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E {

	public static void main(String[] args, WebElement option) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();

		driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {

			System.out.println("its enabled");

		}
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		int i = 1;
		while (i < 5) {

			driver.findElement(By.id("hrefIncAdt")).click();
			i++;

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("ctl00$mainContent$rbtnl_Trip")).click();

		// driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

	}

}
