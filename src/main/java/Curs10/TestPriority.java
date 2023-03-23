package Curs10;
import org.testng.annotations.*;
public class TestPriority {
	
	
@Test(priority =0)
	public void one() {
		System.out.println("1");
		
	}
@Test(priority =1)
public void two() {
	System.out.println("2");
	
}
@Test(priority=2)
public void three() {
	System.out.println("3");
	
}	
	
	
	
	
}
