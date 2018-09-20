package Delete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio {
	@Test
	public void radio() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aritra/Desktop" + "/selenium essentials/browser driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=160125454599454&extra_1=s%7Cc%7C256741421258%7Cb%7Cfacebook%20new%20account%7C&placement=&creative=256741421258&keyword=facebook%20new%20account&partner_id=googlesem&extra_2=campaignid%3D973072202%26adgroupid%3D49828379433%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-297077201745%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid="
		+ "EAIaIQobChMImJK_tqiw3AIVQgwrCh21iA5_EAAYASAAEgLvVvD_BwE");
		List<WebElement> hr = driver.findElements(By.tagName("input"));
		System.out.println(hr.size());
		for (int i = 0; i < hr.size(); i++) {
			System.out.println(hr.get(i).getAttribute("value"));
			driver.close();
		}

	}
}
