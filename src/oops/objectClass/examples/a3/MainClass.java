package oops.objectClass.examples.a3;

public class MainClass {

	// create a Manager class
	// in Manager class create 2 instance variables namely
	// 1. name of type String
	// 2. City of type String
	// 3. age of Type String
	// create a object of Manager class in main method
	// give the values to the objects and
	// show the String value of objects in sysout

	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println(manager);
		
		manager.name = "sangakara";
		manager.city = "Sri lanka";
		manager.age = 56;
		System.out.println(manager);

	}

}
