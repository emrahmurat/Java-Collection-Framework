package CollectionTypes.ListInterfacesInside;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * USER: Ufuk_Emrah_Murat "Horizon"
 * DATE: 05/12/2022  "Istanbul"
 * */

/*
 * 	• Java' da LinkedList sınıfı, Öğeleri Depolamak için çift bağlantılı bir liste kullanır. LinkedList (Bağlantılı liste) veri yapısı sağlar. AbstractList Sınıfını devralır ve List ile dequeue arayüzlerini uygular.
	• Java LinkedList ile ilgili önemli noktalar şunlardır.
		○ Java LinkedList Sınıfı yinelenen öğeleri içerebilir.
		○ Ekleme sırasını korur.
		○ Sekronize değil.
		○ Herhangi bir kaydırma olmadığı için manüplasyon hızlıdır.
		○ LinkedList sınıfı bir liste, stack veya queue olarak kullanılabilir.

 * */
public class LinkedListExample {

	public static void main(String[] args) {
		example1();
		addElementInLinkedList();
		removeElementInLinkedList();
	}

	public static void example1() {
		System.out.println("\n***   example1()   ***");

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Ufuk");
		linkedList.add("Emrah");
		linkedList.add("Murat");

		Iterator<String> itr = linkedList.iterator();
		while (itr.hasNext()) {
			System.out.println("item : " + itr.next());
		}
		System.out.println();
	}

	public static void addElementInLinkedList() {
		System.out.println("\n***   addElementInLinkedList()   ***");

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Ufuk");
		linkedList.add("Emrah");
		linkedList.add("Murat");

		System.out.println("After invoking add method" + linkedList);

		linkedList.add(1, "Albert");

		System.out.println("After invoking add(index,element) method" + linkedList);

		LinkedList<String> linkedList2 = new LinkedList<String>();
		linkedList.add("John");
		linkedList.add("doe");
		linkedList.addAll(linkedList2);
		System.out.println("After invoking addAll method linkedList2 : " + linkedList);
	}

	public static void removeElementInLinkedList() {
		System.out.println("\n***   removeElementInLinkedList()   ***");

		   LinkedList<String> linkedList=new LinkedList<String>();  
           linkedList.add("Ravi");  
           linkedList.add("Vijay");  
           linkedList.add("Ajay");  
           linkedList.add("Anuj");  
           linkedList.add("Gaurav");  
           linkedList.add("Harsh");  
           linkedList.add("Virat");  
           linkedList.add("Gaurav");  
           linkedList.add("Harsh");  
           linkedList.add("Amit"); 
           System.out.println("inital list of elemnts :"+linkedList);
           
           linkedList.remove("Vijay");
           System.out.println("After invoking remobe(Object) metod :"+linkedList);
           
           linkedList.remove(0);
           System.out.println("After invoking remove(index) method"+linkedList);
           
          LinkedList<String> linkedList2 = new LinkedList<String>();
          linkedList2.add("John");
          linkedList2.add("Doe");
          
          //adding new wlwmwnts yo arrayList
          linkedList.addAll(linkedList2);
          System.out.println("updated list : "+linkedList);
          
         linkedList.removeAll(linkedList2);
         System.out.println("after invoking removeAll() metod "+linkedList);
          
           
           
	}
}
