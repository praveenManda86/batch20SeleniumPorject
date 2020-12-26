package SeleniumPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PropertyExample {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream filePath = new FileInputStream(
				"C:\\Users\\prave\\OneDrive\\Desktop\\EclipsePrograms\\Flipkart_Project\\testData.properties");

		Properties rdata = new Properties();

		rdata.load(filePath);

		if (rdata.getProperty("BROWSER").equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (rdata.getProperty("BROWSER").equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\prave\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (rdata.getProperty("BROWSER").equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\prave\\Downloads\\IEDriv\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		String userName = rdata.getProperty("USERNAME");
		String pASSWORD = rdata.getProperty("PASSWORD");
		
		
		driver.get(rdata.getProperty("URL"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.findElement(By.id(rdata.getProperty("UNID"))).sendKeys(userName); // Uname
		driver.findElement(By.id(rdata.getProperty("PWDID"))).sendKeys(pASSWORD); // Pwd
		driver.findElement(By.xpath(rdata.getProperty("XPATHSIGN"))).click();

	}

}
