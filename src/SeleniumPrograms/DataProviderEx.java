package SeleniumPrograms;

import java.security.Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	
@DataProvider(name="login")
public Object[][] dpex(){
return new Object[][] {{"Praveen"},{"Deepika"},{"Sai"}, {"Mounika"}};
}
	
@Test(dataProvider = "login")
public void login(String val) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	WebElement UN = driver.findElement(By.id("email"));

	if (UN.isDisplayed() && UN.isEnabled()) {
		System.out.println("UN text box is enabled or displayed"+ "going to enter=="+ val);
		UN.sendKeys(val);
	} else {
		System.out.println("text box is not enabled or displayed");
	}



}
	
}

	
	
	
