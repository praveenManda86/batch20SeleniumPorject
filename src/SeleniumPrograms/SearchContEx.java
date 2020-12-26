package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SearchContEx {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		WebElement fromPlc = driver.findElement(By.id("fromPlaceName"));
		WebElement toPlc = driver.findElement(By.id("toPlaceName"));
		fromPlc.isDisplayed();
		fromPlc.clear();
		fromPlc.sendKeys("khammam");

	}

}
