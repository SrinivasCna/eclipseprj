package generics.genericClass.examples.a1;

public class DoublePrinter {

	public Double number;
	public DoublePrinter(Double number) {
		this.number=number;
	}
	
	public void print() {
		System.out.println(this.number);
	}

}
