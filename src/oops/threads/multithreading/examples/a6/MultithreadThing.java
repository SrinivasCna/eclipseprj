package oops.threads.multithreading.examples.a6;

public class MultithreadThing implements Runnable {

	public int threadNumber;

	public MultithreadThing(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " From Thread: " + this.threadNumber);

//			if (threadNumber == 3) {
//				throw new RuntimeException();
//			}

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
