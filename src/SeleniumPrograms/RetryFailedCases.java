package SeleniumPrograms;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedCases implements IRetryAnalyzer {

	int cnt = 0;
	int retryTimes = 3;

	public boolean retry(ITestResult result) {

		if (cnt < retryTimes) {
			cnt++;
			return true;
		}

		return false;
	}

}
