package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPriority_Example {

	@BeforeMethod       //1,4,7
	public void BM() {
		System.out.println("This is Before Method");
	}

	@Test(priority=1)
	public void Test1() {
		System.out.println("This is TEST1");
	}

	@Test(priority=2)
	public void Test2() {
		System.out.println("This is TEST2");
	}

	@Test(priority=0)
	public void Test3() {
		System.out.println("This is TEST3");
	}
	

	@Test(priority=0)
	public void Test4() {
		System.out.println("This is TEST4");
	}

	@AfterMethod   //3,6,9
	public void AM() {

		System.out.println("This is After Method");
	}

}
