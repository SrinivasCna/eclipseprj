package oops.modifiers.access.publicKeyword.examples.a1;

public class PublicMain {

	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		farmer.village = "kodagu";
		farmer.cows = 20;

		System.out.println(farmer.village);
		System.out.println(farmer.cows);

	}

}
