package oops.modifiers.access.protectedKeyword.examples.a1.a1A;

import oops.modifiers.access.protectedKeyword.examples.a1.College;

public class ProtectedMain {
	public void printName() {
		// access not allowed for protected variables
		// System.out.println(name);
	}

	public static void main(String[] args) {
		College christ = new College();
		// access not allowed for protected variables
		// christ.name = "CHRIST University";

	}

}
