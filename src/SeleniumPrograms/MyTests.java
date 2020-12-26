package SeleniumPrograms;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MyTests {

	@Test (retryAnalyzer = RetryFailedCases.class)
	public void Tc1() {
		Assert.assertEquals(true, false);
		Assert.assertEquals(true, true);
	}

	@Test
	public void Tc2() {
		Assert.assertEquals(true, true);
	}

	@Test
	public void Tc3() {
		Assert.assertEquals(true, true);
	}
	
	@Test(retryAnalyzer = RetryFailedCases.class)
	public void Tc4() {
		Assert.assertEquals(true, false);
	}


}
