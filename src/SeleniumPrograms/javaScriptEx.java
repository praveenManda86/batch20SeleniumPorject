package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		WebElement btmlink = driver.findElement(By.linkText("Privacy Policy"));
		WebElement upLink = driver.findElement(By.linkText("Forgot Password?"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", btmlink);
		js.executeScript("arguments[0].scrollIntoView(true);", upLink);

	}

}
