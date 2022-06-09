package Base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	int counter=0;
	int retry=4;
	@Override
	public boolean retry(ITestResult result) {
		if(counter<retry) {
			counter++;
			return true;
		}
		return false;
	}
	
	
	
}