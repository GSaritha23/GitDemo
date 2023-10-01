package corejavaconcepts;

public class DataTypes {

	public static void main(String[] args) {
	
	int num=5;
	String s="hello saritha";
    char letter='v';
   double value=4.5;
   boolean var=true;
   System.out.println(num + "this is my number");
   System.out.println("var");
   
   int[] arr = new int[5];
   arr[0]=4;
   arr[1]=8;
   arr[2]=10;
   arr[3]=5;
   arr[4]=29;
   
   System.out.println(arr[4]);
   
   int[] arr2={5,8,10,4,3};
   System.out.println(arr2[2]);
   for(int i=0;i<arr.length;i++) {
	   System.out.println(arr[i]);
   }
   
   for(int i=0;i<arr2.length;i++) {
	   System.out.println(arr2[i]);
   }
   
   String[] num1 = {"saritha","adhvik","venkat","hanika"};
   for(int i=0;i<num1.length;i++) {
	   System.out.println(num1[i]);
	   
	   
	for(String s1: num1) {
		System.out.println(s1);
		
	}
	   
	   
	   
	   
	   
	   
	   
   }
   
   
   
   
   
   
   
	}
   
   
} 