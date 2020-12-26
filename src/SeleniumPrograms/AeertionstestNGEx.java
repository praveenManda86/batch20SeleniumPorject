package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AeertionstestNGEx {

	@Test
	public void login() {

	int A =10;
	int B = 20;
	int C= A+B;
	
	Assert.assertEquals(300, C);
}
}