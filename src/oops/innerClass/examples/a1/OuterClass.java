package oops.innerClass.examples.a1;

// Non Static Inner Class

public class OuterClass {

	public int number = 6;

	public void heyThere() {
		System.out.println("Hey there");
	}

	public class InnerClass {
		public int innerNumber = 10;

		public void whatsup() {
			System.out.println("What's up from the inner Class");
		}
	} // end of Inner Class
} // end of Outer Class
