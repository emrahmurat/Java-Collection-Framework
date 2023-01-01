package CollectionTypes.SetInterfacesInside;

import java.util.Iterator;
import java.util.TreeSet;
/*
 * USER: Ufuk_Emrah_Murat "Horizon"
 * DATE: 05/12/2022  "Istanbul"
 * */

/*	Java TreeSet s�n�f�, depolama i�in a�a� kullanan Set Interfacesini uygular. AbstractSet s�n�f�n� devral�r ve navigableSet �nterfacesini uygular. TreeSet s�n�f�n�n nesneleri artan d�zeyde depolan�r.
	� Java TreeSet yaln�zca HashSet gibi benzersiz ��eler i�erir.
	� Java TreeSet s�n�f eri�imi ve alma s�releri sessiz h�zl�d�r.
	� Null ��eye izin vermez.
	� Sekronize edilmez.
	� Artan d�zeni korur.
	� hashSet gibi benzersiz ��eler i�erir.
Eri�im ve alma s�releri olduk�a h�zl�d�r.*/
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
		System.out.println("H�ghest Value : "+treeSet.pollLast());
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
