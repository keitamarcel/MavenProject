package Curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScript {
	
public WebDriver chrome;

@BeforeClass
	public void setup() {
		ChromeOptions chOpt = new ChromeOptions();
		chOpt.addArguments("--remote-allow-origins=*");
		 chrome = new ChromeDriver(chOpt);
	}
	@Test
	public void openBrowser() {
		
	
		chrome.get("https://keybooks.ro/");
		System.out.println(chrome.getTitle());
		
	chrome.findElement(By.linkText("CONTACTS")).click();
		
		
		
	}
	@AfterClass
	public void tearDown() {
		chrome.quit();
		
	}
}
