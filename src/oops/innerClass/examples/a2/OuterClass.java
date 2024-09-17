package oops.innerClass.examples.a2;

// Static Inner Class 

public class OuterClass {

	public int number = 6;

	public void heyThere() {
		System.out.println("Hey there!");
	}

	public static class InnerClass {
		public int innerNumber = 10;

		public void whatsUp() {
			System.out.println("What's up from the Inner Class");
		}
	} // end inner class

} // end outer class