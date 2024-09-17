package oops.polymorphism.runtime.examples.a2;

public class MainClass {

	// create a stadium class
	// in that create a abstract method game()
	// in main method run the game() method with
	// 2 different games (implementations)
	// without creating child class

	public static void main(String[] args) {
		Stadium stad;
		stad = new Stadium() {

			@Override
			public void game() {
				System.out.println("CRICKET STADIUM");

			}

		};
		stad.game();

		stad = new Stadium() {

			@Override
			public void game() {
				System.out.println("VOLLEY STADIUM");

			}

		};
		stad.game();

	}

}
