package CollectionTypes.SetInterfacesInside;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import HelperObject.Book;
/*
 * USER: Ufuk_Emrah_Murat "Horizon"
 * DATE: 05/12/2022  "Istanbul"
 * */

/*
 * 	• Java HashSet Sınıfı, depolamak için bir karma tablo kullanan bir collection oluşturmak için kullanılır. AbstractSet Classını devralır ve Set Interfacesini uygular.
	• HashSet Classı ile ilgili önemli noktalar şunlardır;
		○ HashSet, Öğeleri Karma adı verilen bir mekanizma kullanarak depolar.
		○ HashSet yalnızca benzersiz Öğeleri içerir.
		○ HashSet boş değerlere izin vermez.
		○ HashSet Sınıfı Synchronized değildir.
		○ HashSet, ekleme sırasını korumaz burada öğeler hash kodlarına göre eklenir.
		○ Hashset arama işlemleri için en iyi yaklaşımdır.
Bir List Yinelenen öğeler içerirken Set yalnızca benzersiz öğeler içerir.
 * */
public class HashSetExample {

	public static void main(String[] args) {
		hashSetExample();
		hashSetExampleIgnoringDuplicateElements();
		hashSetExampleToRemoveElement();
		hashSetExampleDromAnotherCollection();
		hashSetExampleBook();
	}

	public static void hashSetExample() {
		System.out.println("\n***   hashSetExample()   ***");

		HashSet<String> set = new HashSet<String>();

		set.add("Bir");
		set.add("iki");
		set.add("Üç");
		set.add("Dört");
		set.add("Beş");

		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public static void hashSetExampleIgnoringDuplicateElements() {
		// yinelenen öğeleri yok sayan hashset örnegi
		System.out.println("\n***   hashSetExampleIgnoringDuplicateElements()   ***");

		HashSet<String> set = new HashSet<String>();

		set.add("John");
		set.add("Doe");
		set.add("John");
		set.add("Doe");

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static void hashSetExampleToRemoveElement() {
		System.out.println("\n***   hashSetExampleToRemoveElement()   ***");

		HashSet<String> set = new HashSet<String>();

		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");

		System.out.println("An initial list of elements" + set);

		set.remove("Ravi");

		System.out.println("After İnvoking remove(Object) metod" + set);

		HashSet<String> set1 = new HashSet<String>();

		set1.add("Saul");
		set1.add("Jesse");
		set1.add("Walter");
		set1.add("Gustavo");
		
		set.addAll(set1);
		
		System.out.println("Update List"+set);
		set.removeAll(set1);
		System.out.println("After Invoking removeAll() method"+set);

	}
	
	
	public static void hashSetExampleDromAnotherCollection() {
		System.out.println("\n***   hashSetExampleToRemoveElement()   ***");

		ArrayList<String> list = new ArrayList<String>();
		list.add("Saul");
		list.add("Hamlin");
		list.add("Jimmy");
		
		HashSet<String> set = new HashSet<String>(list);
		set.add("MG gill");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	
	public static void hashSetExampleBook() {
		System.out.println("\n***   hashSetExampleBook()   ***");

		HashSet<Book> hashSet = new HashSet<Book>();
		Book book1 = new Book(1, "Let Us C", "Yashwant Kanetkar", "BDP", 8);
		Book book2 = new Book(2,"System Design Interwiew","Alex xu","Mc Graw Hill",4);
		
		hashSet.add(book1);
		hashSet.add(book2);
		
		for(Book book:hashSet) {
			System.out.println(book.id + " " + book.author);
		}
	}
	
	
	
	
	
	
	
	
}
