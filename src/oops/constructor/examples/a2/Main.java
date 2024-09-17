package oops.constructor.examples.a2;

// create class employee
// 2 instance variable
// String name
// String city
// all the possible constructor
// create object using all the constructors in main class
// execute and show the output
public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee();
		System.out.println(emp.name) ;
		System.out.println(emp.city);

		Employee emp1 = new Employee("Raj", "banglore");
		System.out.print(emp1.name);
		System.out.println(" " + emp1.city);

		Employee emp2 = new Employee("Kaushik");
		System.out.print(emp2.name);

	}

}
