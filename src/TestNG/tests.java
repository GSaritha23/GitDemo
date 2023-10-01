package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tests {
	
	
	
	@Test(groups= {"smoke"})
	public void regular() {
		
		System.out.println("hello chittodu");
		
		
	}
	
	@Parameters({"URL"})
	@Test
	public void name(String uname) {
		
		System.out.println("hello adhvik");
	System.out.println(uname);
		
	}
	

}
	
	
	
	
	
	
	
	
	
	
	
