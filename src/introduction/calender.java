package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.context.Context;

public class calender {

	private static final String text = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");

		driver.findElement(By.id("-field-travel_comp_date")).click();

		List<WebElement> dates = driver.findElements(By.cssSelector(".flatpickr-day "));

		int count = driver.findElements(By.cssSelector(".flatpickr-day ")).size();

		for (int i=0;i<count; i++) {

			driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).getText();

			if (text.equalsIgnoreCase("2")) {

				driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).click();

				break;
			}

		}

	}

}
