package corejavaconcepts;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int a[][] = new int[2][3];	
	 a[0][0]=3;	
	 a[0][1]=7;
	 a[0][2]=5;
	 
	 a[1][0]=4;	
	 a[1][1]=2;	
     a[1][2]=6;	

		
	System.out.println(a[1][1]);	
		
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<3;j++) {
				
			
			
			System.out.println(a[i][j]);
		}
		
		}
		
		
		
		
		
		

	}

}
