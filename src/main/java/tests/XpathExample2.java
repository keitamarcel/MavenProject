package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample2  extends BaseTest{

	@Test
	public void xpathExample() {
		//child se leaga de parinte in sus
		//a[contains(@class,'popup_link')]/parent::li[@class='menu_user_login']
		//parintele se leaga de copil in jos
		//a[contains(@class,'popup_link')]/a
		//li[@class='menu_user_login']/child::a[contains(@class,popup_link)]
		driver.findElement(By.xpath("//a[contains(@class, 'popup_link')]/parent::li[@class='menu_user_login']")).click();
		
		//din parinte pana la ultimul copil
		//driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]/child::div[contains(@class, 'login_field')/child::input[@id='log']]"));
		//sau
		WebElement username =driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]/child::div[contains(@class, 'login_field')]/child::input[@id='log']"));
		username.sendKeys("TestUser");
		//strabunic pana la nepot
		driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::input[@id='password']")).sendKeys("12345@67890");
		
		//siblings
		driver.findElement(By.xpath("//div[contains(@class, 'login_field')]/following-sibling::div[contains(@class, 'remember_field')]/input")).click();
		
		// plecam de jos in sus //preceding
		driver.findElement(By.xpath("//form[contains(@class, 'login_form')]/preceding::input[@class='submit_button']")).click();
		
	}
	
}
