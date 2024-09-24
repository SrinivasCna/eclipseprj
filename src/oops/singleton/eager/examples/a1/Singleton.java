package oops.singleton.eager.examples.a1;

// Static Initializer based java Implementation of 
// Singleton Design Pattern

public class Singleton {

	private static Singleton instance = new Singleton();

	// private constructor to force the use of
	// getInstsnce() method to create to initialize Singleton object
	private Singleton() {
		System.out.println("Singleton is instantiated.");
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;

	}

	public void printSingleton() {
		System.out.println("SINGLETON: " + this);
	}

}
