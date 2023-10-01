package corejavaconcepts;

public class Strings {

	public static void main(String[] args) {
	
	String s = "saritha";
	String s1 = "venkat";
	
	String s2 = "adhvik";
	String s3 = "hanika";
	
	String s4 = "saritha loves venkat";
	String[] splittedString = s4.split("loves" );
	
   System.out.println(splittedString[0]);
   
	
	for(int i=0;i<s4.length();i++) {
		
	
	System.out.println(s4.charAt(i));
	
	}
	
	for(int i=s4.length()-1;i>=0;i--) {
		System.out.println(s4.charAt(i));
	}
	
	
	
	
	
	}

	

	
}

