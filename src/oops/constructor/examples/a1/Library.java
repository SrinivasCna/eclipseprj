package oops.constructor.examples.a1;

public class Library {
	
	public String book;
	
	// default constructor
	public Library() {
		System.out.println("i am default constructor");
	}

	// constructor with book parameter
	public Library(String text) {
		System.out.println("i am book constructor");
		book = text;
		// this.book=text;
	}

}
