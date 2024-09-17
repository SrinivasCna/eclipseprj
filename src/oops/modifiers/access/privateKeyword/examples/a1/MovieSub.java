package oops.modifiers.access.privateKeyword.examples.a1;

public class MovieSub extends Movie {
	public static void main(String[] args) {
		Movie laksh = new Movie();
		// access not allowed for sub classes for private variables
		// laksh.name="Laksh";
	}

}
