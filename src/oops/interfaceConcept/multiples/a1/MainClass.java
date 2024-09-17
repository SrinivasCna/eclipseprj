package oops.interfaceConcept.multiples.a1;

public class MainClass {
	public static void main(String[] args) {
		MeghanaFoods megh;

		megh = new Swiggy();
		megh.deliverFromMeghanaFoods();

		megh = new Zomato();
		megh.deliverFromMeghanaFoods();

		A2B a2b;
		a2b = new Zomato();
		a2b.deliverFromA2B();

		a2b = new Swiggy();
		a2b.deliverFromA2B();

	}

}
