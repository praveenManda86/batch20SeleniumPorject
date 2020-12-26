package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) throws InterruptedException {

		Logger log = Logger.getLogger("ActionsExample");
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.debug("driverlaunched successfully");
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		log.debug("URL launched successfully");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		log.debug("button clicked successfully");
		Thread.sleep(10000);

		Alert alert = driver.switchTo().alert();

		String uSrNameAlertMsg = alert.getText(); // Please enter valid username

		if (uSrNameAlertMsg.equals("Please enter a valid user name")) { // equals method will compare the object
			log.debug("Yes Alert is properly showing");
		} else {
			log.debug("POPUP is invalid / wrongly showing");
		}

		
	}

}
