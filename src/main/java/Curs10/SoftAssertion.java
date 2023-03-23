package Curs10;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void softAssertion() {
		System.out.println("soft assert start");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("soft assert continues");
	sa.assertEquals(10, 16);;
	sa.assertEquals("test", "nimic");
	System.out.println("soft assert ends here");
	sa.assertAll(); //mandatory
	
	
	}
	
	
	
	@Test
	public void hardAssertion() {
		System.out.println("hard assert start");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("hard assert continues");
	sa.assertEquals(10, 16);;
	sa.assertEquals("test", "nimic");
	System.out.println("hard assert ends here");
	sa.assertAll(); //mandatory
	}
	
	
	
}
