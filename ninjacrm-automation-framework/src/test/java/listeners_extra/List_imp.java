package listeners_extra;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
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

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");
		String time = now.format(dtf);
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./advance_reports/ "+ time +".html");
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
		System.out.println(result.getMethod().getMethodName() + " starts...");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "This is passed....");
		System.out.println(result.getMethod().getMethodName() + " got passed...");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "This is failed....");
		System.out.println(result.getMethod().getMethodName() + " got failed...");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "This is skipped....");
		System.out.println(result.getMethod().getMethodName() + " got skipped...");
	}

}

//
//class justToprove{
//	@Test
//	public void demo() {
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now);
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");
//		String time = now.format(dtf);
//		System.out.println(time);
//		
//	}
//}