package listeners_extra;

import org.testng.Assert;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class List_imp implements ISuiteListener, ITestListener {
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onStart(ISuite suite) {

		ExtentSparkReporter spark = new ExtentSparkReporter("./advance_reports/rep3.html");
		spark.config().setDocumentTitle("Insta-report");
		spark.config().setReportName("login page");
		spark.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("browser", "chrome");
		report.setSystemInfo("browserVersion", "chrome138");
		report.setSystemInfo("os", "windows");
		report.setSystemInfo("version", "11");
	}

	@Override
	public void onFinish(ISuite suite) {
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "This is passed....");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "This is failed....");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "This is skipped....");
	}

}

@Listeners(listeners_extra.List_imp.class)
class JustToProve {

	@Test
	public void case1() {
		System.out.println("hey");
		Assert.assertTrue(true);
	}

	@Test
	public void case2() {
		System.out.println("hey");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "case2")
	public void case3() {
		System.out.println("hey");
		Assert.assertTrue(true);
	}
}
