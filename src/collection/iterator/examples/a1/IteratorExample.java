package collection.iterator.examples.a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> subjectList;
		subjectList = new ArrayList<>();
		subjectList = Arrays.asList("java", "python", "sql", "null", "html");
		System.out.println(subjectList);

		Iterator<String> iterator = subjectList.iterator();

		boolean isTrueOrFlase;
		// hasNext()
		// returns true if if the iteration has more elements
		// otherwise false
		isTrueOrFlase = iterator.hasNext();
		System.out.println(isTrueOrFlase);
		
		String element;
		// next()
		// returns the next element in the iteration
		element = iterator.next();
		System.out.println(element);//java

		element = iterator.next();
		System.out.println(element);//pyhton
		
		element = iterator.next();
		System.out.println(element);//sql
		
		//access all the elements using iterator
		while(iterator.hasNext()) {
			String el=iterator.next();
			System.out.println(el+", ");
		}
		
	}

}
