package oops.modifiers.access.publicKeyword.examples.a1.a1A;

import oops.modifiers.access.publicKeyword.examples.a1.Farmer;

public class FarmerChild extends Farmer {

	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		farmer.village = "kodhalli";
		farmer.cows = 1;

		System.out.println(farmer.village);
		System.out.println(farmer.cows);

	}

}
