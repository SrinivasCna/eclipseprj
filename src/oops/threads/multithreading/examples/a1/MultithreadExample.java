package oops.threads.multithreading.examples.a1;

public class MultithreadExample {

	public static void main(String[] args) {
		MultithreadThing myThing1 = new MultithreadThing();
		MultithreadThing myThing2 = new MultithreadThing();

		// myThing1.run();
		// myThing2.run();

		myThing1.start();
		myThing2.start();

		// start()
		// Causes this thread to begin execution
		// the Java Virtual Machine calls the run method of this thread.
		// The result is that two threads are running concurrently.
		// the current thread (which returns from the call to the start method)
		// and the other thread (which executes its run method).

		// Remember Note:
		// If you want multiple concurrent thread you should use start() method
	}

}
