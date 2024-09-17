package oops.innerClass.examples.a2;

public class MainClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.heyThere();

		// InnerClass inner = new InnerClass();

		OuterClass.InnerClass inner = new OuterClass.InnerClass();
		inner.whatsUp();

	}

}