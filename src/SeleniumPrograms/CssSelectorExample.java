package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login");
		driver.manage().window().maximize();
		// driver.findElement(By.cssSelector("input#email")).sendKeys("Hello");
		// driver.findElement(By.cssSelector("input#pass")).sendKeys("Hello");
		
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hello");
		//driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("hello");
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.cssSelector("label:contains('Password')")).isDisplayed());
		//driver.findElement(By.cssSelector("button._42ft _4jy0 _6lth _4jy6 _4jy1 selected _51s[name='login']")).click();

	}
}
