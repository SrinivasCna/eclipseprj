package oops.thisKeyword.examples.a2;

public class MainClass {

	public static void main(String[] args) {
		Dog myDog = new Dog("Jacky", 8);

		System.out.println(myDog.getName());
		System.out.println(myDog.getAge());

		Dog yourDog = new Dog("naayi", 3);
		System.out.println(yourDog.getName() + " " + yourDog.getAge());
		System.out.println(yourDog.getAge());
		myDog.bark();
	}

}
