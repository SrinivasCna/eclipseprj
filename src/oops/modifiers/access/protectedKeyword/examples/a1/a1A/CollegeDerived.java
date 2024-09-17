package oops.modifiers.access.protectedKeyword.examples.a1.a1A;

import oops.modifiers.access.protectedKeyword.examples.a1.College;

public class CollegeDerived extends College {
	public void printName() {
		System.out.println(name);
	}

	public void print() {
		printCity();
	}

	public static void main(String[] args) {
		College college = new College();
		// access not allowed for protected variables // object of this college child
		// class is trying to access
		// college.name="XYZ college";

		CollegeDerived abc = new CollegeDerived();
		abc.name = "ABC";
		abc.city = "MNO";
		abc.printName();
		abc.printCity();

	}

}
