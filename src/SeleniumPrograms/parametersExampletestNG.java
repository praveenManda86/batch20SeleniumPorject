package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class parametersExampletestNG {
	WebDriver driver;

	@Test
	@Parameters({ "URL", "username", "password" })
	public void login(String url, String UNAME, String Password) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement UN = driver.findElement(By.id("email"));
		UN.sendKeys(UNAME);
		WebElement PWD = driver.findElement(By.id("pass"));
		PWD.sendKeys(Password);
		WebElement lBtn = driver.findElement(By.id("u_0_b"));
		lBtn.click();

	}

}
