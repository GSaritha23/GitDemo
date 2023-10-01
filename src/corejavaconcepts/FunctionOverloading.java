package corejavaconcepts;

public class FunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloading fo= new FunctionOverloading();
		fo.getdata(5);
	    fo.getdata(4,10);
		fo.getdata("saritha");

	}
	
	
	public void getdata(int a) {
		
		System.out.println(a);
	}
	
	
    public void getdata(int a,int b) {
		
		System.out.println(b);
		System.out.println(a);
	}
	
    public void getdata(String a) {
		
		System.out.println(a);
	}

}
