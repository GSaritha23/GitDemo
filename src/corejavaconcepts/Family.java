package corejavaconcepts;

public class Family implements Suguna,kids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Suguna s = new Family();
		s.prathiba();
		s.saritha();
		s.swapna();
		
		kids kd= new Family();
		kd.adhvik();
        kd.hanika();
        
       Family fm = new Family();
       fm.venkat();
        
	}

	@Override
	public void prathiba() {
		System.out.println("i am the first");

	}
	
	public void venkat() {
		System.out.println("hello i am husband of saritha");
	}

	@Override
	public void saritha() {
		System.out.println("i am the second");

	}

	@Override
	public void swapna() {
		System.out.println("i am the last");

	}

	@Override
	public void adhvik() {
		System.out.println("i am son");
		
	}

	@Override
	public void hanika() {
		System.out.println("i am daughter");
		
	}

}
