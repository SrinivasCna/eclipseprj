package generics.genericClass.examples.a2;

public class MainClass {
	public static void main(String[] args) {
		GenericPrinter<Integer> integerPrinter = new GenericPrinter<Integer>(10);
		integerPrinter.print();

		GenericPrinter<Double> DoublePrinter = new GenericPrinter<>(10.55);
		DoublePrinter.print();

		GenericPrinter<String> StringPrinter = new GenericPrinter("Kaushik"); // Type safety is not there if we doesn't put
																				// <> OR angular bracket
		StringPrinter.print();

//		GenericPrinter<Vehicle> vehiclePrinter = new GenericPrinter("Two wheeler");
//		vehiclePrinter.print();

		Vehicle vehicle = new Vehicle("Two Wheeler");
		GenericPrinter<Vehicle> vehiclePrinter = new GenericPrinter<>(vehicle);
		// GenericPrinter<Vehicle> vehiclePrinter = new GenericPrinter<>(new
		// Vehicle("Two wheeler"));
		vehiclePrinter.print();
	}
}
