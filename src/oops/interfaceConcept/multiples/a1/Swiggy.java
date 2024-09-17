package oops.interfaceConcept.multiples.a1;

public class Swiggy implements MeghanaFoods, A2B {

	@Override
	public void deliverFromA2B() {
		System.out.println("Swiggy delivered food from A2B");

	}

	@Override
	public void deliverFromMeghanaFoods() {
		System.out.println("Swiggy deliveres food from MeghanaFoods");

	}

}
