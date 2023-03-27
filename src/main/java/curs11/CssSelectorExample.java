package curs11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectorExample  extends BaseTest {

	@Test
	public void cssSelectorTest() {
		
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", loginMenu);
		
		//. --> class
		//.logo_slogan --> cauta orice element 
		//div.logo_slogan
		//div[class='logo_slogan']
		WebElement logo = driver.findElement(By.cssSelector("div.logo_slogan"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", logo);
	
		
		WebElement inspireText = driver.findElement(By.cssSelector("#menu_user"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", inspireText);
	
	
	
	}

	
	
	
}
