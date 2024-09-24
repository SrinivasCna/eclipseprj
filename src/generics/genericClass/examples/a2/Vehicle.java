package generics.genericClass.examples.a2;

public class Vehicle {
	//public Vehicle type;
	private String type;

	public Vehicle(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle: " + this.type;
	}

}
