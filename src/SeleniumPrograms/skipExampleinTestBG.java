package SeleniumPrograms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class skipExampleinTestBG {

	@BeforeMethod // 1,4,7
	public void BM() {
		System.out.println("This is Before Method");
	}

	@Test(enabled = false)
	public void Test1() {
		System.out.println("This is TEST1");
	}

	@Test()
	public void Test2() {
		System.out.println("This is TEST2");
	}

	@Test()
	public void Test3() {
		System.out.println("This is TEST3");
	}

}
