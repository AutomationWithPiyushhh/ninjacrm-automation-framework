package testngExtra;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo5 {
	WebDriver driver;

	@Test(invocationCount = 3)
	public void createCity() {
		String city = "Delhi";
		System.out.println("Create " + city);
	}

	@Test(dataProvider = "getData")
	public void createNewCity(String city,String state) {
//		String city = "New Delhi";
//		String state = "Delhi";
		System.out.println(city + ":" + state);
	}

	@DataProvider
	public String[][] getData() {
		String[][] arr = new String[5][2];
//		no of rows => no of execution
//		no of cols => no of parameters
		arr[0][0] = "New Delhi";
		arr[0][1] = "Delhi";

		arr[1][0] = "Surat";
		arr[1][1] = "Gujarat";

		arr[2][0] = "Banglore";
		arr[2][1] = "Karnataka";

		arr[3][0] = "Guwahati";
		arr[3][1] = "Assam";

		arr[4][0] = "Panji";
		arr[4][1] = "Goa";

		return arr;
	}
}
