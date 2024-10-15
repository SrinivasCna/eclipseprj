package collection.set.treeset.examples.a1;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> subjectSet = new TreeSet<>();
		System.out.println(subjectSet);

		subjectSet.add("java");
		subjectSet.add("python");
		subjectSet.add("sql");
		subjectSet.add("ai");
		subjectSet.add("machine learning");

		// not allowed null values it will throw NullPointerException
		// subjectSet.add(null);

		// duplicate values will not be inserted
		subjectSet.add("java");

		// sorting order(Ascending)
		System.out.println(subjectSet);

		boolean isTrueOrFalse;
		// contains()
		// returns true if this set contains the specified element
		isTrueOrFalse = subjectSet.contains("java");
		System.out.println(isTrueOrFalse);

		String element;
		// first()
		// returns the first(lowest) element currently in this set
		element = subjectSet.first();
		System.out.println(element);

		// last()
		// returns last(highest) element currently in this list
		element = subjectSet.last();
		System.out.println(element);

		// higher(element)
		// returns the least element in this set strictly greater than the given element
		// or null if there is no such element
		element = subjectSet.higher("java");
		System.out.println(element);

		// lower(element)
		// returns the greatest element in this set strictly less than the given element
		// or null if there is no such element
		element = subjectSet.lower("java");
		System.out.println(element);

		// remove(element)
		// removes the specified element from this set if it is present
		// returns true if this set contains the specified element
		isTrueOrFalse = subjectSet.remove("ai");
		System.out.println(isTrueOrFalse);
		System.out.println(subjectSet);

		// pollFirst()
		// returns and remove the first(lowest) element
		// or returns null if this set is empty
		element = subjectSet.pollFirst();
		System.out.println(element);
		System.out.println(subjectSet);

		// pollLast()
		// returns and remove the last(highest) element
		// or returns null if this set is empty
		element = subjectSet.pollLast();
		System.out.println(element);
		System.out.println(subjectSet);

		// clear()
		// removes all of the element from this set
		subjectSet.clear();
		System.out.println(subjectSet);

		// isEmpty()
		// returns true if this set contains no elements.
		isTrueOrFalse = subjectSet.isEmpty();
		System.out.println(isTrueOrFalse);
		System.out.println(subjectSet);

	}

}
