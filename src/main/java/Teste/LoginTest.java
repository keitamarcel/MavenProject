package Teste;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import PageObject.MenuPage;
import utils.BaseTest;
import utils.BaseTest;
import utils.BaseTest;

public class LoginTest extends BaseTest  {
	
@Test
public void loginTest() {
	MenuPage menu = new MenuPage(driver);
	menu.navigateTo(menu.contactsLink);
	menu.navigateTo(menu.loginLink);
	
	LoginPage login =new LoginPage(driver);
	login.loginInApp("TestUser", "12345@67890");
	
	assertTrue(login.successMsgisDisplayed());
	
	
	//TakesScreenshot poza =(TakesScreenshot)driver;
	//poza.getScreenshotAs(null)
}
	
	
	
}
