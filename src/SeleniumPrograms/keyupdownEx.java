package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyupdownEx {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		
		WebElement txtfrom = driver.findElement(By.id("fromPlaceName"));
		
        Actions  builder = new Actions(driver);
       
        Action  data = builder.keyDown(txtfrom, Keys.SHIFT).sendKeys(txtfrom, "abcdef").keyUp(txtfrom, Keys.SHIFT).build();
        
        data.perform();
        


	}

}
