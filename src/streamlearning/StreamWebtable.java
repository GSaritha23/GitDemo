package streamlearning;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//span[contains(text(),'Veg')]")).click();

		List<WebElement> elementslist = driver.findElements(By.xpath("//tbody/tr/td[1]"));

		List<String> originallist = elementslist.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originallist.equals(sortedlist));

//List<String> price=	elementslist.stream().filter(s->s.getText().contains("Beans")).map(s->s.getPriceVeggie(s)).collect(Collectors.toList());	

	}

}
