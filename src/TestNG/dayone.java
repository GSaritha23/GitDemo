package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class dayone {
	
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String urlname ) {
		
	System.out.println("weblogincar");	
	System.out.println(urlname);	
	}
	@Test
	public void mobileLoginCarLoan() {
		
	System.out.println("mobilelogincar");	
		
	}
	@Test(dataProvider="getData")
   public void loginApiCarLoan(String username,String pswd) {
	   
	System.out.println("loginapicar");   
	 System.out.println(username);  
	 System.out.println(pswd); 
   }
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="firstusername";
	    data[0][1]="firstpswd";
		
		data[1][0]="secondusername";
		data[1][1]="secondpswd";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpswd";
		
		return getData();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
