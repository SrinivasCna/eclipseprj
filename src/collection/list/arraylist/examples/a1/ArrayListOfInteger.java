package collection.list.arraylist.examples.a1;

import java.util.ArrayList;

public class ArrayListOfInteger {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<>();
		System.out.println(numberList);

		// add(Integer)

		numberList.add(0);
		numberList.add(null);
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		System.out.println(numberList);

		// size()
		// returns the size of elements in this list
		Integer size = numberList.size();
		System.out.println(size);

		// fetch the elements of array list using for loop
		for (int index = 0; index < size; index++) {
			Integer number = numberList.get(index);
			System.out.print(number + ", ");
		}

	}

}
