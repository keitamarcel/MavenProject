package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.MenuPage;
import PageObject.ShopPage;
import utils.BaseTest;
import utils.TestNGListener;

@Listeners(TestNGListener.class)
public class DropdownExample extends BaseTest{

	
	@Test
	public void selectByValueTest() {
		MenuPage menu =  new MenuPage(driver);
		ShopPage shop =  new ShopPage(driver);
		
		menu.navigateTo(menu.shopLink);
		shop.selectByValue("price");
		assertEquals(shop.getSelectedOption(), "Sort by price: low to high");
	}
	
	
	@Test
	public void selectByIndex() {
		MenuPage menu =  new MenuPage(driver);
		ShopPage shop =  new ShopPage(driver);
		
		menu.navigateTo(menu.shopLink);
		shop.selectByIndex(10);
		assertEquals(shop.getSelectedOption(), "Sort by latest");
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/?orderby=date");
	}
	
	@Test
	public void selectByVisibleText() {
		MenuPage menu =  new MenuPage(driver);
		ShopPage shop =  new ShopPage(driver);
		
		menu.navigateTo(menu.shopLink);
		shop.selectByVisibleText("Sort by popularity");
	}
	
}

