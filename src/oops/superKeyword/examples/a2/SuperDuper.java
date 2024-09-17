package oops.superKeyword.examples.a2;

public class SuperDuper {

	public static void main(String[] args) {
		Cat mycat = new Cat( 5, "Bekku", "Blue Whale");
		System.out.println(mycat.age + " " + mycat.name + " " + mycat.catFoodPreference);
		mycat.makeNoise();
		// mycat.eat();
		mycat.jump();

	}

}
