package CollectionTypes.mapInterfaces;

import java.util.TreeMap;

public class treeMapExample {
	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Bon");
		map.put(101, "Jovi");
		map.put(102, "Dovi");
		map.put(103, "Saul");

		System.out.println("descending map: " + map.descendingMap());
		System.out.println("headMap: " + map.headMap(102, true));
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map.tailMap(102, true));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(100, false, 102, true));
	}
}
