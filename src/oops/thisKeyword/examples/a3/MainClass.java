package oops.thisKeyword.examples.a3;

public class MainClass {

	public static void main(String[] args) {
		Dog myDog = new Dog();

		System.out.println(myDog.getName() + " " + myDog.getAge());
		System.out.println(myDog.getAge());

		Dog yourDog = new Dog("naayi");
		System.out.println(yourDog.getName() + " " + yourDog.getAge());

		Dog herDog = new Dog("Stella", 6);
		System.out.println(herDog.getName() + "  " + herDog.getAge());
		myDog.bark();
	}

}
