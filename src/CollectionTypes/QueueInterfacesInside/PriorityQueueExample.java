package CollectionTypes.QueueInterfacesInside;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import HelperObject.Book;
/*
 * USER: Ufuk_Emrah_Murat "Horizon"
 * DATE: 09/12/2022  "Istanbul"
 * */

/*
 *  PriorityQueue ayrýca nesneleri öncelik temelinde iþlemek için bize bir yol saðlayan Collection 
 * 	Framework'te tanýmlanan Classtýr. Nesnelerin eklenmesi ve silinmesi java kuyruðunda ki FIFO modelini 
 * 	izlediði zaten açýklanmýþtýr. Ancak bazen sýranýn öðelerinin önceliðe göre iþlenmesi gerekir, iþte burada bir priorityqueue
 *  devreye girer.

 * */
public class PriorityQueueExample {

	public static void main(String[] args) {
		
		priorityQueueExample();
		priorityQueueObjectExample();
		
	}
	
	public static void priorityQueueExample() {
		System.out.println("\n***   priorityQueueExample()   ***");

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Ufuk");
		queue.add("Emrah");
		queue.add("Murat");
		queue.add("Saul");
		queue.add("Raul");
		queue.add("Paul");
		
		System.out.println("Head with element :"+queue.element());
		System.out.println("Head with peek :"+queue.peek());
		System.out.println("Iterating the queue elements");
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements");
		Iterator itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	
	
	public static void priorityQueueObjectExample() {
		System.out.println("\n***   priorityQueueObjectExample()   ***");

		Queue<Book> queue = new PriorityQueue<Book>();
		
		Book book1 = new Book(1, "Let Us C", "Yashwant Kanetkar", "BDP", 8);
		Book book2 = new Book(2,"System Design Interwiew","Alex xu","Mc Graw Hill",4);
		Book book3 = new Book(3,"The Computer Network ","Tanenbau","Wetherall",7);

		queue.add(book1);
		queue.add(book2);
		queue.add(book3);
		System.out.println("Traversing the queue elements:");
		
		
		for(Book b: queue) {
			System.out.println(b.id + " "+b.name+" "+b.author+" "+ " "+b.publisher);
		}
		
		queue.remove();
		System.out.println("AfterRemoving one book record");
		for(Book b:queue) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		
		
		
		
		
		
		
	}
}
