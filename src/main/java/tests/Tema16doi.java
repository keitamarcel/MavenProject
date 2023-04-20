package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.MenuPage;
import utils.BaseTest;

public class Tema16doi extends BaseTest{

	@Test(priority=1)
	public void navigateBooks() throws InterruptedException {
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
	
		MenuPage menu = new MenuPage(driver);
			menu.navigateTo(menu.shopLink);
			
			jse.executeScript("window.scrollBy(0,700)");
	
			WebElement Recepies = driver.findElement(By.xpath("//a[@href='https://keybooks.ro/shop/a-hundred-and-one-receipes/']"));
			jse.executeScript("arguments[0].click()",Recepies);
	}
	@Test(priority=2)
	public void Displayed() {
		
		    WebElement lupa =  driver.findElement(By.xpath("//a[@class='woocommerce-product-gallery__trigger']"));
		    assertTrue(lupa.isDisplayed());
		    
			WebElement stars =  driver.findElement(By.xpath("//div[@class='star-rating']"));
			assertTrue(stars.isDisplayed());
		
			
			WebElement name =  driver.findElement(By.xpath("//div[@class='product_title entry-title']"));
			assertTrue(name.isDisplayed());
			
			WebElement amount =  driver.findElement(By.xpath("//span[@class='woocommerce-Price-amount amount']"));
			assertTrue(amount.isDisplayed());
			
			WebElement text =  driver.findElement(By.xpath("//div[@class='woocommerce-product-details__short-description']"));
			assertTrue(text.isDisplayed());
		
			WebElement quantity =  driver.findElement(By.xpath("//input[@type='number']"));
			assertTrue(quantity.isDisplayed());
			
			WebElement addCart =  driver.findElement(By.xpath("//button[@name='add-to-cart']"));
			assertTrue(addCart.isDisplayed());
		
			WebElement meta =  driver.findElement(By.xpath("//div[@class='product_meta']"));
			assertTrue(meta.isDisplayed());
			
}
}