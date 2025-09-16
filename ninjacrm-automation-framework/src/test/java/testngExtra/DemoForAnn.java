package testngExtra;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoForAnn {
	
//	@AfterMethod
//	public void logOut() {
//		System.out.println("logout");
//	}
//	
//
//	@Test
//	public void createLeadsTest() {
//		System.out.println("Created leads successfully!!!");
//		System.out.println("Verified leads successfully !!!");
//	}
//
//
//
//	@AfterClass
//	public void closeBro() {
//		System.out.println("Close the browser");
//	}
//
//	@Test
//	public void createOppTest() {
//		System.out.println("Created opp successfully!!!");
//		System.out.println("Verified opp successfully !!!");
//	}
//
//
//	@BeforeMethod
//	public void login() {
//		System.out.println("login");
//	}
//
//	
//	@Test
//	public void createCamTest() {
//		System.out.println("Created campaign successfully!!!");
//		System.out.println("Verified campaign successfully !!!");
//	}
//
//	
//	@BeforeClass
//	public void openBro() {
//		System.out.println("browser opened");
//	}
	

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@Test
	public void test1() {
		System.out.println("----------Test method 1----------");
	}
	
	
	@Test
	public void test2() {
		System.out.println("----------Test method 2----------");
	}
	
	
	@Test
	public void test3() {
		System.out.println("----------Test method 3----------");
	}
	
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

}
