package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDropExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement dragEle = driver.findElement(By.id("draggable"));
		WebElement dropEle = driver.findElement(By.id("droppable"));
		
		Actions praveen = new Actions(driver);
		
		if(dropEle.getText().contains("Drop here")) {
		System.out.println("Yes ready to drop");
		Action dragDrop = praveen.clickAndHold(dragEle).moveToElement(dropEle).release().build();
		dragDrop.perform();
		}
		
		if (dropEle.getText().contains("Dropped")) {
			System.out.println("Successfully drag and dropped");
		}

	}

}
