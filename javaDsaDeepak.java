/*---------------------------------collection framework--------------------------*/
// collection is  a object in which we can ojects

// we can store the primitive and non primite type of data in the array
// where as collection framework can contain only non primitive type of data
// cf can store the different types of data
// we can increase and decrese the size of the list at the runtime
// cf is an api which defines the predefined classes the methods


// collection => it is the single entity or object which can store the multiple data
// framework => represent the library
// cf => it is the set predefined classess & interfaces which is used ot store the mulitple data
// it contains two main part =>    1. java.util.collection   2. java.util.map
// in collection we can store the data directly but in the map we stores the data in the form of key and value pair
// collections => it is the utility class which contain only static methods

// legacy class -> old classes which modified to support the collectoin framework these old clases are known as legacy classes
// all the collection is a interface (list, set, queue)
// list ->classes(ArrayList,LinkedList) , legacy class()
/*-------------------------------------------------------------------------*/
// import java.io.*;
// import java.util.*;

// class Test {
// 	public static void main(String[] args) throws IOException {
// 		ArrayList<Integer> arr = new ArrayList<>();
// 		arr.add(4); // this is Integer i = new Integer(); this is object
// 		System.out.println(arr.get(0));
// 	}
// }
/*-------------------------------------------------------------*/

// 1.collection is an interface which is present in the java.util pakage
// there are imp methods of collection interface
// public boolean addAll(collection )------->
// public boolean add(Object obj)----------->
// we cannot create the object of the collection because it is interface

// ArrayList / collectionObject
// import java.io.*;
// import java.util.*;

// class DemoCollection {
// 	public static void main(String[] args) throws IOException {
// 		ArrayList<Object> arr = new ArrayList<>();
// 		arr.add(100); // this is not integer this is obj
// 		arr.add("deepak");
// 		arr.add('c');
// 		System.out.println(arr); // [100, deepak, c]
// 		/*---------------------------------*/
// 		ArrayList<Object> arr2 = new ArrayList<>();
// 		arr2.add(100);
// 		arr2.add(200);
// 		arr2.add(300);
// 		System.out.println("arr2 " + arr2);//arr2 [100, 200, 300]
// 		arr.addAll(arr2);
// 		System.out.println("arr " + arr); //arr [100, deepak, c, 100, 200, 300]
// 		/*-------------------------------------*/
// 		System.out.println(arr2.add("Fuck")); // this is the boolean this will give the true and false
// 		// if again it will print  it then it will give hte added element
// 		System.out.println("arr2 " + arr2); //arr2 [100, 200, 300, Fuck]
// 		/*--------------------------------------*/
// 		// to check for the element that is in the list
// 		System.out.println(arr.contains(100)); // return true
// 		/*--------------------------------------*/
// 		// checkes for the list is empty or not
// 		System.out.println(arr.isEmpty()); // return false
// 		/*---------------------------------------*/
// 		// this removes the element from the list
// 		// this is obserbing as the index position which is the integer
// 		// but when we use the remove passing with the object then it is considered as the collection(ArrayList)
// 		// public boolean remove(object obj)
// 		arr2.remove(0); // this removes the first occrances from the list
// 		System.out.println("arr2 " + arr2); //arr2 [200, 300, Fuck]
// 		/*----------------------------------------------*/
// 		// To remove the comman element we use the removeAll
// 		ArrayList<Object> x = new ArrayList<>();
// 		x.add("a");
// 		x.add("b");
// 		x.add("c");
// 		ArrayList y = new ArrayList();
// 		y.add("b");
// 		y.add("d");
// 		y.add("e");

// 		// public boolean removeAll(collection c)
// 		x.removeAll(y);
// 		System.out.println(x); //[a, c]
// 		System.out.println(y); // [b, d, e]

// 		/*--------------------------------*/
// 		// if we want to remove all the elements from the collection objects
// 		x.clear();
// 		System.out.println(x); // []
//              /*---------------------------------------*?
// 		 this gives the size of the collection
// 		System.out.println(x.size());
// 	}
// }
/*-----------------------------------------------------------------------------*/
// DIFFERENCE BETWEEN THE LIST AND SET (BOTH ARE INTERFACE)

// LIST ----> it is and index based data structure
// SET -----> Set is not an index based data structure ..it stores the value according to the hashcode values--->(EVERY OBJECT UNIQUE INTEGER VALUE)

// List ----> it can  store the duplicate value
// Set -----> it does not allow to store the duplicates value

// List ---> it can store any number of null valuess
// Set  ---> it follows the insertion order

// List ---> List follow the insertion order
// Set  ---> it doesn't follow the insertion order

// List ---> We can iterate (get) the list elements by Iterator & ListIterator(it can get the elemnets in forward and backward direction both)
// Set  ---> We can iterate the set elements by iterator


// there are 3 methods in the case of iterators
// hashNext()(Boolean) , remove() , next()

// there are 3 methods in the case of the listIterators
// hasNext(), hasPrevious(), hashCode();
/*------------------------------------*/
// import java.io.*;
// import java.util.*;

// class javaDsaDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		List<Integer> obj = new ArrayList<>();
// 		obj.add(10);
// 		obj.add(1, 20);
// 		obj.add(30);
// 		obj.add(30);
// 		obj.add(null);
// 		obj.add(null);

// 		System.out.println("List : ");
// 		// System.out.println(obj); // directly priting
// 		// using the iterator printing the elements

// 		Iterator<Integer> it = obj.iterator();
// 		while (it.hasNext()) {
// 			System.out.print(it.next() + " ");
// 		}
// 		System.out.println();

// 		// now using the iter next to print
// 		ListIterator<Integer> litr = obj.listIterator();
// 		while (litr.hasNext()) {
// 			System.out.print(litr.next() + " ");
// 		}
// 		System.out.println();
// 		/*------------------------------------------*/
// 		Set<Integer> s = new HashSet<>();
// 		s.add(10);
// 		s.add(20);
// 		s.add(30);
// 		s.add(40);
// 		s.add(40);
// 		s.add(null);
// 		s.add(null);
// 		// giving the duplicates elements in the set
// 		System.out.println("Set : ");
// 		// System.out.println(s);

// 		Iterator<Integer> iter = s.iterator();
// 		while (iter.hasNext()) {
// 			System.out.print(iter.next() + " ");
// 		}
// 	}
// }
/*----------------------------*/
// List :
// [10, 20, 30, 30, null, null]
// Set :
// [null, 20, 40, 10, 30]

/*------------------------------------------------------------------------------------------------------------------*/
//a cursor is an object that is used to traverse or iterate over the elements of a collection or stream one by one
// There are 3 cursors in the java
// 1. Iterator    2. ListIterator     3. Enumeration

//Iterator: It is used to traverse all types of collections and streams, and it supports only forward direction iteration.
//ListIterator: This is a cursor that is used to traverse all types of lists, including ArrayList, LinkedList, and Vector. It supports both forward and backward direction iteration, and it supports all four CRUD (Create, Read, Update, Delete) operations.
//Enumeration:is used to traverse legacy collections such as Vector and Hashtable. It supports only forward direction iteration.


