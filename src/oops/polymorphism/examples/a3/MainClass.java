package oops.polymorphism.examples.a3;

public class MainClass {

	// Create class Shape
	// create a method called draw()
	// create another 2 classes namely Circle, Square
	// override draw() method in these classes
	// and demonstrate polymorphism
	// create single object of Shape class
	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.draw();

		sh = new Square();
		sh.draw();

		sh = new Circle();
		sh.draw();

	}
}
