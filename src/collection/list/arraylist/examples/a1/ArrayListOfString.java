package collection.list.arraylist.examples.a1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOfString {

	public static void main(String[] args) {
		ArrayList<String> subjectList = new ArrayList<>();
		System.out.println(subjectList);

		// add(element)
		// adds the specified elements to the end of the list
		// returns true
		subjectList.add(null);
		subjectList.add("java");
		subjectList.add("SQL");
		subjectList.add("ai");
		subjectList.add("python");
		subjectList.add("machine learning");
		subjectList.add("java");

		System.out.println(subjectList);

		// size()
		// returns the number of elements in this list
		int size = subjectList.size();
		System.out.println(size);

		// get(index)
		// returns the element using the index as argument
		String element;
		element = subjectList.get(6);
		System.out.println(element); // java

		// set(index,newValue)
		// it updates the element using index as the argument
		// returns the previous element at the specified element
		element = subjectList.set(6, "devops");
		System.out.println(element); // java
		System.out.println(subjectList);

		// contains(element)
		// returns true if the list contains specified element
		boolean isTrueOrFalse;
		isTrueOrFalse = subjectList.contains("html");
		System.out.println(isTrueOrFalse);// false

		// remove(element)
		// removes the specified element from list if it is present
		// returns true if this list contains the specified element
		isTrueOrFalse = subjectList.remove("ai");
		System.out.println(isTrueOrFalse);

		// remove(index)
		// it removes the element at the specified position in this list
		// returns the element that was removed from the list
		element = subjectList.remove(0);
		System.out.println(element);
		System.out.println(subjectList);

		// sort the array list
		// Collection.sort(arrayList)
		// returns the sorted arrayList
		Collections.sort(subjectList);
		System.out.println(subjectList);

		// clear()
		// deletes all the elements from the list
		subjectList.clear();
		System.out.println(subjectList);

		// isEmpty()
		// returns true if list contains no elements
		isTrueOrFalse = subjectList.isEmpty();
		System.out.println(isTrueOrFalse);

	}
}
