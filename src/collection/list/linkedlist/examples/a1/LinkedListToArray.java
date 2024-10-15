package collection.list.linkedlist.examples.a1;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArray {

	public static void main(String[] args) {
		LinkedList<String> movieList = new LinkedList<>();
		System.out.println(movieList);

		// add(element)
		// appends the specified element to the end of this list
		movieList.add("The Mask");
		movieList.add("Love Mocktail");
		movieList.add("Kantara");
		movieList.add("Kariya");
		movieList.add("Fifty Shades Of Grey");
		movieList.add("Fast and Furious");
		movieList.add("365 Days");
		movieList.add("Smoke After Sex");
		movieList.add(null);

		System.out.println("LinkedList: " + movieList);

		// toArray()
		// returns an array containing all of the elements in this list
		// in proper sequence (from first to last element)
		Object[] movieArray = movieList.toArray();
		// String[] movieArray = (String[])movieList.toArray(); // throw error

		System.out.println("Array: " + movieArray); // hashcode
		System.out.println("Array: " + Arrays.toString(movieArray));

		System.out.println("After converting LinkedList to Array: ");
		for (Object movie : movieArray) {
			System.out.print(movie + ", ");
		}

	}

}
