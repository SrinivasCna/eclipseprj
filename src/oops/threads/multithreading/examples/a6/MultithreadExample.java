package oops.threads.multithreading.examples.a6;

public class MultithreadExample {

	public static void main(String[] args) throws Exception {
		// Remember Note:
		// If you want multiple concurrent thread you should use start() method

		for (int i = 1; i < 6; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			Thread myThread = new Thread(myThing);
			myThread.start();

			// isAlive()
			// Tests if this is alive
			// A thread is alive if it has been started and not yet died.
			// returns true if thread is alive otherwise false

			boolean isTrueOrFalse;
			isTrueOrFalse = myThread.isAlive();
			// System.out.println(isTrueOrFalse);

			// getName()
			// returns this thread's name

			if (isTrueOrFalse == true) {
				System.out.println(myThread.getName() + " : is alive");
			} else {
				System.out.println(myThread.getName() + " : is dead");
			}

			// join()
			// wait for this thread to die
			myThread.join();

			isTrueOrFalse = myThread.isAlive();
			if (isTrueOrFalse == true) {
				System.out.println(myThread.getName() + " : is alive");
			} else {
				System.out.println(myThread.getName() + " : is dead");
			}

		}
		// throw new RuntimeException();
	}

}
