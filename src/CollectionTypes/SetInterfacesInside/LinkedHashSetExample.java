package CollectionTypes.SetInterfacesInside;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * USER: Ufuk_Emrah_Murat "Horizon"
 * DATE: 05/12/2022  "Istanbul"
 */
/*	
	• Java LinkedHashSet sýnýfý, Set Arabiriminin bir hashtable ve LinkedList uygulamasýdýr. HashaSet dýnýfýný devralýr ve Set Interfacesini uygular.
	• HashSet gibi benzersiz öðeler içerir.
	• Tüm isteðe baðlý küme iþlemlerini saðlar ve null öðelere izin verir.
	• Sekronize edilmez. Ekleme sýrasýný korur.*/
public class LinkedHashSetExample {

	public static void main(String[] args) {
		linkedHashSetExample();
		linkedHashSetExampleIgnoringDuplicateElement();
		linkedHashSetRemoveElement();
	}
	
	public static void linkedHashSetExample() {
		
		System.out.println("\n***   linkedHashSetExample()   ***");

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("Four");
		set.add("Five");
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static void linkedHashSetExampleIgnoringDuplicateElement() {
		System.out.println("\n***   linkedHashSetExampleIgnoringDuplicateElement()   ***");

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("John");
		set.add("Doe");
		set.add("John");
		set.add("Doe");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	
	public static void linkedHashSetRemoveElement() {
		System.out.println("\n***   linkedHashSetRemoveElement()   ***");

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("Four");
		set.add("Five");
		
		System.out.println("The hashSet is " + set);
		
		System.out.println(set.remove("two"));
		
		System.out.println("after the removing the element the hash set is :"+set);
		
		System.out.println(set.remove("six"));
	}
	
	
	
	
	
	
	
	
	
	
	
}
