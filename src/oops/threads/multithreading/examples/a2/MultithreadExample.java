package oops.threads.multithreading.examples.a2;

public class MultithreadExample {

	public static void main(String[] args) {
		
		
		for (int i = 1; i < 6; i++) {
			MultithreadThing myThing = new MultithreadThing();
			myThing.start();
		}
	}

}
