package Curs10;
import org.testng.annotations.*;
public class BeforeAfter {
	
@BeforeSuite

	public void beforeSuite() {
	System.out.println("Before Suite");
}
@AfterSuite
public void afterSuite() {
System.out.println("Before Suite");
	
}
// @BeforeTest se refera la test din testng.xml
@BeforeClass

public void beforeClass() {
System.out.println("Before Class");
}
@AfterClass
public void afterClass() {
System.out.println("Before Suite");

}

@BeforeMethod

public void beforeMethod() {
System.out.println("Before Method");
}
@AfterMethod
public void afterMethod() {
System.out.println("Before Method");

}
@Test
public void test1()  {
	System.out.println("test 1");
}
	@Test
	public void test2()  {
		System.out.println("test 2");
}


}