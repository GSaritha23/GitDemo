package introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();

		for (WebElement link : links) {

			String url1 = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection)new URL(url1).openConnection();

			conn.setRequestMethod("HEAD");

			conn.connect();
			int code = conn.getResponseCode();

			System.out.println(code);
			
			
			a.assertTrue(code<400, "The link with Text" +link.getText()+"is broken with code"+code);
			
				
				}
		a.assertAll();

		}

	}


