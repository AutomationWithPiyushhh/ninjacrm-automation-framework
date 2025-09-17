package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssert {
	@Test
	public void case1() {
		boolean a = true;
		boolean b = false;

		String x = "a";
		String y = "a";
		String z = "b";
		
		Object o1 = null;
		Object o2 = new Object();
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(b);
		sa.assertFalse(a);
		
		sa.assertEquals(x, z);
		sa.assertNotEquals(x, y);
		
		sa.assertNull(o2);
		sa.assertNotNull(o1);
		
		sa.assertAll();
	}
}
