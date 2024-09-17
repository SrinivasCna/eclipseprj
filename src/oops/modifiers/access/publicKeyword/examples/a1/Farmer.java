package oops.modifiers.access.publicKeyword.examples.a1;

public class Farmer {

	public String village;
	public int cows;

	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		farmer.village = "kollegala";
		farmer.cows = 12;

		System.out.println(farmer.village);
		System.out.println(farmer.cows);
	}
}
