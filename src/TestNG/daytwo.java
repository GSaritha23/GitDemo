 package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class daytwo {
	
	
	@AfterTest
	public void sum() {
		System.out.println("i will execute last");
	}
	
	@Test
	public void webLoginHomeLoan() {
		
	System.out.println("webloginhome");	
	
		
	}
	@BeforeSuite
	public void bfsuite() {
		
	System.out.println("i will be no 1");	
		
	}
	
	@Test
	public void mobileLoginHomeLoan() {
		
	System.out.println("mobileloginhome");	
		
	}
	@Test
	public void mobilesigninHomeLoan() {
		
	System.out.println("mobilesigninhome");	
		
	}
	
	@Test(groups= {"smoke"})
	public void mobilesignoutHomeLoan() {
		
	System.out.println("mobilesignouthome");	
		
	}
	
	@BeforeMethod
	public void bm() {
		
	System.out.println("i will execute betore every test in daytwo");	
		
	}
	@AfterMethod
	public void am() {
		
	System.out.println("i will execute after every test in daytwo");	
		
	}
	
	@Test
	public void mobilesignupHomeLoan() {
		
	System.out.println("mobilesignuphome");	
		
	}
	@BeforeSuite
	public void bfsuite1() {
		
	System.out.println("i will be no 1");	
		
	}
	@AfterSuite
	public void afsuite() {
		
	System.out.println("i will be the last from no 1");	
		
	}
	
	@Test
   public void loginApiHomeLoan() {
	   
	System.out.println("loginapihome");   
	   
	   
   }
   @BeforeTest
   public void add() {
	   System.out.println("i will execute first");
   }

}
