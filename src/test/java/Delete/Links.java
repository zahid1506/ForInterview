package Delete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Links {
	@Test
	public void radio() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aritra/Desktop" + "/selenium essentials/browser driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		List<WebElement> hr = driver.findElements(By.tagName("a"));
		for (int i = 0; i < hr.size(); i++) {
			System.out.println(hr.get(i).getAttribute("href"));
			driver.close();

		}
	}
}
