package corejavaconcepts;

import java.util.ArrayList;

public class IfElseConditions {
	
	public static void main(String[] args) {
		
		 int[] arr2={5,8,10,4,3};
		   
		   for(int i=0;i<arr2.length;i++) {
			  
		   	
		
		  if(arr2[i]%2 ==0) {
			 System.out.println(arr2[i]);
			 
			 break;
			 
		  }
		  else {
			  System.out.println(arr2[i] + "which is not multiple of 2");
		  }
		
	}
		   
	ArrayList<String> a =new ArrayList<String>();	   
	a.add("saritha");	   
	a.add("venkat");	   
	System.out.println(a.get(1));	   
	 for(int i=0;i<a.size();i++) {
		 System.out.println(a.get(i));
		 
		 
	 }
		   
		   
		   
		   
		   
		   
		   
		   
		   

}
}