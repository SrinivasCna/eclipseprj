package oops.finalKeyword.examples.a1;

public class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("bow bow " + FinalExample.PI);
	}

// child class is not allowed to override final method

//	@Override
//	public void eat() {
//		System.out.println("animal is animal");
//	}

}
