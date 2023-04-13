package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.MenuPage;
import utils.BaseTest;

public class Tema15 extends BaseTest{
	@Test
	public void navigateBlog() throws InterruptedException {
		
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		
		
		//MenuPage menu = new MenuPage(driver);
		////menu.navigateTo(menu.blogLink);
		//menu.hoverElement(menu.postFormatsLink);
		//menu.navigateTo(menu.postFormatsLink);
		jse.executeScript("window.location='https://keybooks.ro/category/post-formats/'");
		jse.executeScript("window.scrollBy(0,2500)");
		
		WebElement GalleryFormat = driver.findElement(By.cssSelector("a[href='https://keybooks.ro/2016/02/01/gallery-format/']"));
		
		jse.executeScript("arguments[0].click()",GalleryFormat);
		jse.executeScript("window.scrollBy(0,3300)");
		
		WebElement textInputFiled =  driver.findElement(By.cssSelector("textarea[id='comment']"));
		assertTrue(textInputFiled.isDisplayed());
		//textInputFiled.sendKeys("altceva!");
		
		
		jse.executeScript("arguments[0].value='altceva'",textInputFiled);
		//jse.executeScript("arguments[0].scrollIntoView();", GalleryFormat);
		//Thread.sleep(4000);
	}
	

}
