package corejavaconcepts;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int l=1;
		
		for(int i=0;i<=4;i++) {
			
			
			
			for(int j=1;j<=4-i;j++) {
				
				
				System.out.print(l);
				System.out.print("\t");

				l++;
				
				
			}
			
			System.out.println("");
			
		}
		


	}

}
