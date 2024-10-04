package collection.set.hashset.examples.a1;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> subjectSet = new HashSet<>();
		System.out.println(subjectSet);

		Boolean isTrueOrFalse;
		// add(element)
		// adds the specified element to this set if it is not already present
		// returns true if the element not present and is addded to the set
		// returns false if the element is already present.

		isTrueOrFalse = subjectSet.add("Java");
		System.out.println(isTrueOrFalse);

		isTrueOrFalse = subjectSet.add("Java");
		System.out.println(isTrueOrFalse);

		subjectSet.add("python");
		subjectSet.add("sql");
		subjectSet.add("html");
		subjectSet.add("machine learning");
		subjectSet.add("C");
		subjectSet.add("manual testing");
		subjectSet.add("ai");

		// contains(element)
		// returns true if this set contains the specified element
		isTrueOrFalse = subjectSet.contains("Java");
		System.out.println(isTrueOrFalse);

		isTrueOrFalse = subjectSet.contains("css");
		System.out.println(isTrueOrFalse);

		// remove(element)
		// returns the specified element from this set if it is present
		// returns true if the set contains the specified element
		isTrueOrFalse = subjectSet.remove("sql");
		System.out.println(isTrueOrFalse);

		Integer size;
		// size()
		// returns the number of elements in this set
		size = subjectSet.size();
		System.out.println(size);

		// clear()
		// removes all of the elements from this set
		subjectSet.clear();
		System.out.println(subjectSet);

		// isEmpty()
		// returns true if this set contains element
		isTrueOrFalse = subjectSet.isEmpty();
		System.out.println(isTrueOrFalse);

	}
}
