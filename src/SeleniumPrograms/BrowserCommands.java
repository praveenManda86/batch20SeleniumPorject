package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");

		WebElement maleRbt = driver.findElement(By.id("u_i_2"));

		maleRbt.isDisplayed();

		if (maleRbt.isSelected()) {
			System.out.println("it is already selected");
		} else {
			maleRbt.click();
		}
		
		
		if (maleRbt.isSelected()==false) {
			maleRbt.click();
		}
			else {
				System.out.println("it is already selected");	
			}
			
			
		}
		
		
}	
		
		
		
		
