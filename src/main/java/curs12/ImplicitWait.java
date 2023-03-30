package curs12;

import org.testng.annotations.Test;

import utils.BaseTest;

public class ImplicitWait extends BaseTest{
	
	@Test 
	public void testWait() {
		
	
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	
	}
	
	
	
	

}
