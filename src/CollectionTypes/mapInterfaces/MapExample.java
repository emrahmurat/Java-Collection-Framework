package CollectionTypes.mapInterfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {

		mapExample1();
	}

	public static void mapExample1() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Saul");
		map.put(2, "Raul");
		map.put(3, "Paul");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
