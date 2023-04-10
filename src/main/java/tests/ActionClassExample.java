package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObject.ContactPage;
import PageObject.MenuPage;
import PageObject.PostFormatsPage;
import PageObject.ShopPage;
import utils.BaseTest;

public class ActionClassExample extends BaseTest{
//@Test(priority=1)
public void  gragAndDropTest() {
	MenuPage menu =new MenuPage(driver);
	menu.navigateTo(menu.shopLink);
	
	ShopPage shop = new ShopPage(driver);
	shop.dragAndDrop(shop.sliderInitialPosition, 100, 0);
shop.dragAndDrop(shop.sliderFinalPosition, -100, 0);
	
	
	
}
//@Test(priority=2)
public void hoverExample() {
	MenuPage menu = new MenuPage(driver);
	menu.hoverElement(menu.blogLink);
	menu.hoverElement(menu.postFormatsLink);
	menu.navigateTo(menu.postFormatsLink);
}
//@Test(priority=3)
public void sendKeysExample() {
	//combinatie de taste
	PostFormatsPage postFormat = new PostFormatsPage(driver);
	
	WebElement searchField =driver.findElement(postFormat.searchField);
	Actions action= new Actions(driver);
	action.moveToElement(searchField)
.keyDown(Keys.SHIFT)
.sendKeys(searchField, "abracadabra")
.perform();
}
//@Test 
public void sendKeysExample2() throws InterruptedException {
	//identific pe primul(adresa de la contact us) si apoi ma arunca in tab
	MenuPage menu = new MenuPage(driver);
	menu.navigateTo(menu.contactsLink);
	ContactPage contactPage =new ContactPage(driver);
	WebElement nameField =driver.findElement(contactPage.nameField);
	Actions action =new Actions(driver);
	action
	.moveToElement(nameField)
	.sendKeys(nameField, "Nume")
	.sendKeys(Keys.TAB, "email@email.com")
	.sendKeys(Keys.TAB,"my subject")
	.sendKeys(Keys.TAB, "My message")
	.sendKeys(Keys.TAB, Keys.ENTER)
	.perform();
	Thread.sleep(4000);
}
@Test
public void doubleClickExample() throws InterruptedException {
	MenuPage menu =new MenuPage(driver);
	menu.navigateTo(menu.shopLink);
	
	ShopPage shop =new ShopPage(driver);
	WebElement addToCart= driver.findElement(shop.addToCartButton);
	JavascriptExecutor jse =(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,1500)");
	
	
	Actions action = new Actions(driver);
	action.doubleClick(addToCart).perform();
	
	Thread.sleep(4000);
	
	
}




}