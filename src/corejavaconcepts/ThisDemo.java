package corejavaconcepts;

public class ThisDemo {
	
	
	
	int a=5;
	
	public void add() {
		
		int a=8;
	int b=	a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		
	}
	
	
	public static void main (String[] args) {
		
		ThisDemo td= new ThisDemo();
		
		td.add();
	}
	
	
	
	
	
	
	
	
	
	

}
