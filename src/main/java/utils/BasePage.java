package utils;

import PageObject.ContactPage;
import PageObject.MenuPage;
import PageObject.ShopPage;

public class BasePage extends BaseTest {

	public MenuPage menu= new MenuPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ContactPage contact = new ContactPage(driver);
	
	
}
