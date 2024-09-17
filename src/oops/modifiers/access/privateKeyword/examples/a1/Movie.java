package oops.modifiers.access.privateKeyword.examples.a1;

public class Movie {
	private String name;
	private String genre;

	public static void main(String[] args) {
		Movie kgf = new Movie();
		kgf.name = "KGF Part1";
		kgf.genre = "Action";
		System.out.println(kgf.name);
		System.out.println(kgf.genre);

	}

}
