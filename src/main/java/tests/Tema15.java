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
		String javaScriptHover = "var objObject = document.createEvent('MouseEvents');"+

                 "objObject.initMouseEvent('mouseover',true);"+

                 "arguments[0].dispatchEvent(objObject);";

        

         MenuPage menu = new MenuPage(driver);

         WebElement blogElement =  driver.findElement(menu.blogLink);

         jse.executeScript(javaScriptHover, blogElement);

        

         WebElement postFormats = driver.findElement(menu.postFormatsLink); 

         jse.executeScript("arguments[0].click()",postFormats);
		//varianta2
		//MenuPage menu = new MenuPage(driver);
		////menu.navigateTo(menu.blogLink);
		//menu.hoverElement(menu.postFormatsLink);
		//menu.navigateTo(menu.postFormatsLink);
         
         //varianta3
		//jse.executeScript("window.location='https://keybooks.ro/category/post-formats/'");
		//jse.executeScript("window.scrollBy(0,2500)");
		
		WebElement GalleryFormat = driver.findElement(By.cssSelector("a[href='https://keybooks.ro/2016/02/01/gallery-format/']"));
		
		jse.executeScript("arguments[0].click()",GalleryFormat);
		jse.executeScript("window.scrollBy(0,3300)");
		
		WebElement textInputFiled =  driver.findElement(By.cssSelector("textarea[id='comment']"));
		assertTrue(textInputFiled.isDisplayed());
		//textInputFiled.sendKeys("altceva!");
		
		
		jse.executeScript("arguments[0].value='buna cartea'",textInputFiled);
		//jse.executeScript("arguments[0].scrollIntoView();", GalleryFormat);
		//Thread.sleep(4000);
		
		WebElement textInputName =  driver.findElement(By.cssSelector("input[id='author']"));
		assertTrue(textInputName.isDisplayed());
		jse.executeScript("arguments[0].value='Marky Mark'",textInputName);
		
		WebElement textInputEmail =  driver.findElement(By.cssSelector("input[id='email']"));
		assertTrue(textInputEmail.isDisplayed());
		jse.executeScript("arguments[0].value='m@m.com'",textInputEmail);
		
		WebElement textInputUrl =  driver.findElement(By.cssSelector("input[id='url']"));
		assertTrue(textInputUrl.isDisplayed());
		jse.executeScript("arguments[0].value='www.markymark.com'",textInputUrl);
		
		WebElement textInputCheck =  driver.findElement(By.cssSelector("input[id='wp-comment-cookies-consent']"));
		assertTrue(textInputCheck.isDisplayed());
		textInputCheck.click();
		
		WebElement textInputPost =  driver.findElement(By.cssSelector("input[name='submit']"));
		assertTrue(textInputPost.isDisplayed());
		textInputPost.click();
		
	}
	

}
