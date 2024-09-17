package oops.constructor.examples.a1;

public class Main {

	public static void main(String[] args) {
		Library btmLibrary = new Library("Normal People");
		System.out.println(btmLibrary.book);

		Library koramangalaLibrary = new Library();
		System.out.println(koramangalaLibrary.book);

	}

}
