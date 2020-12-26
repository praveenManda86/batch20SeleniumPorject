package JavaPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class screenshotEx {
	static WebElement UN;
	static WebElement password;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
	
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		 String ptitle = driver.getTitle();

			if (ptitle.equals("Facebook – log in or sign up")) {
				System.out.println("Yes user is on FB login page");
			} else {
				FileUtils.copyFile(screenshot, new File("C:\\Users\\prave\\OneDrive\\Desktop\\Screenshots\\fbpg.png"));
				System.out.println("url is incorrect or not working");
			}
			try {
			 UN = driver.findElement(By.id("email"));  // it is failing here 
		     password = driver.findElement(By.id("pass"));
			} catch (NoSuchElementException e) {
				System.out.println("location / elemrnt is in correct");
			}

			if (UN.isDisplayed() && UN.isEnabled()) {
				System.out.println("Yes Username text box is enabled and enter data");
				UN.sendKeys("praveen");
			} else {
				FileUtils.copyFile(screenshot, new File("C:\\Users\\prave\\OneDrive\\Desktop\\Screenshots\\UN.png"));
				System.out.println("text box is not enabled or displayed");
				
			}

			if (password.isDisplayed() && password.isEnabled()) {
				System.out.println("Yes Password text box is enabled and enter data");
				password.sendKeys("prav1234@@");
			} else {
				FileUtils.copyFile(screenshot, new File("C:\\Users\\prave\\OneDrive\\Desktop\\Screenshots\\PWD.png"));
				System.out.println("password is not enabled or displayed");
			} 
		 

       driver.close();
	
	

	}

}
