package generics.genericClass.examples.a2;

public class GenericPrinter<T> {

	public T thingToPrint;

	public GenericPrinter(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println(this.thingToPrint);
	}

}