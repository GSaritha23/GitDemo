package corejavaconcepts;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("i am the constructor");

	}

	public void method() {

		System.out.println("i am the method");

	}

	public ConstructorDemo(int a, int b) {

		int c = a + b;
		System.out.println(c);

	}

	public ConstructorDemo(String str) {

		System.out.println(str);

	}

	public static void main(String[] args) {

		ConstructorDemo cd = new ConstructorDemo();
		cd.method();
		ConstructorDemo cd1 = new ConstructorDemo(7, 9);

		ConstructorDemo cd2 = new ConstructorDemo("hello");

	}

}
