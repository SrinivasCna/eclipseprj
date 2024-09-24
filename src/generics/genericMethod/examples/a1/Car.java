package generics.genericMethod.examples.a1;

public class Car {

	private String color;

	public Car(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car: " + this.color;
	}

}
