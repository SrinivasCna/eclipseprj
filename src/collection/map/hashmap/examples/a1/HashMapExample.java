package collection.map.hashmap.examples.a1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> subjectMap = new HashMap<>();
		System.out.println(subjectMap);

		String value;

		// put(key, value)
		// associates the specified value whith the specified key in this map
		// returns the previous value associated with key,
		// or null if there was no mapping for key
		value = subjectMap.put("java", "60 days");
		System.out.println(value); // null

		value = subjectMap.put("java", "45 days");
		System.out.println(value); // 60 days

		subjectMap.put(null, null);
		subjectMap.put("python", "75 days");
		subjectMap.put("sql", "30 days");
		subjectMap.put("c++", null);

		System.out.println(subjectMap);

		// get(key)
		// returns the value to which the specified key is mapped
		// or null if this map contains no mapping for the key
		value = subjectMap.get("java");
		System.out.println(value); // 45 days

		value = subjectMap.get("ai");
		System.out.println(value); // null

		// keySet()
		// get all the keys of the values in this map
		// returns a set of the keys contained in this map
		Set<String> keySet = subjectMap.keySet();
		System.out.println(keySet);

		// Access keys of elements using for each loop
		for (String key : keySet) {
			System.out.print(key + ", ");
		}

		// values()
		// get all the values of the keys in this map
		// returns a collection of the values contained in this map
		Collection<String> values = subjectMap.values();
		System.out.println(values);

		// Access values of elements using for each loop
		for (String elementValue : values) {
			System.out.print(elementValue + ", ");
		}

		// Access both the keys and values of the elements using for each loop
		// output format => key : value
		for (String key : subjectMap.keySet()) {
			String elementValue = subjectMap.get(key);
			System.out.println(key + " : " + elementValue);
		}

		// remove(key)
		// removes the key and its corresponding value from this map
		// return the previous value associated with key,
		// or null if there was no mapping for key.
		value = subjectMap.remove("java");
		System.out.println(value);
		System.out.println(subjectMap);

		int size;
		// size()
		// returns the total number of elements in this map
		size = subjectMap.size();
		System.out.println(size);

		boolean isTrueOrFalse;
		// containsKey(key)
		// returns true if this map contains a mapping for the specified key
		isTrueOrFalse = subjectMap.containsKey("python");
		System.out.println(isTrueOrFalse);

		// containsValue(value)
		// returns true if this map contains one or more keys to the specified value
		isTrueOrFalse = subjectMap.containsValue("null");
		System.out.println(isTrueOrFalse);

		// replace(key, newValue)
		// replaces the previous value to the new value
		// which is mapped to the specified key
		// returns the previous value
		value = subjectMap.replace("c++", "20 days");
		System.out.println(value);
		System.out.println(subjectMap);

		// clear()
		// removes all the elements from this map
		subjectMap.clear();
		System.out.println(subjectMap);

		// isEmpty()
		// returns true if this map contains no key=value mappings
		isTrueOrFalse = subjectMap.isEmpty();
		System.out.println(isTrueOrFalse);

	}

}
