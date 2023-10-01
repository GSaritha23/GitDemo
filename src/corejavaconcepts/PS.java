package corejavaconcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
	
	@BeforeMethod
	public void demo() {
		
		System.out.println("before test");
		
	}
  @AfterMethod
  public void sub() {
	 System.out.println("after test"); 
	  
	  
	  
  }
}
