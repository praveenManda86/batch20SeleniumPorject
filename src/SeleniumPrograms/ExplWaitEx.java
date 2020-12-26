package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplWaitEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		WebDriverWait wait20 = new WebDriverWait(driver, 20);
		WebDriverWait wait30 = new WebDriverWait(driver, 30);
		WebDriverWait wait5 = new WebDriverWait(driver, 5);
		
		WebElement lnk1 = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		WebElement lnk2 = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		WebElement lnk3 = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		WebElement lnk4 = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		wait10.until(ExpectedConditions.visibilityOf(lnk3)).click();
		wait5.until(ExpectedConditions.textToBePresentInElement(lnk1, "Hello"));

	}

}
