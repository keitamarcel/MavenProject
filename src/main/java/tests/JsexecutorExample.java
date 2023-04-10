package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JsexecutorExample extends BaseTest{

	//@Test
	public void manageBrowserPage()  {
		JavascriptExecutor jse =(JavascriptExecutor)driver;
	jse.executeScript("window.location='http://emag.ro'");
		jse.executeScript("window.history.go(-1)");
		
		//refresh la pagina
		driver.navigate().refresh();
		//sau
		jse.executeScript("window.history.go(0)");
		//sau
		driver.navigate().to(driver.getCurrentUrl());
		
		
	}
	//@Test
	public void jsScroll() throws InterruptedException {
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		//face scroll pana jos
		Thread.sleep(2000);

		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//face scroll in sus
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		//face scroll pe web element sign up
		jse.executeScript("window.scrollTo(0,document.body.scrollheight)");
		
		WebElement signUpButton = driver.findElement(By.cssSelector("input[value='Sign up']"));
		//jse.executeScript("arguments[0].scrollIntoView();", signUpButton);
		Thread.sleep(4000);
//sau
		Actions action = new Actions(driver);
		action.moveToElement(signUpButton).perform();
	}
	@Test
	public void jsExample() {
		WebElement searchIcon=driver.findElement(app.menu.searchIcon);
		WebElement searchField=driver.findElement(app.menu.searchField);
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		
		//click
		jse.executeScript("arguments[0].click()",searchIcon);
		//sendKeys
		jse.executeScript("arguments[0].value='cooking'",searchField);
		jse.executeScript("arguments[0].click()",searchIcon);
		
		
		
		
		
	}
	
	
	
}
