package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@title='Sign in']")).click();

		Thread.sleep(10000);

		Alert alert = driver.switchTo().alert();

		String uSrNameAlertMsg = alert.getText(); // Please enter valid username

		if (uSrNameAlertMsg.equals("Please enter a valid user name")) { // equals method will compare the object
			System.out.println("Yes Alert is properly showing");
		} else {
			System.out.println("POPUP is invalid / wrongly showing");
		}

		alert.dismiss();
		
		driver.findElement(By.id("login1")).sendKeys("Hello");

		driver.findElement(By.xpath("//input[@title='Sign in']")).click();

		String passwordAlertMsg = alert.getText(); // Please enter your password

		if (passwordAlertMsg.equals("Please enter your password")) {
			System.out.println("Yes Alert message for Password is displaying properly");
			alert.accept();
			driver.findElement(By.id("password")).sendKeys("Hello");
		} else {
			System.out.println("POPUP is invalid / wrongly showing");
		}
	}

}
