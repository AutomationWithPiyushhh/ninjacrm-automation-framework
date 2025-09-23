package listeners_extra;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners_extra.List_imp.class)
public class JustToProve3 {

	@Test
	public void case3() {
		System.out.println("hey");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "case3")
	public void case4() {
		System.out.println("hey");
		Assert.assertTrue(true);
	}
}
