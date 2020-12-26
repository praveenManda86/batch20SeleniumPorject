package SeleniumPrograms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandEx {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String pWindow =  driver.getWindowHandle();   
		System.out.println("Parent Window ID ==="  +  pWindow);   //Parent Window ID
	
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//a[text()='Know More'][1]")).click();
		
		Set<String>  numbWInd  = driver.getWindowHandles(); //3
		
		System.out.println(numbWInd.size());
		
		Iterator  it = numbWInd.iterator();
		
		while (it.hasNext()) {
			String Windowid = it.next().toString();
			System.out.println(" window ID ===" +  Windowid);  //it will print child window id
		}
		
		
		
		
		
	//	Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//input[@name='compare']")).click();
		
			
		
	}

}
