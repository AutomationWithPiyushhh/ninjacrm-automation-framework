package listeners_extra;

import org.testng.Assert;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class List_imp implements ISuiteListener, ITestListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("db conn + report config");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("db conn close + report backup");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("yayyy !!! it got passed.....");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Sheyyyyyy !!!! It got failed.......");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped....");
	}

}


@Listeners(listeners_extra.List_imp.class)
class JustToProve{
	
	
	@Test
	public void case1() {
		System.out.println("Execution");
		Assert.assertTrue(false);
	}
}
