package basics.ch_14_continue;

public class ContinueWithWhileLoopDemo {

	public static void main(String[] args) {
		// print no from 1 to 3 except 2
		int counter = 1;
		while (counter < 11) {
			// System.out.println(counter); // 1 2 3 4 5 6 7 8 9 10
			// counter++; // 2 3 4 5 6 7 8 9 10

			if (counter == 5) {
				counter++;
				continue;
			}
			System.out.println(counter); // 1 2 3 4 6 7 8 9 10
			counter++; // 2 3 4 5
		}

	}

}
