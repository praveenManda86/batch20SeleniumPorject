package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessBrExample {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		
	ChromeOptions opt = new ChromeOptions();
	
	opt.addArguments("headless");
	
	WebDriver driver = new ChromeDriver(opt);
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	String ptitle = driver.getTitle();

	if (ptitle.equals("Facebook – log in or sign up")) {
		System.out.println("Yes user is on FB login page");
	} else {
		System.out.println("url is incorrect or not working");
	}

	WebElement UN = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("pass"));
	
	

	if (UN.isDisplayed() && UN.isEnabled()) {
		System.out.println("UN text box is enabled or displayed");
		UN.sendKeys("praveen");
	} else {
		System.out.println("text box is not enabled or displayed");
	}

	if (password.isDisplayed() && password.isEnabled()) {
		System.out.println("PWD text box is  enabled or displayed");
		password.sendKeys("prav1234@@");
	} else {
		System.out.println("password is not enabled or displayed");
	}


	}

}
