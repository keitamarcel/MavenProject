package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.MenuPage;
import utils.BaseTest;
import utils.Log;

public class LoginTest  extends BaseTest {
	
	@Parameters({"user","pass"})
	@Test
	public void loginTest(String username, String password) {
		//assertTrue(false);
		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		menu.navigateTo(menu.loginLink);
		
		Log.info("Test logging");
		LoginPage login = new LoginPage(driver);
		login.loginInApp(username,password);
		
		assertTrue(login.successMsgisDisplayed());
		
	}
	

}
