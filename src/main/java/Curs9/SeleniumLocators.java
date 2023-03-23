package Curs9;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SeleniumLocators {

	public WebDriver chrome;

	@BeforeClass
		public void setup() {
			ChromeOptions chOpt = new ChromeOptions();
			chOpt.addArguments("--remote-allow-origins=*");
			 chrome = new ChromeDriver(chOpt);
	chrome.get("http://keybooks.ro/");
	}
			 @AfterClass
				public void tearDown() {
	
				 chrome.quit();
}
	
		@Test(priority =1)
	public void linkTextLocator() {
		WebElement bookslink = chrome.findElement(By.linkText("BOOKS"));
		bookslink.click();
		assertEquals(chrome.getCurrentUrl(),"https://keybooks.ro/shop/");
	}
		@Test(priority =2)
		public void partialLinkTextLocator() {
			WebElement cookingBook = chrome.findElement(By.partialLinkText("Cooking"));
			cookingBook.click();
		}
		@Test(priority =3)
		public void ClassNameLocator() {
			WebElement searchIcon = chrome.findElement(By.className("icon-search"));
			searchIcon.click();
			
		}
		@Test(priority =4)
		public void nameLocator() {
			WebElement searchField = chrome.findElement(By.name("s"));
			searchField.sendKeys("TEST");
		}

}
