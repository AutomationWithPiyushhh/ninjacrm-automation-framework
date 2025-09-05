package testngExtra;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
//	public static void main(String[] args) {
//		
//	}

	@Test(groups = "reg")
	public void case4() {
		System.out.println("Hey !!!"); // Console
		Reporter.log("Hellow...", true); // Report
	}

	@Test(groups = "smoke")
	public void case5() {
		System.out.println("Hey !!!"); // Console
		Reporter.log("Smoke", true); // Report
	}

	@Test(groups = "reg")
	public void case6() {
		System.out.println("Hey !!!"); // Console
		Reporter.log("Hellow...", true); // Report
	}
}
