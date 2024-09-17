package oops.innerClass.examples.a1;

public class MainClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.heyThere();

		// InnerClass inner=new InnerClass(); // not allowed
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.whatsup();
	}

}
