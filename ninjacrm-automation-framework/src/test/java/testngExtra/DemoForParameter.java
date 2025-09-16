package testngExtra;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoForParameter {
	
	@Parameters({"un","pwd"})
	@Test
	public void case21(String username, String password) {	
		System.out.println(username );
		System.out.println(password );
	}
}
