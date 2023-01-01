package CollectionTypes.mapInterfaces;

import java.util.HashMap;
import java.util.Map;

import HelperObject.Book;
/*	• Java HashMap Sýnýfý, anahtarlarýn benzersiz olmasý gereken anahtar ve deðer çifitini saklamamýza izin veren Map Interfacesini uygulamamýza olanak saðlar. Yinelenen anahtarý eklemeye çalýþýrsanýz, karþýlýk gelen anahtarlarýn öðeleri deðiþtirecektir. Anahtar dizini kullanarak silme , güncelleme, vb iþlemleri yapmak daha kolaydýr. 
	• Javada HashMap, eski hashtable sýnýfý gibidir, ancak sekronize deðildir. Boþ elemanlarý da saklamamýza izin verir, ancak yalnýzca bir boþ anahtar olmalýdýr.
	• Java HashMap, anahatara dayalý deðerler içerir. 
	• Java HashMap, yalnýzca unique anahtar içerir.
	• Bir boþ anahtara ve birden çok boþ deðere izin verir.
 sýra tutmaz*/
public class HashMapExample {
	public static void main(String[] args) {
		hashMapExample1();
		hashMapExample2();
		hashMapRemoveExample();
		hashMapObjectMapExample();
	}
	
	public static void hashMapExample1() {
		System.out.println("\n***   hashMapExample1()   ***");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Bon");
		map.put(2, "Doi");
		map.put(3, "Jovi");
		map.put(4, "Saul");
		System.out.println("Interating hashmap");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
	}
	
	public static void hashMapExample2() {
		System.out.println("\n***   hashMapExample2()   ***");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Bon");
		hm.put(2, "Doi");
		hm.put(3, "Jovi");
		hm.put(4, "Saul");
		System.out.println("Interating hashmap");
		hm.putIfAbsent(103, "Gaurav");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	      HashMap<Integer,String> map=new HashMap<Integer,String>();  
	      map.put(104,"Ravi");  
	      map.putAll(hm);  
	      System.out.println("After invoking putAll() method ");  
	      for(Map.Entry m:map.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          } 

	}
	
	
	public static void hashMapRemoveExample() {
		System.out.println("\n***   hashMapRemoveExample()   ***");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Bon");
		hm.put(2, "Doi");
		hm.put(3, "Jovi");
		hm.put(4, "Saul");
		
		System.out.println("initial list of elements"+hm);
		
		hm.remove(3);
		System.out.println("Updated list of element : "+hm);
		hm.remove(4,"Saul");
		System.out.println("Updated list of element : "+hm);

		
	}
	
	public static void hashMapObjectMapExample() {
		System.out.println("\n***   hashMapObjectMapExample()   ***");
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wile",1);
		HashMap<Integer, Book> hm = new HashMap<Integer, Book>();
		hm.put(1, b1);
		hm.put(2, b2);
		hm.put(3, b3);
		
		for(Map.Entry<Integer, Book> entry:hm.entrySet()) {
			Book b = entry.getValue();
			System.out.println(b.id+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
		}
		
		
		
	}
	
	
	
}
