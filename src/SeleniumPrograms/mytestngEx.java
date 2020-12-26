package SeleniumPrograms;

import org.testng.annotations.*;

public class mytestngEx {

	@BeforeSuite
	public void BS() {
		System.out.println("hi this before suite method");
	}

	@BeforeTest
	public void BT() {
		System.out.println("hi this before test method");
	}

	@BeforeClass
	public void BC() {
		System.out.println("hi this before Class method");
	}

	@BeforeMethod
	public void BM() {
		System.out.println("hi this before  method");
	}

	@Test
	public void hello1() {
		System.out.println("Test case 1");
	}

	@Test
	public void hello2() {
		System.out.println("Test case 2");
	}

	@Test
	public void hello3() {
		System.out.println("Test case 3");
	}

	@AfterMethod
	public void AM() {
		System.out.println("hi this After  method");
	}

	@AfterClass
	public void AC() {
		System.out.println("hi this After  Class");
	}

	@AfterTest
	public void AT() {
		System.out.println("hi this After  test");
	}

	@AfterSuite
	public void AS() {
		System.out.println("hi this After  Suite");
	}

}
