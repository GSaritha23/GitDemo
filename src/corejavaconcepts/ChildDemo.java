package corejavaconcepts;

public class ChildDemo extends ParentDemo{
	
	String name="testing";
	public void getdata() {
		
	System.out.println(name);
	System.out.println(super.name);
		
	}
	 public void data() {
		 
		 super.data();
		 System.out.println("i am child method");
	 }
	 
	 public ChildDemo() {
		 
		 
		 super();
		 System.out.println("i am child constructor");
	 }
	
	public static void main (String[] args) {
		
	ChildDemo cd = new ChildDemo();	
	cd.getdata();	
	cd.data();	
		
	}

}
