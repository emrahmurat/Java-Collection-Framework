package CollectionTypes.mapInterfaces;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {

	}

	public static void mapExample1() {
		System.out.println("\n***   mapExample1()   ***");

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(100, "Don");
		map.put(2, "Jovi");
		map.put(102, "Bon");

		System.out.println("Keys" + map.keySet());
		System.out.println("Values" + map.values());
		System.out.println("Key-Values" + map.entrySet());
	}

	public static void linkedHashMapRemoveExample() {
		System.out.println("\n***   linkedHashMapRemoveExample()   ***");

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "Amit");
		map.put(102, "Vijay");
		map.put(103, "Rahul");
		System.out.println("Before invoking remove() method: " + map);
		map.remove(102);
		System.out.println("After invoking remove() method: " + map);
	}

}
