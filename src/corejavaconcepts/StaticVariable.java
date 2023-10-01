package corejavaconcepts;

public class StaticVariable {
	
	
	String name;
	String address;
  static String city;
  
  static int i;
  
  static {
	  city="nizamabad";
	  i=0;
  }
  
  
	
	public StaticVariable(String name,String address) {
		
		
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	
		
		
	}
	
	public void getdata() {
		
		System.out.println(name+" "  +city);
		
	}
	
	public static void demo() {
		
		System.out.println(city);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable ob=new StaticVariable("saritha","darpally");
		
		StaticVariable ob1=new StaticVariable("swapna","armoor");
		
		ob.getdata();
		ob1.getdata();
		StaticVariable.demo();

	}

}
