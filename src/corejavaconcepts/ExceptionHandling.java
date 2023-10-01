package corejavaconcepts;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		 int b=0;
		 
		 try 
		 {
			 
			 int k=a/b;
			 System.out.println(k);
		 }
		 
		 catch(ArithmeticException ae) {
			 
			 System.out.println("i am arthematic exception");
			 
		 }
		
		catch(Exception e) 
		 {
			
			System.out.println("i am the exception");
		}
		
    finally{
    	
    	System.out.println("delete cookies");
    	
    }
	}

}
