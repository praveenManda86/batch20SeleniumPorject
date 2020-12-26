package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class paralleltestEx {

@Test
public void Login() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	System.out.println(Thread.currentThread().getId());
}

@Test
public void ForgotPasssword() {
	System.setProperty("webdriver.gecko.driver", "C:\\ff\\ff.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://ww.google.com");
	System.out.println(Thread.currentThread().getId());
}

@Test
public void Payment() {
	System.setProperty("webdriver.ie.driver", "C:\\chromedriv\\chromedriver.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.get("http://ww.nauakri.com");
	System.out.println(Thread.currentThread().getId());
}


}
