package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountFramesEx {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		System.out.println(driver.findElements(By.tagName("a")).size());

	}

}
