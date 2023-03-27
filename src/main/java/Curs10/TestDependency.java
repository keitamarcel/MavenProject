package Curs10;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.*;

public class TestDependency {

	
	@Test (priority =1)
	public void method1() {
		assertTrue(false);
		System.out.println("1");
		//metoda 1 nu a trecut din cauza lui asserttrue
	}
	@Test (priority =2,dependsOnMethods = "method1")
	public void method2() {
		System.out.println("2");
		//skippped din cauza ca met 1 nu a trecut
	}
	@Test (priority =3)
	public void method3() {
		System.out.println("3");
		//doar metoda 3 trece
	}
	
}
