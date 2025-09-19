package working_with_Ad_reports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Instagram {
	@Test
	public void openInsta() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./advance_reports/rep1.html");
		spark.config().setDocumentTitle("Insta-report");
		spark.config().setReportName("login page");
		spark.config().setTheme(Theme.DARK);
	
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("browser", "chrome");
		report.setSystemInfo("browserVersion", "chrome138");
		report.setSystemInfo("os", "windows");
		report.setSystemInfo("version", "11");
		
		ExtentTest test = report.createTest("openInsta");
		test.log(Status.INFO, "Hey there !!!");
		test.log(Status.PASS, "This is passed....");
		test.log(Status.WARNING, "This is warning....");
		test.log(Status.SKIP, "This is skipped....");
		test.log(Status.FAIL, "This is failed....");
		
		report.flush();	
		
		System.out.println("report generated successfully!!!");
		
		driver.quit();
	}
}
