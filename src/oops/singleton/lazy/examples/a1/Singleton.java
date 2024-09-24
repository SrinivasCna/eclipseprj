package oops.singleton.lazy.examples.a1;

// Classical Java Implementation of
// Singleton Design Pattern

public class Singleton {
	// private constructor to force the use of 
	// getInstsnce() method to create to initialize Singleton object
	private static Singleton instance;

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
		System.out.println("SINGLETON: "+this);
	}

}
