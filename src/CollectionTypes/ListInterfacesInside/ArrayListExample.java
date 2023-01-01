package CollectionTypes.ListInterfacesInside;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import HelperObject.Student;

/*
 * USER: Ufuk_Emrah_Murat "Horizon"
 * DATE: 05/12/2022  "Istanbul"
 * */

/*	• Java Array List class'ý, Öðeleri depolamak için dinamik bir array kullanýr.
	• Bir Array(dizi) gibidir ancak boyut sýnýrý yoktur. Öðeleri istediðimiz zaman ekleyebilir veya kaldýrabiliriz. Bu nedenle, geleneksel array'den daha çok esnektir.
	• Java da ki arrayList yinelenen öðelerede sahip olabilir. 
	• List Interfacesini kullanýr.
	• ArrayList ekleme sýrasýný dahili olarak korur.
	• AbstractList sýnýfýný devralýr ve List Arayüzünü uygular.
	• 
	• Java ArrayList Sýnýfý Yinelenen Öðeler içerebilir.
	• ArrayList sýnýfý ekleme sýrasýný korur.
	• ArrayList Sýnýfý Synchronized deðildir
	• Arraylist'te manipülasyon, Javada ki LinkedList'ten biraz daha yavaþtýr çünkü dizi listesinden herhangi bir öðe kaldýrýldýðýnda çok fazla kaydýrma yapýlmasý gerekir.
Ýnt, float, char gibi primitif türlerden dizi lþstesi oluþturamayýz. Bu gibi durumlarda gerekli Wrapper (sarmalýyýcý) class kullanýlmasý gerekmektedir.*/
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayListExample1();
		ArrayListExampleForIterator();
		ArrayListForEachLoop();
		getterAndSetterArrayList();
		shortArrayList();
		userDefinedClassObjectInArrayList();
		arrayListExampleRemoveElement();
	}

	public static void ArrayListExample1() {

		System.out.println("\n***   ArrayListExample1()   ***");
		ArrayList<String> list = new ArrayList<String>();

		list.add("elma");
		list.add("Armut");

		System.out.println("ArraListExample 1 end "+list);

	}

	public static void ArrayListExampleForIterator() {
		System.out.println("\n***   ArrayListExampleForIterator()   ***");

		ArrayList<String> list = new ArrayList<String>();

		list.add("elma");
		list.add("Armut");
		list.add("Kavun");
		list.add("Karpuz");
		list.add("Kivi");
		list.add("Nar");

		System.out.println("Iterator procces is started ... ");
		Iterator itr = list.iterator(); //getting the iterator
		
		while(itr.hasNext())//check if iterator has the elements
		{
			System.out.println(" iterator loop "+ itr.next());//printing the eelemt and move to next
		}
		
	}
	
	
	public static void ArrayListForEachLoop(){
		System.out.println("\n***   ArrayListForEachLoop()   ***");

		ArrayList<String> list = new ArrayList<String>();

		list.add("elma");
		list.add("Armut");
		list.add("Kavun");
		list.add("Karpuz");
		list.add("Kivi");
		list.add("Nar");
		
		
		for(String item:list) {
			System.out.println(item);
		}

		
	}
	
	public static void getterAndSetterArrayList() {
		System.out.println("\n***   getterAndSetterArrayList()   ***");

		ArrayList<String> list = new ArrayList<String>();

		list.add("elma");
		list.add("Armut");
		list.add("Kavun");
		list.add("Karpuz");
		list.add("Kivi");
		list.add("Nar");
		
		System.out.println("Returnin element "+list.get(1));//it will return the 2nd element because index starts from 0
		
		//changin the element
		list.set(2, "Patates");
		
		System.out.println(list);
		
		
	}
	
	
	public static void shortArrayList() {
		//sort() static yöntemine sahip bir collection yardýmcý program sýnýfý saðlar bununla arraylisti kolayca sýralayabiliriz
		
		System.out.println("\n***   shortArrayList()   ***");

		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("elma");
		list1.add("Armut");
		list1.add("Kavun");
		list1.add("Karpuz");
		list1.add("Kivi");
		list1.add("Nar");
		
		Collections.sort(list1); //shorting the list
		
		for(String item:list1) {
			System.out.println(item);
		}
		
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(1);
		list2.add(2);
		list2.add(22);
		list2.add(32);
		list2.add(34);
		list2.add(43);
		
		Collections.sort(list2); //shorting the list
		
		for(int item:list2) {
			System.out.println(item);
		}
		
	}
	
	
	public static void userDefinedClassObjectInArrayList() {
		
		System.out.println("\n***   userDefinedClassObjectInArrayList()   ***");
		Student s1 = new Student(101, "ufuk", 23);
		Student s2 = new Student(102, "Muslera",37);
		Student s3 = new Student(103,"Fatih terim", 66);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);//addýing student class object
		list.add(s2);
		list.add(s3);
		Iterator itr =list.iterator();
		
		while(itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.getRollNo()+" "+st.getName()+" "+st.getAge());
		}
		
	}
	
	
	public static void arrayListExampleRemoveElement() {
		System.out.println("\n***   arrayListExampleRemoveElement()   ***");

		ArrayList<String> al=new ArrayList<String>();  
        al.add("Ravi");    
        al.add("Vijay");    
        al.add("Ajay");   
        al.add("Anuj");  
        al.add("Gaurav");  
        System.out.println("An initial list of elements: "+al);   
        //Removing specific element from arraylist  
        al.remove("Vijay");  
        System.out.println("After invoking remove(object) method: "+al);   
        //Removing element on the basis of specific position  
        al.remove(0);  
        System.out.println("After invoking remove(index) method: "+al);   
          
        //Creating another arraylist  
        ArrayList<String> al2=new ArrayList<String>();    
        al2.add("Ravi");    
        al2.add("Hanumat");    
        //Adding new elements to arraylist  
        al.addAll(al2);  
        System.out.println("Updated list : "+al);   
        //Removing all the new elements from arraylist  
        al.removeAll(al2);  
        System.out.println("After invoking removeAll() method: "+al);   
        //Removing elements on the basis of specified condition  
        al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression   
        System.out.println("After invoking removeIf() method: "+al);  
        //Removing all the elements available in the list  
        al.clear();  
        System.out.println("After invoking clear() method: "+al);  
	}
	
	
	
	
	
}
