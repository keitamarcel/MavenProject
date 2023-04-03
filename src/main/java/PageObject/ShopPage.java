package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {
public WebDriver driver ;
public ShopPage(WebDriver driver) {
	this.driver = driver;
	
}
public By dropdown = By.name("orderby");
public void selectByValue(String value) {
	WebElement orderDropdown = driver.findElement(dropdown);
	
	Select selectObj = new Select(orderDropdown);
	selectObj.selectByValue(value);
}


}
