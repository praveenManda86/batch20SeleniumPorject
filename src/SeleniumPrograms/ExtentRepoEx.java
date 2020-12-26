package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentRepoEx {

	WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	@BeforeClass
	public static void startTest() {
		report = new ExtentReports("C:\\Users\\prave\\OneDrive\\Desktop\\ExtentResults.html", false);
		test = report.startTest("ExtentRepoEx");
	}

	@Test

	public void loginFB() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		if (driver.getTitle().contains("hello")) {
			test.log(LogStatus.PASS, "User successfully navigated to fb page");
		} else {
			test.log(LogStatus.FAIL, "step got failes FB page not loaded");
		}

		WebElement UN = driver.findElement(By.id("email"));
		
		if(UN.isDisplayed()) {
		test.log(LogStatus.PASS, "Username Text box is displayed succ");
		UN.sendKeys("hello");
		} else {
		test.log(LogStatus.FAIL, "Username textbox is not displayed");
		}
		
		
		WebElement PWD = driver.findElement(By.id("pass"));
		if(PWD.isDisplayed()) {
		test.log(LogStatus.PASS, "Password Text box is displayed succ");
		PWD.sendKeys("praveen123");
		}
		WebElement lBtn = driver.findElement(By.id("u_0_b"));
		lBtn.click();
	}

@AfterClass
public void endtest() {
report.endTest(test);
report.flush();
}
	
	
}
