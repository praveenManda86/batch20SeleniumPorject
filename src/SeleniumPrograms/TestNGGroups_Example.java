package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGroups_Example {

	@BeforeMethod // 1,4,7
	public void BM() {
		System.out.println("This is Before Method");
	}

	@Test(priority = 0, groups = { "Admin" }, invocationCount = 5)
	public void Test1() {
		System.out.println("This is TEST1");
	}

	@Test(priority = 1, groups = { "Admin" })
	public void Test2() {
		System.out.println("This is TEST2");
	}

	@Test(groups = { "Admin" }, invocationCount = 3)
	public void Test3() {
		System.out.println("This is TEST3");
	}

	@Test(groups = { "Customer" })
	public void Test4() {
		System.out.println("This is TEST4");
	}

	@Test(groups = { "Customer" })
	public void Test5() {
		System.out.println("This is TEST5");
	}

	@Test(groups = { "Customer" })
	public void Test6() {
		System.out.println("This is TEST6");
	}

	@AfterMethod // 3,6,9
	public void AM() {

		System.out.println("This is After Method");
	}

}
