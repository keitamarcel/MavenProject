package Curs10;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionExample {

	String expectedTitle = "Test";
	String actualTitle="Altceva";
	
	@Test
	public void checkTitle() {
		//varianta 1
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test is passed");
		}else {
			System.out.println("test is failed");
		}
		
	}
	@Test
	public void checkTitle2() {
		assertEquals(expectedTitle,actualTitle);
		//varianta 2 hard assert , te scoate afara
	}
	
}
