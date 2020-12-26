package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	    driver.findElement(By.linkText("Forgotten password?")).click();
	    driver.findElement(By.partialLinkText("Forgot")).click();
	    
	    String ptitle = driver.getTitle();
	     System.out.println(ptitle);
	
	}
}
