package oops.threads.examples.a2;

public class ImplementsRunnableExample implements Runnable {

	public static void main(String[] args) {
		ImplementsRunnableExample thread1=new ImplementsRunnableExample();
		thread1.run();
		

	}

	@Override
	public void run() {
		System.out.println("This code is running in a thread");
		

	}

}
