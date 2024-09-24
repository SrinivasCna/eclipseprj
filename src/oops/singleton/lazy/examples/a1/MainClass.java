package oops.singleton.lazy.examples.a1;

public class MainClass {
	public static void main(String[] args) {

		Singleton s1;
		s1 = Singleton.getInstance();
		s1.printSingleton();

		Singleton s2;
		s2 = Singleton.getInstance();
		s2.printSingleton();

		Singleton s3;
		s3 = Singleton.getInstance();
		s3.printSingleton();

	}
}
