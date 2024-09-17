package oops.threads.examples.a2;

public class ExtendsThreadExample extends Thread {
	public static void main(String[] args) {
		ExtendsThreadExample thread1 = new ExtendsThreadExample();
		ExtendsThreadExample thread2 = new ExtendsThreadExample();

		thread1.start();
		thread2.start();

		String threadName;
		
		threadName = thread1.getName();
		System.out.println(threadName);

		threadName = thread2.getName();
		System.out.println(threadName);
	}

	public void run() {
		System.out.println("This code is running in a thread");

	}

}
