package oops.polymorphism.runtime.examples.a1;

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
		pen = new Pen() {
			public void ink() {
				System.out.println("ink is black ");
			}

		};
		pen.ink();

		pen = new Pen() {
			public void ink() {
				System.out.println("ink is  blue");
			}

		};
		pen.ink();
	}
}
