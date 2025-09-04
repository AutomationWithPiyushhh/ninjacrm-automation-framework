package testngExtra;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void case1() {
//		System.out.println("Hey there!!!");
		Reporter.log("Hey there!!!");
	}
	
	@Test
	public void case2() {
//		System.out.println("Hellowwww...");
		Reporter.log("Hellowwww...");
	}
	
	@Test
	public void case3() {
//		System.out.println("How do you do ???");
		Reporter.log("How do you do ???");
	}
}
