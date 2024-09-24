package generics.genericClass.examples.a1;

public class MainClass {
	public static void main(String[] args) {
		IntegerPrinter integerprinter = new IntegerPrinter(10);
		integerprinter.print();

		DoublePrinter dp = new DoublePrinter(22.55);
		dp.print();

		StringPrinter sp = new StringPrinter("Kaushik K R");
		sp.print();

	}
}
