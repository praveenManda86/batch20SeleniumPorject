package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class testNGExampleforFb {
	WebDriver driver;

	@BeforeMethod
	public void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement UN = driver.findElement(By.id("email"));
		UN.sendKeys("praveen.mtec@gmail.com");
		WebElement PWD = driver.findElement(By.id("pass"));
		PWD.sendKeys("Hello123");
		WebElement lBtn = driver.findElement(By.id("u_0_b"));
		lBtn.click();

	}

	@Test
	public void verifyErrorMessage() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String errorMsg = driver.findElement(By.className("_9ay7")).getText();
		System.out.println(errorMsg);
	}

	@Test
	public void verifyForgotPasswordPage() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String pTitle = driver.getTitle();
		System.out.println("User navigated Successfully to forgot Password Page");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
