package basics.ch_11_loops.for_each_loop;

public class ForEachLoopUsingArrays {

	public static void main(String[] args) {
		String[] subjectArray = { "java", "sql", "python", "machine learning", "ai" };

		for (String text : subjectArray) {
			System.out.print(text + ", ");

		}
		System.out.println();
		System.out.println();
		int[] numbersArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int num : numbersArray) {
			System.out.print(num + ", ");
		}

	}

}
