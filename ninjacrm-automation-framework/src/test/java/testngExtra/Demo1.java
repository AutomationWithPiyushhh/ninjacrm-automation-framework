package testngExtra;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
//	public static void main(String[] args) {
//		
//	}
	
	@Test(groups = "smoke")
	public void case1() {
		System.out.println("Hey !!!"); // Console
		Reporter.log("Smoke", true); //Report
		
	}
	
	@Test(groups = "reg")
	public void case2() {
		System.out.println("Hey !!!"); // Console
		Reporter.log("Hellow...", true); //Report
	}
	
	@Test(groups = "smoke")
	public void case3() {
		System.out.println("Hey !!!"); // Console
		Reporter.log("Smoke", true); //Report
	}
}
