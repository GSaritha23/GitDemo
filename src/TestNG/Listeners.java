package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	@Override
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		System.out.println("i will execute on every test pass");
	  }

	@Override
	 public void onTestFailure(ITestResult result) {
		    // not implemented
		  }

	
	
	
	
}
