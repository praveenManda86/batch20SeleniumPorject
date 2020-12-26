package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headlessBrExample {

	public static void main(String[] args) {

	HtmlUnitDriver driver = new HtmlUnitDriver();
	
	
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
	WebElement loginButton = driver.findElement(By.name("login"));
	
	

	if (UN.isDisplayed() && UN.isEnabled()) {
		System.out.println("Yes Username text box is enabled and enter data");
		UN.sendKeys("praveen");
	} else {
		System.out.println("text box is not enabled or displayed");
	}

	if (password.isDisplayed() && password.isEnabled()) {
		System.out.println("Yes Password text box is enabled and enter data");
		password.sendKeys("prav1234@@");
	} else {
		System.out.println("password is not enabled or displayed");
	}

	if (loginButton.isDisplayed() && loginButton.isEnabled()) {
		loginButton.click();
	}

	

	}

}
