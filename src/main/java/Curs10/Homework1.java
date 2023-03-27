package Curs10;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework1 extends BaseTest{




	@Test(priority =1)
	public void ClassNameLocator() {
		WebElement searchLogin = driver.findElement(By.className("popup_link"));
		assertTrue(searchLogin.isDisplayed());
		searchLogin.click();
		
	}
}