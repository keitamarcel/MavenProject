package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.MenuPage;
import utils.BaseTest;

public class Tema16 extends BaseTest{
	
	@Test
	public void navigateBlog() throws InterruptedException {
		
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		String javaScriptHover = "var objObject = document.createEvent('MouseEvents');"+

                 "objObject.initMouseEvent('mouseover',true);"+

                 "arguments[0].dispatchEvent(objObject);";

        

         MenuPage menu = new MenuPage(driver);

         WebElement blogElement =  driver.findElement(menu.blogLink);

         jse.executeScript(javaScriptHover, blogElement);

        

         WebElement classic = driver.findElement(menu.classicLink); 

         jse.executeScript("arguments[0].click()",classic);
         jse.executeScript("window.scrollBy(0,3300)");
         
         WebElement FiveAudio = driver.findElement(By.xpath("//a[@href='https://keybooks.ro/2016/02/02/five-best-audiobook/']"));
 		jse.executeScript("arguments[0].click()",FiveAudio);
 		
 		jse.executeScript("window.scrollBy(0,1500)");
 		
 		
 		WebElement textInputFiled =  driver.findElement(By.xpath("//textarea[@id='comment']"));
		assertTrue(textInputFiled.isDisplayed());
		jse.executeScript("arguments[0].value='Fantastic...!'",textInputFiled);
		
		WebElement textInputName =  driver.findElement(By.xpath("//input[@id='author']"));
		assertTrue(textInputName.isDisplayed());
		jse.executeScript("arguments[0].value='Marky Mark'",textInputName);
		
		WebElement textInputEmail =  driver.findElement(By.xpath("//input[@id='email']"));
		assertTrue(textInputEmail.isDisplayed());
		jse.executeScript("arguments[0].value='m@m.com'",textInputEmail);
		
		WebElement textInputUrl =  driver.findElement(By.xpath("//input[@id='url']"));
		assertTrue(textInputUrl.isDisplayed());
		jse.executeScript("arguments[0].value='www.markymark.com'",textInputUrl);
		
		WebElement textInputCheck =  driver.findElement(By.xpath("//input[@id='wp-comment-cookies-consent']"));
		assertTrue(textInputCheck.isDisplayed());
		textInputCheck.click();
		
		WebElement textInputPost =  driver.findElement(By.xpath("//input[@name='submit']"));
		assertTrue(textInputPost.isDisplayed());
		textInputPost.click();
		
		jse.executeScript("window.scrollBy(0,-500)");
		
		WebElement message =  driver.findElement(By.xpath("//div[@class='comment_not_approved']"));
		assertTrue(message.isDisplayed());
		
		
}
}
