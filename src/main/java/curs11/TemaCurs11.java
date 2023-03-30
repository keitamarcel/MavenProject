package curs11;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class TemaCurs11 extends BaseTest {
	


	@Test(priority =1)
	public void findElements() {

		List<WebElement> books = driver.findElements(By.cssSelector("h3[class*='sc_title']"));
		System.out.println(books.size());
		books.get(5).click();



	}
	@Test(priority= 2)
	public void cssSelector2() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement review = driver.findElement(By.cssSelector("a[href='#tab-reviews']"));
		review.click();
		WebElement reviewStar = driver.findElement(By.cssSelector("a[class='star-4']"));
		reviewStar.click();
		
	}
	
	
	
	@Test(priority=3)
	public void isSelectedTest() {
		
		driver.findElement(By.cssSelector("p[class*='comment-form-cookies-consent']")).click();
		WebElement saveMe = driver.findElement(By.cssSelector("p [class^='Save me'] input#Save me"));
		
		System.out.println(saveMe.isSelected());
		
		saveMe.click();
		System.out.println(saveMe.isSelected());
		assertTrue(saveMe.isSelected());
		
		
		
	}
	@Test(priority=4)
	public void SelectedTest() {
	driver.findElement(By.cssSelector("p[class*='form-submit']>#submit")).click();
	WebElement submit = driver.findElement(By.cssSelector("p[class*='form-submit']>#submit"));
	
	}
	
		
	@Test(priority=5)
		public void simpleJsALert() throws InterruptedException {
			
			driver.get("https://keybooks.ro/shop/storm");
			
			driver.findElement(By.cssSelector("button[onclick*='jsAle']")).click();
			
			Thread.sleep(3000);	
			
			//driver.switchTo().alert().accept();
			
			Alert alertJs = driver.switchTo().alert();
			alertJs.accept();
			
			WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
			
			assertEquals(result.getText(), "You successfully clicked an alert");
			
		}
	@Test(priority=6)
		public void cssSelector3() {
		WebElement review = driver.findElement(By.cssSelector("a[href='#tab-reviews']"));
		review.click();
		
	}
	
	@Test(priority = 7)
	public void cssLocator4() {
		WebElement nameInputFiled =  driver.findElement(By.cssSelector("input[id='author']"));
		assertTrue(nameInputFiled.isDisplayed());
		nameInputFiled.sendKeys("Johnny Bravo");
	}
	@Test(priority = 8)
	public void cssLocator5() {
		WebElement emailInputFiled =  driver.findElement(By.cssSelector("input[id='email']"));
		assertTrue(emailInputFiled.isDisplayed());
		emailInputFiled.sendKeys("jb@abc.com");
	}
	@Test(priority = 9)
	public void cssLocator6() {
		WebElement textInputFiled =  driver.findElement(By.cssSelector("textarea[id='comment']"));
		assertTrue(textInputFiled.isDisplayed());
		textInputFiled.sendKeys("Book was delightfull!");
	}
	@Test(priority= 10)
	public void cssSelector7() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement reviewStar = driver.findElement(By.cssSelector("a[class='star-4']"));
		reviewStar.click();
		
	}
	@Test(priority=10)
	public void SSelectedTest() {
		
		driver.findElement(By.cssSelector("p[class*='comment-form-cookies-consent']")).click();
		WebElement saveMe = driver.findElement(By.cssSelector("p [class^='Save me'] input#Save me"));
		
		System.out.println(saveMe.isSelected());
		
		saveMe.click();
		System.out.println(saveMe.isSelected());
		assertTrue(saveMe.isSelected());
		
		
		
	}
	@Test(priority=11)
	public void SelectedTest1() {
	driver.findElement(By.cssSelector("p[class*='form-submit']>#submit")).click();
	WebElement submit = driver.findElement(By.cssSelector("p[class*='form-submit']>#submit"));
	
	WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
	assertEquals(result.getText(), "Your review is waiting approval");
	
	}
	
	
}
	
	
	
	
	
	
	
	
	
	

