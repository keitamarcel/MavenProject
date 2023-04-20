package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.MenuPage;
import PageObject.ShopPage;
import utils.BaseTest;

public class Tema16trei extends BaseTest {

	@Test(priority=1)
	public void searchKing() {
		
			WebElement searchIcon=driver.findElement(app.menu.searchIcon);
			WebElement searchField=driver.findElement(app.menu.searchField);
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			
			jse.executeScript("arguments[0].click()",searchIcon);
			searchField.sendKeys("king");
			
			WebElement king =driver.findElement(By.xpath("//a[@href='https://keybooks.ro/shop/the-wicked-king/']"));
			jse.executeScript("arguments[0].click()",king);
			jse.executeScript("window.scrollBy(0,250)");
	}
	@Test(priority=2)
	public void verify() {
		
		WebElement category = driver.findElement(By.xpath("//a[@href='https://keybooks.ro/product-category/new-releases/']"));
		assertEquals(category.getText(), "New releases");
		
		WebElement productId = driver.findElement(By.xpath("//span[@class='product_id']"));
		assertEquals(productId.getText(), "Product ID: 1709");
		
		WebElement pozaUnu = driver.findElement(By.xpath("//img[@class='flex-active']"));
	    //boolean pozaUnuPresent= pozaUnu.isDisplayed();
		//assertEquals(pozaUnuPresent, "No image exist");
		
        //String src = pozaUnu.getAttribute("src");
			//return src.endsWith("TheWickedKing1-100x100.png");
	}
}
