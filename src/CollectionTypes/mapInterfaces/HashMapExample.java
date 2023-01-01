package CollectionTypes.mapInterfaces;

import java.util.HashMap;
import java.util.Map;

import HelperObject.Book;
/*	� Java HashMap S�n�f�, anahtarlar�n benzersiz olmas� gereken anahtar ve de�er �ifitini saklamam�za izin veren Map Interfacesini uygulamam�za olanak sa�lar. Yinelenen anahtar� eklemeye �al���rsan�z, kar��l�k gelen anahtarlar�n ��eleri de�i�tirecektir. Anahtar dizini kullanarak silme , g�ncelleme, vb i�lemleri yapmak daha kolayd�r. 
	� Javada HashMap, eski hashtable s�n�f� gibidir, ancak sekronize de�ildir. Bo� elemanlar� da saklamam�za izin verir, ancak yaln�zca bir bo� anahtar olmal�d�r.
	� Java HashMap, anahatara dayal� de�erler i�erir. 
	� Java HashMap, yaln�zca unique anahtar i�erir.
	� Bir bo� anahtara ve birden �ok bo� de�ere izin verir.
 s�ra tutmaz*/
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
