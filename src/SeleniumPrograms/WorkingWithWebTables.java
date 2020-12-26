package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		List<WebElement> ColNum = driver
				.findElements(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr/th"));
		System.out.println(ColNum.size());

		List<WebElement> RowNum = driver
				.findElements(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr/td"));
		System.out.println(RowNum.size());

		WebElement celldt = driver
				.findElement(By.xpath("//table[@class='w3-table-all notranslate']//tbody//tr[3]//td[6]"));

		String data = celldt.getText();

		System.out.println(data);

	}

}
