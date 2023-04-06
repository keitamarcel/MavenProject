package tests;

import org.testng.annotations.Test;

import PageObject.MenuPage;
import PageObject.ShopPage;
import utils.BaseTest;

public class ActionClassExample extends BaseTest{
@Test
public void  gragAndDropTest() {
	MenuPage menu =new MenuPage(driver);
	menu.navigateTo(menu.shopLink);
	
	ShopPage shop = new ShopPage(driver);
	shop.dragAndDrop(shop.sliderInitialPosition, 100, 0);
shop.dragAndDrop(shop.sliderFinalPosition, -100, 0);
	
	
	
}
@Test
public void hoverExample() {
	MenuPage menu = new MenuPage(driver);
	menu.hoverElement(menu.blogLink);
	menu.hoverElement(menu.postFormatsLink);
	menu.navigateTo(menu.postFormatsLink);
}

}
