package oops.inheritence.overriding.examples.a1;

public class Cat extends Animal {

	public void fur() {
		System.out.println("have hairs");
	}

	@Override
	public void Sound() {
		System.out.println(" CAT meows");
	}

}
