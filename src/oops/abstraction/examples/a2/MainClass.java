package oops.abstraction.examples.a2;

public class MainClass {

	// create class called Pen{}
	// create abstract method called color() in it.
	// create class Black{}
	// create class Blue{}
	// override color method from Pen class in Black and Blue class
	// show the implementation with the help of 1 reference variables
	// of type Pen class

	public static void main(String[] args) {
		Pen pen;
		pen = new Black();
		pen.ink();

		pen = new Blue();
		pen.ink();

		int a = 2;
		int b = 1;
		System.out.println(a + b);

	}

}
