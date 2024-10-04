package collection.map.hashtable.examples.a1;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashTableExample {
	public static void main(String[] args) {
		Hashtable<String, Integer> monthMap = new Hashtable<>();
		System.out.println(monthMap);

		// put(Key, Value) // put(Object,object)
		// putting values to map

		monthMap.put("january", 31);
		monthMap.put("february", 28);
		monthMap.put("march", 31);
		monthMap.put("april", 30);
		monthMap.put("may", 31);

		// not allowed as it throws NullPointerException
		// monthMap.put(null, null);

		System.out.println(monthMap);

		Integer value;
		// get(key)
		// getting the values from the map
		value = monthMap.get("may");
		System.out.println(value);

		// remove(key)
		// remove the key and its corresponding value from this map
		monthMap.remove("may");
		System.out.println(monthMap);

		// keySet()
		// get all the keys of the element from this map
		// returns a set of keys contained in this map
		Set<String> monthNameSet = monthMap.keySet();
		System.out.println(monthNameSet);

		// values()
		// get all the values of the element in this map

		Collection<Integer> noOfDaysList = monthMap.values();
		System.out.println(noOfDaysList);

		// access both the keys and values of the element using for each loop
		// output format =>Month:january No of Days:31
		for (String month : monthMap.keySet()) {
			Integer days = monthMap.get(month);
			System.out.println("Month: " + month + " No of Days: " + days);
		}

	}
}
