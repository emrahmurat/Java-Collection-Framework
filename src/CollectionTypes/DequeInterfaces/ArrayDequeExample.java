package CollectionTypes.DequeInterfaces;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

import HelperObject.Book;
/*
 * USER: Ufuk_Emrah_Murat "Horizon"
 * */

/*		○ Java'da bir interface'nin nesnesini yaratmanın mümkün olmadığını biliyoruz. Bu nedenle, örnekleme için Deque ınterfacesini uygulayan bir sınıfa ihitiyacımız var. Ve bu sınıf ArrayDeque'dir. Kullanıma göre büyür ve küçülür. Ayrıca AbstractCollection sınıfını da devralır. 
		○ Array dequeue sınıfı ile ilgili önemli noktalar;
			§ Queue'den farklı olarak, her iki taraftan da öğe eklenebilir veya çıkarılabilir.
			§ ArrayDeque'de boş öğelere izin verilmez.
			§ ArrayDeque, harici senkronizasyon olmadığından iş parçacığı için güvenli değildir.
			§ ArrayDeque, LinkedList ve Stack'ten daha hızlıdır.

 * */
public class ArrayDequeExample {
	public static void main(String[] args) {

		arrayDequeExample1();
		arrayDequeExample2();

	}

	public static void arrayDequeExample1() {
		System.out.println("\n***   ArrayDequeExample1()   ***");
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Raul");
		deque.add("Saul");
		deque.add("Ajay");
		for (String str : deque) {
			System.out.print(str + " ");
		}
	}

	public static void arrayDequeExample2() {
		System.out.println("\n***   arrayDequeExample2()   ***");
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Raul");
		deque.add("Saul");
		deque.add("Ajay");
		deque.add("Bon");
		deque.add("Jovi");
		deque.offerFirst("Jai");
		System.out.println("After offerFirst Traversal...");
		for (String s : deque) {
			System.out.println(s+" ");
		}
		System.out.println("After PollLast Traversal...");
		
		deque.pollLast();
		for(String item: deque) {
			System.out.println(item+" ");
		}
	}
	
	public static void arrayDequeExample3() {
		System.out.println("\n***   arrayDequeExample3()   ***");
		
		Deque<Book> deque = new ArrayDeque<Book>();
		
		Book book1 = new Book(101,"let us c","yashwaant kanektar","bpb",8);
		Book book2 = new Book(102, "Computer Network", "Tanenbau", "abc", 10);
		Book book3 = new Book(103,"System design interwiew","Alex xu","xyz",11);
		
		deque.add(book1);
		deque.add(book2);
		deque.add(book3);
		
		for(Book item :deque) {
			System.out.println(item.id+" "+item.name+" "+item.author);
		}
		
	}
	
	
	
	
	
}
