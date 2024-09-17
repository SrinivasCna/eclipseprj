package oops.interfaceConcept.multiples.a1;

public class Zomato implements MeghanaFoods, A2B {

	@Override
	public void deliverFromA2B() {
		System.out.println("Zomato delivers food from A2B");

	}

	@Override
	public void deliverFromMeghanaFoods() {
		System.out.println("Zomato delivers food from MeghanaFoods");

	}

}
