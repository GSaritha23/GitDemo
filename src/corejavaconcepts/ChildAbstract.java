package corejavaconcepts;

public class ChildAbstract extends AbstractParent {

	@Override
	public void colour() {
	System.out.println("the colur of the body is green");
		
	}
	
	public static void main(String[] args) {
		
		ChildAbstract ca = new ChildAbstract();
		ca.engine();
		ca.colour();
		ca.safety();
		
	
		
	}
	

}
