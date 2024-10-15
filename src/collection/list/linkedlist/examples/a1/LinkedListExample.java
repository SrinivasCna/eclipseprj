package collection.list.linkedlist.examples.a1;

import java.util.LinkedList;

public class LinkedListExample {

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

		System.out.println(movieList);

		String element;

		// getFirst()
		// returns the first element in this list
		element = movieList.getFirst();
		System.out.println(element);

		// getLast()
		// returns the last element in this list
		element = movieList.getLast();
		System.out.println(element);

		// set(index, value)
		// updates the element using index as argument
		// returns the previous element at the specified position
		element = movieList.set(7, "Ugram");
		System.out.println(element);
		System.out.println(movieList);

		// removeLast()
		// removes and returns the last element from this list
		element = movieList.removeLast();
		System.out.println(element);
		System.out.println(movieList);

		Integer index;
		// indexOf(element)
		// returns the index of the specified element in this list
		// 0r -1 if this list does not contain the element
		index = movieList.indexOf("Kantara");
		System.out.println(index);

		Boolean isTrueOrFalse;
		// contains(element)
		// returns true if this list contains the specified element
		isTrueOrFalse = movieList.contains("Ugram");
		System.out.println(isTrueOrFalse);

		// remove()
		// removes and returns the head(first element) of this list
		element = movieList.remove();
		System.out.println(element);
		System.out.println(movieList);

		// peek()
		// returns the head of this list
		// or null if this list is empty
		element = movieList.peek();
		System.out.println(element);

		// poll()
		// removes the head(first element) of this list
		// returns the head of this list or null if this list is empty
		element = movieList.poll();
		System.out.println(element);
		System.out.println(movieList);

		// pop()
		// removes and returns the first element of this list
		element = movieList.pop();
		System.out.println(element);
		System.out.println(movieList);

		// push()
		// inserts the element at the front of this list
		movieList.push("A Beautiful Mind");
		System.out.println(movieList);

		Integer size;
		// size()
		// returns the number of elements in this list
		size = movieList.size();
		System.out.println(size);

		// clear()
		// removes all of the elements from this list
		movieList.clear();
		System.out.println(movieList);

		// isEmpty()
		// returns true if this linked list contains no elements
		isTrueOrFalse = movieList.isEmpty();
		System.out.println(isTrueOrFalse);

	}

}
