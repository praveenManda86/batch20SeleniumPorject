package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFunctionality {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		String ptitle = driver.getTitle();

		if (ptitle.equals("Facebook – log in or sign up")) {
			System.out.println("Yes user is on FB login page");
		} else {
			System.out.println("url is incorrect or not working");
		}

		WebElement UN = driver.findElement(By.className("inputtext _55r1 _6luy"));
		WebElement password = driver.findElement(By.className("inputtext _55r1 _6luy"));
		WebElement loginButton = driver.findElement(By.name("login"));
		
		

		if (UN.isDisplayed() && UN.isEnabled()) {
			UN.sendKeys("praveen");
		} else {
			System.out.println("text box is not enabled or displayed");
		}

		if (password.isDisplayed() && password.isEnabled()) {
			password.sendKeys("prav1234@@");
		} else {
			System.out.println("password is not enabled or displayed");
		}

		if (loginButton.isDisplayed() && loginButton.isEnabled()) {
			loginButton.click();
		}

	}

}
