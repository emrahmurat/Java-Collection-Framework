package CollectionTypes.SetInterfacesInside;

import java.util.Iterator;
import java.util.TreeSet;
/*
 * USER: Ufuk_Emrah_Murat "Horizon"
 * DATE: 05/12/2022  "Istanbul"
 * */

/*	Java TreeSet sýnýfý, depolama için aðaç kullanan Set Interfacesini uygular. AbstractSet sýnýfýný devralýr ve navigableSet ýnterfacesini uygular. TreeSet sýnýfýnýn nesneleri artan düzeyde depolanýr.
	• Java TreeSet yalnýzca HashSet gibi benzersiz öðeler içerir.
	• Java TreeSet sýnýf eriþimi ve alma süreleri sessiz hýzlýdýr.
	• Null öðeye izin vermez.
	• Sekronize edilmez.
	• Artan düzeni korur.
	• hashSet gibi benzersiz öðeler içerir.
Eriþim ve alma süreleri oldukça hýzlýdýr.*/
public class TreeSetExample {
	public static void main(String[] args) {

		example();
		treeSetPollValue();
		treeSetSortedSetExample();
	}
	
	
	public static void example() {
		System.out.println("\n***   example()   ***");

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Don");
		treeSet.add("Jovi");
		treeSet.add("john");
		treeSet.add("Doe");
		
		Iterator<String> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void treeSetPollValue() {
		System.out.println("\n***   treeSetPollValue()   ***");

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(24);
		treeSet.add(66);
		treeSet.add(12);
		treeSet.add(14);
		
		System.out.println("Lowest Value : "+treeSet.pollFirst());
		System.out.println("Hýghest Value : "+treeSet.pollLast());
	}
	
	public static void treeSetSortedSetExample() {
		System.out.println("\n***   treeSetSortedSetExample()   ***");

		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		System.out.println("Initial Set "+set);
		System.out.println("Head Set C:"+set.headSet("C"));
		System.out.println("SubSet A-E:"+set.subSet("A", "E"));
		System.out.println("TailSet C : "+set.tailSet("C"));
	}
}
