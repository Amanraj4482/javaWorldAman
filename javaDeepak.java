//__________SWAPING THE TWO NUMBERS_______________

// import java.io.*;
// import java.util.*;

// public class a {
//      public static void main(String[] args) throws IOException {
//              //swaping the two numbers
//              int a = 10, b = 30, temp;

//              //METHO 1
//              // temp = a;
//              // a = b;
//              // b = temp;


//              //METHOD 2 without using the third varible
//              // a = a + b;
//              // b = a - b;
//              // a = a - b;

//              System.out.println(a + " " + b);
//      }
// }

//_______________ARRAY________________

//NEW keyword is used to creation of new object
//super class of array is object class.
//array occupies space in heap memory
//array is faster than primitive data types
//we can also store the objects in the arrray Company c[]=new Company[1000];
//DISADVANTAGES->

//we have to fix the size of the array
//wastage of memory
//we can only store the similar datatype in array


// _________________1d Array_______________________

//int[] a, b; here both a and b are array
//int []a,b;  here also both a and b are array
//int a[],b;  here a is array and b is varible
//at the time of declaration we cannot give the size to the array

//declartion -> int[] a;
//creation -> a= new int [3]
//int[] a=new int[3];

//int[] a=new int [-3]; will compiled but it will throw array (NegativeArraySizeException)

//default value initilise by the array is 0 and with the string is NULL

//dec ini & creation in one line=>  int[] a={1,3,4};
//int [] a=new int[]{10,20,30};//this is also way to express the array



//________________________priting of array by using the for -each loop__________________
// import java.io.*;
// import java.util.*;

// public class a {
//      public static void main(String[] args) throws IOException {
//              int a[] = new int [] {10, 20, 30};
//              for (int c : a)
//                      System.out.println(c);
//      }
// }

// _________________________2d Array____________________________
//int [][] a,b ;   a-> 2d    b-> 2d

//int []a[] ,b;    a-> 2d    b-> 1d

//int []a[],b[];   a-> 2d    b-> 1d

//int [][]a,b[];   a->2d     b->3d

//int [][]a,[]b;   a->3d     COMPILE TIME ERROR


/*----------------------------------------------------------*/
/* taking the input from the user and printing it */
/*import java.io.*;
import java.util.*;

class Sort {
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> v = new ArrayList<>();
		int n = read.nextInt();
		for (int i = 0; i < n; i++) {
			int t = read.nextInt();
			v.add(t);
		}
		for (int i : v) {
			System.out.println(i + " ");
		}
	}
}


*/

//creation and declaration part
//int [][]a=new int[2][3];



// //____________BUBBLE SORT________________
// import java.io.*;
// import java.util.*;

// public class a {
//      public static void main(String[] args) throws IOException {
//              int a[] = {2, 5, 1, 6, 12};
//              int temp;
//              for (int i = 0; i < a.length; i++) {//no of rounds
//                      int flag = 0;
//                      for (int j = 0; j < a.length - 1 - i; j++) { //last k i element compare ni krega ith round m //comparison of elemets
//                              if (a[j] > a[j + 1]) {
//                                      temp = a[j];
//                                      a[j] = a[j + 1];
//                                      a[j + 1] = temp;
//                                      flag = 1;
//                              }
//                      }
//                      if (flag == 0) {
//                              break;
//                      }
//              }
//              for (int i = 0; i < a.length; i++)
//                      System.out.print(a[i] + " ");
//      }
// }

// 1 2 5 6 12
//in string-> if(a[j].compareTo(a[j+1])==0)


//______________SELECTION SORT___________________
//The selection sort is a combination of searching and sorting .
//it sorts an arrray by repeatdly finding the minimum element (considering ascending order)
//from unsorted part and putting it at the beginning.
// In every iteration of selection sort, the minimum element ( considering ascending order )
//from the unsorted subarray is picked and moved to the sorted subarray



// import java.io.*;
// import java.util.*;

// public class a {
//      public static void main(String[] args) throws IOException {
//              int a[] = {1, 5, 2, 6, 7};
//              int min, temp;
//              for (int i = 0; i < a.length; i++) {
//                      min = i;
//                      for (int j = i + 1; j < a.length; j++) {
//                              if (a[j] < a[min])
//                                      min = j;
//                      }
//                      //swap the current 1st element with the lowest number
//                      temp = a[i];
//                      a[i] = a[min];
//                      a[min] = temp;
//              }
//              for (int i = 0; i < a.length; i++)
//                      System.out.print(a[i] + " ");
//      }
// }

//for the strings=> String temp="";
//if(a[j].compareT0(a[min])<0)
// 1 2 5 6 7



//____________INSERTION SORT_________________

//insertion sort is a simple sorting algorithm that works the way we sort
//playing cards in our hands
//We choose one card and insert it in its position (ascending or decending)


// import java.io.*;
// import java.util.*;

// public class a {
//      public static void main(String[] args) throws IOException {
//              int a[] = {5, 1, 6, 2, 4, 3};
//              int temp, j;
//              for (int i = 1; i < a.length; i++) {//starting from the 1st pos
//                      temp = a[i];
//                      j = i;
//                      while (j > 0 && a[j - 1] > temp) {
//                              a[j] = a[j - 1];
//                              --j;
//                      }
//                      a[j] = temp;
//              }
//              for (int i = 0; i < a.length; i++) {
//                      System.out.print(a[i] + " ");
//              }
//      }
// }
// 1 2 3 4 5



//_______________MERGE SORT_________________
//merge sort is one of the most popular sorting algorithms and widely
//used techniques
//it time complezity is(2T(n/2)) us better as compared to bubble , selection , insertion sort.

//based on DIVIDE AND CONQUER rule
//1. Divide the unsorted list in to n sublist,each containing 1 element .
//2. Take adjacent pairs of two singleton list and merge them to form a list of
//2 elements n will now convert into n/2 lists of size 2.
//3. Repeat the process till a single sorted list of obtained



// import java.io.*;
// import java.util.*;

// public class a {
//      //declaration of Instance array
//      int []array;
//      int []tempMergeArray;
//      int length;
//      public static void main(String[] args) throws IOException {
//              int []inputArr = {3, 5, 7, 2, 1};
//              //creating object of class a
//              a obj = new a();
//              //calling the sort function
//              obj.sort(inputArr);//passing the input array

//              //printing the elements
//              for (int i : inputArr ) {
//                      System.out.print(i + " ");
//              }
//      }
//      //creating the method of sort
//      public void sort(int inputArr[]) {
//              this.array = inputArr;
//              this.length = inputArr.length; //5 length
//              //creation of temp array with the size of the array
//              this.tempMergeArray = new int[length];

//              //calling the divideArray method
//              divideArray(0, length - 1);
//      }

//      //creating the method which will divide the array
//      public void divideArray(int lowerIndex, int higherIndex) {
//              //this sorting method workd on the recursion

//              if (lowerIndex < higherIndex) {
//                      int mid = lowerIndex + (higherIndex - lowerIndex) / 2;

//                      //left side array sorting
//                      divideArray(lowerIndex, mid);


//                      //right side array sorting
//                      divideArray(mid + 1, higherIndex);

//                      //calling the merge array method
//                      mergeArray(lowerIndex, mid, higherIndex);
//              }
//      }
//      //to merge the array creatig the method
//      public void mergeArray(int lowerIndex, int mid, int higherIndex) {

//              //copying the values of array in the tempArray
//              for (int i = lowerIndex; i <= higherIndex; i++) {
//                      tempMergeArray[i] = array[i];
//              }
//              int i = lowerIndex , j = mid + 1, k = lowerIndex;

//              while (i <= mid && j <= higherIndex) {
//                      if (tempMergeArray[i] <= tempMergeArray[j]) {
//                              array[k] = tempMergeArray[i];
//                              i++;
//                      } else {
//                              array[k] = tempMergeArray[j];
//                              j++;
//                      }
//                      k++;
//              }
//              while (i <= mid) {
//                      array[k] = tempMergeArray[i];
//                      k++; i++;
//              }
//      }
// }
// // 1 2 3 5 7

/*--------------------------------------------------------*/
//OOPS is a programming paradigm to do program
//1.smalltalk is the language which is purely based on the oops language
//2.class is not a real world entity
//3.class is the collection of object
//4.it is just a template or blueprint or prototype
//5.class doesn't occupy memory space------> the size of the class can be determined be the sizes of the data members in it

// 6 main pillars of the oops----> 1. classes       2. object & methods   3. inheritance       4. polymorphism          5.abstraction              6.encapsulation

//Method-> A set of code which performs a particular task
//1. code reuseblity
//2. code optimisation
// syntax : accessSpecifier returnType methodName ( List of paramerters)

//OBJECT -> object is an instance of class (dog is an instance of animal)\
// Object is the reference of the class
//2. it is real world entity
// it occupies memory

//it consist of
// 1. identity (name)___every object name is different
// 2. state/attribute (dog -> color , age , bread)
// 3. behaviour ( eat, run )-> methods

//WAYS TO CREATE A OBJECT
//1. new keyword
//2. clone() method
//3. newInstance () method
//4. deserilization
//5. factory methods



//declaration => Animal (class) buggy;
// here 'buggy' will count as the reference of the clss animal it is not the object of the class an instance / object is which is created or initiliszed using the 'new' keyword

//instantiation => buggy = new;
// This is the memory is allocated for an object.
//The 'new ' keyword is used to create the object.
//A referece to the object that was created is returned from the new keyword.

//initilation => buggy = new Animal();
//The 'new ' keyword is followed by a call to a constructor . This call initilizes the new object.
//In initilation the values are put in the memory that was allocated.
//All the states(breed, age ,color ) & behaviour(eat, run , bark) of an object (buggy) is loaded in the memory.


//To call the method of an object (.) dot operator is used => buggy.eat();
//buggy.color='black';


// import java.io.*;
// import java.util.*;

// // 3 ways by which object are inilialised
// //1. to initilize the object by reference varible
// //2. by method
// //3. by constructor


// //CREATING THE CLASS AND ALSO CREATING THE VOID METHOD WITH THE PUBLIC
// class a {
//      public static void main(String[] args) throws IOException {
//              //create an object
//              Animal  buggy = new Animal();
//              buggy.eat(); buggy.run();
//              Birds bird = new Birds();
//              bird.fly();
//      }
// }
// class Animal {
//      void eat() {
//              System.out.println("I am eating");
//      }
//      public void run() {
//              System.out.println("I am running");
//      }
// }
// //----------------------------------------------------
// class  Birds {
//      public void fly() {
//              System.out.println("Birds are flying");
//      }
// }


/*------------------------------------------------------------------------------------------------------------------*/

//CREATING OBJECT BY REFERENCE VARIBLE
// import java.io.*;
// import java.util.*;

// public class a {
//      public static void main(String[] args) throws IOException {
//              Animal buzo = new Animal();
//              buzo.color = "Black";   // inilisation by the reference of the instance varible of the clss
//              buzo.age = 19;
//              System.out.println(buzo.color + "\n" + + buzo.age);
//      }
// }
// class Animal {
//      String color;
//      int age;
// }



//CREATING THE CLASS WITH THE METHOD
/*import java.io.*;
import java.util.*;

class a {
	public static void main(String[] args) throws IOException {
		Animal obj = new Animal();
		obj.intobj("Black ", 23);
		obj.display();  //Black 23
		obj.intobj("Red ", 3);
		obj.display();  //Red 3
	}
}
class Animal {
	String color;//instance varible
	int age;
	void intobj(String c , int a) {
		this.color = c;
		this.age = a;
	}
	void display() {
		System.out.println(color + age);
	}
}*/


/*-------------------------------------------------------------------------*/
// CONSTRUCTORS
// A block (similar to method)
// having same name as that of class name
//      constructor doesn't have any return type not even void
//      public test {} -> is a constructor  but public void test{} -> is not a constructor


//      the only modifieres applicable for constructor are public protected dafault and private
//      it executes automatically when we create an object
//      Test t= new Test(); automatically this {new Test();} part will call the contructor


//      constructor are used to initize the object
/*------------------------------*/
/*import java.io.*;
import java.util.*;

class Emp {
	String name;//default value initialised with null
	int emp_id;//default value initialised with zero
	Emp() {
		//this is no argument constructor created by the user
		// where the default constructor is created by the jvm-----> Emp(){super();}
		System.out.println("No arg constructor");
	}
	//creating the constructor with the only name of Emp
	Emp(String naming) {
		//this is parameterised constructor created by the user
		this.name = naming;
		System.out.println("parameterised cons");

	}
	Emp (String name, int emp_id) {
		this.name = name;
		this.emp_id = emp_id;//this right side emp_id is the parameterised name
	}
}
class a {
	public static void main(String[] args) throws IOException {
//so to initialising the obj is necessary
		Emp employee = new Emp("Aman", 19);  //argument constructor calling
		Emp employee2 = new Emp("Raj ", 20);
		Emp t = new Emp(); //this is for calling the no arg constructor
		Emp for_cons_calling = new Emp("fucking");
//first no arg constructor has been called  before the main function
		System.out.println(employee2.name + employee.emp_id);
		System.out.println(for_cons_calling.name);
	}
}*/

/*output   :
No arg constructor
parameterised cons
Raj 19
fucking */

//if we are initilising the obj with the ref it will get into both the obj
//construcor doesn't create the object the new keyword created the obj

/*------------------------------------*/
// THERE ARE 3 TYPES OF CONSTRUCTORS
// 1.Default constructor -> this is created by the compiler
// and this default constructor always has no parameters
// in the class => Test() {  super();   }
// compiler only created constructor when the user has not created it

// 2.NO ARGUMENT CONSTRUCTOR => (USER DEFINED )
// 3.PARAMETERISED CONSTRUCTOR


/*------------------------------------------------------------------------------*/
//________INHERITANCE________
//constructor gets never inherited in anyother classes
//private methods are also not inherited by the child class
//also there can be only one super class in so there cannot be multiple inheritance
// the above line says that -----> one or more than one class can inherit only one super class----------> there can't not be more than 1 super class


//Inheritance is the property by which one object acquires all the properties and behaviours of a parent object.
//Inheritance is acheived by the instance keyword

//1.code reusesiblity
//1.we can achieve polymorphism using the inheritance => method overiding

//disadvantage of inheritance is all the child class are tightly copuled to the parent class
// if we do change in the parent class it will reflect in the child class

//THERE IS 5 TYPES OF INHERITANCE
//1.SINGLE=>A single class property gets inherited in another class
//2.MULTILEVEL => property a=> property b=> property c then property c=> property a
//3. HEIRARICAL=> a=> b  & a=> c

//these two of them are not supported in java->
//4. MULTIPLE =>  A=>c & B=>c
//5. HYBRID => kisi v do type ka inheritance


// import java.io.*;
// import java.util.*;

// class Animal {//parent class or Super class
//      void eat() {
//              System.out.println("This animal is eating");
//      }
// }

// class Dog extends Animal {//sub class or child class
//      public static void main(String[] args) throws IOException {
//              Animal kutta = new Animal();
//              Dog doggy = new Dog();
//              doggy.eat();
//      }
// }



/*import java.io.*;
import java.util.*;

class A {
	void showA() {
		System.out.println("A class method");
	}
}
class C extends A {  //this child can all the methods behaviour from all connected parent
	void showC() {
		System.out.println("C class method");
	}
}
class B extends A {
	void showB() {
		System.out.println("B class method");
	}
	public static void main(String[] args) throws IOException {
		A ob1 = new A();
		ob1.showA();
		// ob1.showB();
		// ob1.showC();

		B ob2 = new B();
		ob2.showA();//calling A class method by help of objB
		ob2.showB();
		// ob2.showC();

		//creating the c object
		C ob3 = new C();
		ob3.showA();
		// ob3.showB();//in case of heiracy inheritance=>cannot call object of b class through c class
		ob3.showC();
	}
}*/
// A class method
// A class method
// B class method
// A class method
// C class method

/*---------------------------------------*/
// HERE IS THE EXAMPLE OF THE NOT SUPPORT OF THE MULTIPLE INHERITANCE IN THE JAVA

/*class A {
    void method() {
        System.out.println("Method from class A");
    }
}

class B extends A {
    void method() {
        System.out.println("Method from class B");
    }
}

class C extends A {
    void method() {
        System.out.println("Method from class C");
    }
}

class D extends B, C { // This would lead to ambiguity
}*/
// ----------------------------------------------------------------------------------------------
// We can acheive the multiple inheritance by the help of the interfaces in java

/*import java.io.*;
import java.util.*;

interface A {
	void methodA();
}

interface B {
	void methodB();
}

class MyClass implements A, B {
	public void methodA() {
		System.out.println("Method A");
	}

	public void methodB() {
		System.out.println("Method B");
	}
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.methodA();
		obj.methodB();
	}
}*/
// Method A
// Method B
/*---------------------------------------------------------*/
// REALTIONSHIP BETWEEN THE CLASSES
// types of relationship =>

// 1. Inheritance (Is - A)  (parent child relationship TIGHTLY COPOULED)
// 2. Association (Has - A) => 1. Aggregation 2.Composition


// benifits-> 1. code reuseblity 2. cost cutting



// ______ASSOCIATION_____
//refrence variable
// cas (Has - A) engine

// class Engine {

// }

// class Car {

//      Engine e = new Engine(); only required property can be used
//      so they are not tightly coupleed

// }


// if the two classes is having weak bonding then -> Aggregation else strong then composition
//there is a weak bonding in =:>Car has a music -> Aggregation
// where has car has engine this is strong bonding also know as composition


//----------------------------------------------------------------
//POLYMORPHISM->water forms , shapes forms , sound of animals
//compile time polymorphism -(static) ->method overloading
// runtime polymorphism -(dynamic)-> method overriding


//METHOD OVERLOADING => 1. SAME NAME 2. SAME CLASS 3. DIFFERENT ARGUMENTS  3.1.NO OF ARGUMENT /.2SQUENCE /3. TYPES
//METHOD OVERRIDING =>  1.SAME NAME  2. DIFFERENT CLASS 3. SAME ARGUMENTS 3.1. NO / SEQUENCE / TYPES   4.Inheritance (Is-A) relationship

//________METHOD OVERLOADING_____

//different forms of the method is called polymorphism
//compile time polymorphism

// import java.io.*;
// import java.util.*;

// class Test {
//      void show(int a , String b) {
//              System.out.println("1");
//      }
//      void show(String b, int a ) {
//              System.out.println("2");
//      }
//      public static void main(String[] args) throws IOException {

//              Test t = new Test();
//              t.show(2, "fuck "); //compiler confuses to this error
//              t.show("fuck", 2);
//              //both method have zero arguments
//              //this type of error is called the ambiguity error

//      }
// }

//CAN WE OVERLOAD JAVA MAIN () ?

// import java.io.*;
// import java.util.*;

// class Test {
//      public static void main(String[] args) throws IOException {

//              System.out.println("1");
//              Test t = new Test();
//              t.main(3);
//      }
//      public static void main(int a ) {
//              System.out.println("2");
//      }
// }

//YES we can have nay number of main methods in a class bu method overloading.
//This is because JVM  always calls main() method which receives string array as arguments only

// import java.io.*;
// import java.util.*;

// class javaDeepak {
// 	void show (String a) {
// 		System.out.println("1 string ");
// 	}
// 	void show (Object a) {
// 		System.out.println("int method");
// 	}
// 	// void show (String a) {
// 	// 	System.out.println("String method");
// 	// }
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		javaDeepak t = new javaDeepak();
// 		t.show("abcd");//int method
// 	}
// //char is promoted to the int
// }
//Automatic Promotion -> one type is promoted to another implicitly if no matching data type is found

//Object is the parent class of the classes in the java
//while resolving Overloaded Methods ,Compiler will always give precedance
//for the child type argument than compared with parent type argument

//METHOD OVERLOADING -3
// import java.io.*;
// import java.util.*;

// class javaDeepak {
// 	void show (StringBuffer a) {
// 		System.out.println("String Buffer Method");
// 	}
// 	void show (String a) {
// 		System.out.println("String Method ");
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		javaDeepak t = new javaDeepak();
// 		t.show("abc");// String Method
// 		t.show(new StringBuffer("xyz")); // String Buffer Method
// 		// t.show (null); ambiguous error
// //String & StringBuffer are at same level so "null "cannot be refered if refered, ambigious error will occur.
// 	}
// }

//METHOD OVERLOADING -5
// import java.io.*;
// import java.util.*;

// class javaDeepak {
// 	void show (int a) {
// 		System.out.println("int method");
// 	}
// 	void show(int... a ) {		//variable arguments
// 		System.out.println("varargs  method");
// 		System.out.println(a);
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		javaDeepak t = new javaDeepak();
// 		t.show(10);		//int method
// 		t.show (10, 34, 35);	//multiple method

// 	}
// }
// int method
// varargs  method
// [I@372f7a8d

//The varargs allow the mthod to accpet zero or multiple arguments.
//Before varargs either we use overloaded method or take an array as the method parameter but it is not considered good because it leads to the
// maintanance problem. If we dont know how many arguments we will have to pass in the method, varargs is the better approach


//In general varargs get least priority i.e if not other method matched, then
//only vararg method will get the change , because int came in 1.0 version
//varargs came in 1.5 version

/*------------------------------------------------------------------------------------------------------------------*/

//_______________METHOD OVERIDDING_________________
// ---------------RUNTIME POLYMORPHISM--------------
// 1. in the different classes
// there must be a inheritance (is - A ) rlnship
/*---------------------------------*/
// case 2 and case 3
// import java.io.*;
// import java.util.*;
// class test {
// 	void show () {
// 		System.out.println("1");
// 	}
// 	// there is error
// 	public Object show2() {
// 		System.out.println("Object show2");
// 		return null;
// 	}
// }
// class javaDeepak extends test {
// 	void show() {
// 		System.out.println("2");
// 	}
// 	// there is error
// 	public String show2() {
// 		System.out.println("String show2");
// 		return null;
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		test t = new test();
// 		javaDeepak x = new javaDeepak();
// 		x.show(); //2
// 		t.show(); //1
// 		t.show2();
// 		x.show2();
// 	}
// }
// the access modifier of the child cls should be bigger than the access modifier of the super class
/*---------------------------------*/
// by using the method overriding we can change the implementation of the method of the super cls according to us
// Do overriding method must have same return type (or subtype) ?
// it is possible to have different return type for a overriding method inc idl cls, but child's return types should be subtype of parent's return type
/*---------------------------------*/
// abstract methods are always need to override
// import java.io.*;
// import java.util.*;
// abstract class test {
// 	abstract void display();
// 	void show() throws RuntimeException {
// 		System.out.println("1");
// 	}
// }
// class javaDeepak extends test {
// 	void display() {
// 		System.out.println("22");
// 	}
// 	void show() {System.out.println("2");}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		javaDeepak t = new javaDeepak();
// 		t.show();//2
// 		t.display();//22
// 	}
// }
/*---------------------------------*/
// case 4;
// import java.io.*;
// import java.util.*;
// interface test {
// 	void display();
// }
// class javaDeepak implements test {
// 	public void display() {
// 		System.out.println("22");
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		javaDeepak t = new javaDeepak();
// 		t.display(); // 22
// 	}
// }
/*---------------------------------*/
/*---------------------------------*/
//case 5 ------> INVOKING OVERRIDDEN METHOD FROM SUB CLASS
//  we can call parent cls method overriding method using super keyword
// case 6 ----->
// 1. FINAL METHOD CAN'T BE OVERRIDDING
// 2. STATIC METHOD CAN N'T BE OVERRIDDEN
// 3. PRIVATE METHODS CAN NOT BE OVERRIDDEN----private methods can't be overridden as they are bonded during compile time. Therefore we can't evven override private methods in a subclss
// case 7 ---->
// overriding of the sunchronized / strictfp method can be overridded
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// <--------in previous module we read about the code reuseablity ------>

// SECURITY FOCUS MODULE :
// ABSTRACTION || DATA HANDLING || ENCAPSULATION || TIGHTLY COUPLED CLAUSES

/*---------------------------------*/
// but we display the main services in the abstraction
// abstraction : is detail hiding (implementation hiding)
// it exposes the interface to the user and hiding the details of implementation

// Encapsulation : is detail hiding (information hiding)
// Encapsulation groups together data and methods that act upon the data
/*---------------------------------*/

// Abstraction 1. Abstract class (0-100%)  2.Interfaces (100%)

// A method without body ( no implementation ) is known as abstract method
// A method must always be declared in an abstract clss, or we can say that if a class has an astract method, it should be declared abstract as well.
// If a regular class extends an abstract clas , then the class must have to implement all the abstract method of abstract parent class or it has to be declared abstract as well

// method overriding in the abstraction
// Abstract classes cnnot be instantiated , means we can't create an object of Abstract class
// bcoz there is no body of the method so there is no use of the creating the obj
// but we can create the reference of it

/*import java.io.*;
import java.util.*;

abstract class Vehical {
        int no_of_tyres ;
        abstract void start();
}
class Car extends Vehical {
        int no_of_tyres = 4;
        void start () {
                System.out.println("Starts with key");
        }

}
class Scooter extends Vehical {
        int no_of_tyres = 3;
        void start() {
                System.out.println("Stars with kick");
        }
        public static void main(String[] args) throws IOException {
                // Vehical v = new Vehical();  // this cannot be initialised
                Car c = new Car();
                c.start();

                Scooter s = new Scooter();
                s.start();
        }

}*/
/*--------------------------------------------------------------------*/
// INTERFACES----------------->
// all the method in the interface are the abstract methods
// it is similar to the Abstract class but having all the methods to abstract type
// without body method only --- we can't create the method with the body
// INterface are the class blueprint  of the class . It specify what a class must do and not how.
// for the inheritance use word 'IMPLEMENTS'

// keypoints---->
// 1. it is use to acheive abstraction ...
// 2. it supports the multiple inheritance ..
// 3. it can be use to loose coupling  it increases the flexblity of the system & makes it more maintanable and makes the entire framework more stable

// SYNTAX :------------------------------>
// import java.io.*;
// import java.util.*;

// interface Interface_name {
// 	// all the methods are of default type [ public abstract ]
// 	/* public abstract */void show();

// 	// any field is default of the type [ public static final ]
// 	int a = 10;

// 	//  in the higher version of the java default concrete method can be created
// to create the body of the method there must be declared as the default method
// default void display() {
// 		/* . . . . */
// 	}
// 	public static void print() {  // default it is public
// 		/* . . . . */
// 	}
// 	// we can also create private method inside the interface
// 	public static void main(String[] args) throws IOException {

// 	}
// }

/*---------------------------*//*---------------------------------*/
// we canot create the object of the interface

// import java.io.*;
// import java.util.*;
// interface demo_1 {
// 	public void show();
// }
// interface demo_2 {
// 	void display();
// }
// class javaDeepak implements demo_1 , demo_2 {
// 	// we can create the object of the javaDeepak cls
// 	public void show() {
// 		System.out.println("This is javaDeepak -> dmeo_1");
// 	}
// 	public void display() {
// 		System.out.println("This is javaDeepak-1 -> demo_2");
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		javaDeepak t = new javaDeepak();
// 		t.show();
// 		t.display();
// 	}
// }
// output :
// This is Test -> dmeo_1
// This is Test-1 -> demo_2
/*------------*//*---------------------------------*//*---------------------------------*//*---------------------------------*/
// another example to demostrate the mulitple inheritance in the java supported by the interface

// import java.util.*;
// import java.io.*;
// // First interface
// interface Printable {
// 	void print();
// }
// // Second interface
// interface Displayable {
// 	void display();
// }
// //@override is ued to indicate that a method in a subcls is intended to override a method in its supercls
// // Concrete class implementing both interfaces
// class Printer implements Printable, Displayable {
// 	// @Override
// 	public void print() {
// 		System.out.println("Printing...");
// 	}

// 	// @Override
// 	public void display() {
// 		System.out.println("Displaying...");
// 	}
// }
// class javaDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		Printer printer = new Printer();
// 		printer.print();
// 		printer.display();
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// <<<<<<<<<<<<<<<______________________________________ENCAPSULATION_______________________________________________>>>>>>>>>>>..
// Encap is java is mechanism of wrapping the data (varibles) and code acting on the data (methods) together as a single unit.
//steps---->
// 1. Declare the varibles of a clss as private.
// 2. Provide public setter and getter methods to modify and view the varibles values

// In encap , the varibles of a clss will be hidden from other classes, and can be accesed only through the methods of their current cls, this concept is known as data hiding


// import java.io.*;
// import java.util.*;

// class Emp {
// 	private int empId; // data hiding
// 	// setter and getter methods
// 	public void setEmpId (int empId) {
// 		this.empId = empId;
// 	}
// 	public int getEmpId() {
// 		return empId;
// 	}
// }
// class javaDeepak {

// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		Emp s = new Emp();
// 		s.setEmpId(3);
// 		System.out.println(s.getEmpId());
// 	}
// }
/*---------------------------------*//*---------------------------------*//*---------------------------------*/
//---------------USE OF THE THIS KEYWORD----------------
/*------------------------------------------------------------------------------------------------------------------*/

// Use of this keyword :->this keyword is a reference variable which referes the object
// import java.io.*;
// import java.util.*;

// class Test {
// 	int i ; //instance varible = i
// 	void setValues(int i, Test t ) { //local variable =i
// 		t.i = i;
// 		// this.i = i;
// 		// a single this points to the object where as this.i points to the instance varible
// 		// here this.i -> ***referece to the current class instance variable
// 		// this will give the output zero
// 		// because it is not specified that the which i it is
// 	}
// 	void show() {
// 		System.out.println(i);
// 	}
// }

// class javaDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		Test t = new Test();
// 		t.setValues(10, t);
// 		t.show(); //i =10 when used the this.i in the functino
// 		// it gives the zero output if we use the instance and local varible same without using the "this" keyword
// 	}
// }
// this keyword can be used to refer current class instance variable
// this keywrod can be used to invoke current class method (implicitly)
// this() can be used to invoke current class constructor
// this can be used to pass as an argument in the method call.
// this can be used to be pass as an argument in the constuctor call.
// this can be used to return the current class instance from the method.
/*---------------------------------*//*---------------------------------*//*---------------------------------*/
//2.
// import java.io.*;
// import java.util.*;

// class thisjava {
// 	void display () {
// 		System.out.println("hello");
// 	}
// 	void show() {
// 		this.display();  // equals to the display
// 	}
// }

// class javaDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		thisjava td = new thisjava();
// 		td.display();
// 		td.show();
// 	}
// }
// hello
// hello
/*---------------------------------*//*---------------------------------*/
// 3.
// import java.io.*;
// import java.util.*;

// class javaDeepak {
// 	javaDeepak (String b) {
// 		System.out.println(b);
// 	}
// 	javaDeepak() { // 1st calling .........
// 		System.out.println("No arg");
// 	}
// 	javaDeepak(int a ) {
// 		this();// No arg constructor & // paremetrised construtor ...... from here the 1st calling will initiate
// 		System.out.println("parameterised constructor");   // 2nd calling.......
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		javaDeepak t = new javaDeepak(10);
// 		javaDeepak t2 = new javaDeepak("10");
// 	}
// }
// No arg
// parameteriesed constructor
// 10
/*---------------------------------*//*---------------------------------*/
// case 3
// import java.io.*;
// import java.util.*;

// class javaDeepak {
// 	javaDeepak () {
// 		this(10);
// 		System.out.println("No arg constructor");
// 	}
// 	javaDeepak(int a) {
// 		this("Aman");
// 		System.out.println("parameterised constructor");
// 	}
// 	javaDeepak(String b) {
// 		System.out.println(b);
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		javaDeepak t = new javaDeepak();
// 	}
// }
// Aman
// parameterised constructor
// no arg constructor
/*---------------------------------*//*---------------------------------*/
// 4.
// import java.io.*;
// import java.util.*;
// class Test {
// 	Test (javaDeepak obj) {
// 		System.out.println("Test clas constructor");
// 	}
// 	Test () {
// 		System.out.println(" 2nd constructor");
// 	}
// }
// class javaDeepak {
// 	void m1() { // this keyword can be used to pass as an argument as in method 1
// 		// System.out.println("I am in 1 method");
// 		Test t = new Test(this);
// 	}
// 	// void m2() {
// 	// 	m1(this);
// 	// }
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		javaDeepak obj = new javaDeepak();
// 		obj.m1();
// 		Test t = new Test(obj);
// 		// obj.m2(); // I am in method 1
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
//USES OF SUPER KEYWORD

// 1. Class A extends B => this keyword is used to refer current class obj  (A)
//  where super keyword is used to refer parent class object (B)

/*import java.io.*;
import java.util.*;

class A {
	int a = 10;
}
class javaDeepak extends A {
	int a = 20;
	void show(int a) {
		System.out.println(a); //30
		System.out.println(this.a); //20
		System.out.println(super.a);//10
	}

	public static void main(String[] args) throws IOException {
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		javaDeepak obj = new javaDeepak ();
		obj.show(30);
	}
}*/
// 30
// 20
// 10
/*---------------------------------*//*---------------------------------*//*---------------------------------*/

// 2. "Super" keyword cn be used to invoke immediate parent class method


/*import java.io.*;
import java.util.*;

class A {
        void method() {
                System.out.println("I am in class A");
        }
}
class B extends A {

        void method() {
                // method overriding
                System.out.println("I am in class B");

        }
        void show () {
                method(); // it will call the current class method
                super.method(); // this will call the parent cls method
        }
        public static void main(String[] args) throws IOException {
                B o = new B();
                o.show(); // I am in the A
        }
}*/

/*---------------------------------*//*---------------------------------*/
// 3. Super() can be used to invoke immediate parent clas constructor

/*import java.io.*;
import java.util.*;

class A {
        A() {
                System.out.println("Class A");
        }
}
class B extends A {
        B() {
                // super (keyword)  super() => used in the constructor
                // defalt calling of the parent constructor => by using the super()
                super(); // if use write or not this doesn't matter
                System.out.println("Class B");
        }

        public static void main(String[] args) throws IOException {
                B o = new B();
        }
}*/

/*-------------------------------------*//*---------------------------------*/
/*a good example for the super keyword*/
/*import java.io.*;
import java.util.*;
class Parent {
	int parentValue;

	Parent() {
		parentValue = 10;
		System.out.println("Parent constructor called.");
	}
}
class Child extends Parent {
	int childValue;

	Child() {
		super(); // Calls the default constructor of the Parent class
		childValue = 20;
		System.out.println("Child constructor called.");
	}

	void displayValues() {
		System.out.println("Parent Value: " + parentValue);
		System.out.println("Child Value: " + childValue);
	}
}

class Main {
	public static void main(String[] args) {
		Child childObj = new Child(); // Create an instance of the Child class
		childObj.displayValues(); // Display the values from both parent and child classes
	}
}*/
// output :
// Parent constructor called.
// Child constructor called.
// Parent Value: 10
// Child Value: 20


/*-------------------------------------------------------------------*/
/*-------------------------------------------------------------------------*//*---------------------------------*/
// USE OF FINAL KEYWORD

// 1. CONSTANT => if we create any final varible, it becomes constant, we cannot change the value of final varible
// 2. METHOD => if we create any final method, we cannot override it
// 3. Class => if we create any final class , we can't extend it or inherit it


// 1
// import java.io.*;
// import java.util.*;

// class test {
//      public static void main(String[] args) throws IOException {
//              final int i = 10;
//              /*i = i + 1;*/ // error : we cannot change the value of final varible
//              System.out.println(i);
//      }
// }
/*---------------------------------*//*---------------------------------*//*---------------------------------*//*---------------------------------*/
// 2.
// *** override *** => same name of method within different class with the same paramerter and also it must extends the parent class

// import java.io.*;
// import java.util.*;

// class Demo {
//      final void method() {
//              System.out.println("I am in class Method");
//      }
// }
// class test extends Demo {
//      /*void method () {  // to stop overring of the void method () from the parent class we use the final keyword
//              System.out.println("I am in TEST class");
//      }*/
//      public static void main(String[] args) throws IOException {

//      }
// }
/*----------------------------*//*---------------------------------*//*---------------------------------*/
// 3.

/*import java.io.*;
import java.util.*;

final class Demo {
        void method () {
                System.out.println(" Class Demo with final");
        }
}
class test extends Demo {
        // the Demo class cannot be inherited
        public static void main(String[] args) throws IOException {

        }
}*/


/*-----------------------------------------------------------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------------------------------------------------------*/


// USE OF STATIC KEYWORD  :

/*RULES FOR THE STATIC METHODS :
1. A "static" methods belongs to the class , not to the object
2. A "static" method can be accessed directly by class name and doesn't need any object
3. A "static" method can access only static data . it can't access non-static data(instance data)
4. A "static" method can call only other static methods and can't call a non-static method.
5. A "static" method cannot refer to "this" or "super" keyword in anyway.*/

// Access Modifiers            Non Access Modifiers
/*                      |
public                  |       static
private                 |       final
protected               |       abstract
default(NO modifier)    |       synchronized
                        |       transient
                        |       volatile
                                strictfp

*/
/*---------------------------------*//*---------------------------------*//*---------------------------------*/
// 1. varible(class level )  No local varible 2. method  3. block   4.  inner class (nested clas)
/*------------------*/
// 1.

/*import java.io.*;
import java.util.*;

class Test {
        static int  a = 10;
        void show() {
                // static int b =12;  this will give the error
        }
        public static void main(String[] args) throws IOException {

        }
}*/
/*-----------------*//*---------------------------------*/
//> static varible are used for memory management

/*import java.io.*;
import java.util.*;

class Demo {
        static int a = 10;
        // static varible belongs to the clss no object
}
class Test {

        public static void main(String[] args) throws IOException {
                System.out.println(Demo.a);
                // to access the static cls varible we can use the cls
                // there is no need to make object

        }
}*/

/*------------------*//*---------------------------------*//*---------------------------------*/
//When a varible is declared as static, then a single copy of varible is created and shared among all objects at class level
// Thus company name i.e pu will be shared e1, e2 with all the objects


// The static variable gets memory only once in the class area at the time of class loading
/*import java.io.*;
import java.util.*;

class Emp {
        int emid;
        String name;
        static String company = "PU";

        // since the same company name is repeaing
        Emp(int emid , String name ) {
                this.emid = emid;
                this.name = name;

        }
        void display() {
                System.out.println(emid + " " + name + " " + company);
        }
        public static void main(String[] args) throws IOException {

                Emp e1 = new Emp(101, "Aman");
                e1.display();

                Emp e2 = new Emp(102, "Priyanshu" );
                e2.display();
        }
}*/

// import java.io.*;
// import java.util.*;

// class CounterDemo {
// 	// int count = 0 ;  /* but this varible is for the unique objs */
// 	static int count = 0;  /* this count varible is for the class */
// 	CounterDemo() {
// 		count++;
// 		System.out.println(this.count);
// 	}
// 	public static void main(String[] args) throws IOException {
// 		CounterDemo c1 = new CounterDemo();
// 		CounterDemo c2 = new CounterDemo();
// 		CounterDemo c3 = new CounterDemo();
// 		System.out.println("Total no of obj created : " + count);
// 	}
// }


/*----------------*/
//STATIC METHOD :

/* memory managment */
// import java.io.*;
// import java.util.*;

// class Test1 {
// 	static void display2() {
// 		System.out.println("Test 1");
// 	}
// }
// class Test {
// 	void display() {  /* static method belongs to the clss not object */
// 		// for calling the instance method object is need to be created
// 		System.out.println("1");
// 	}
// 	static void show() {
// 		System.out.println("2");
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Test t = new Test();
// 		t.display();  // 1
// 		// this show() method is within a cls
// 		show();  // 2  /* direct calling  of the static cls */

// 		// for the calling of the static method need to specify the cls
// 		Test1.display2();  // Test 1
// 	}
// }


/*-------------------------------*/
// STATIC BLOCK

// static block execcutes automatically when the class is loaded in the memory
// without main method "hello world" can be printed but upto the 1.6 version of the jdk
// multiple static block can be created but they are executed from top to bottom
// native method are writtin other languages also they are stored in the static block for the class loading runing

// static block is used to initilize the static memebers
// import java.io.*;
// import java.util.*;

// class Test {
// 	static int a ;
// 	static {
// 		a = 10; /* initilize of the static members */
// 		System.out.println("This is static block 1");
// 		//System.exit(0); /*jvm gets shut down*/
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.out.println("I am in Main method ");
// 	}
// 	static {
// 		System.out.println("This is static block 2");
// 		//System.exit(0); /*jvm gets shut down*/
// 	}
// }
// This is static block 1
// This is static block 2
// I am in Main method

/*-----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/


// <-------------------(((((((((( EXCEPTIONAL HANDING )))))))--------------->
// An exception is an undwanted or une3xpected event, which occures during he execution of a program i.e at run time,
//  that disrupts the normal flow of the program
// and this is alternate way to handle this disturbing

// advantages : a normal flow or program runs without any interruption
// it don't removes the exception or either repair it >> it just finds the alternate way for it

// OBJECT IS THE PARENT CLASS OF ALL THE CLASSES IN JAVA

// 			Throwable (parent)
// 1.Exception (child)				2.Error (child)--------------------------------------------->VitualMachineError------->LinkageError
// => This is occrured by 			=>Error occured because of lack of System Resources 	     StackOverflowError	       ClassFormatError
// the program.					Programmers can't do anything			             OutOfMemoryError

// =>it can be recovered. 			=> this can't be recovered

// 2. types 					=>Runtime Exception only
// 2.1 Compile time ( check Exception )
// 2.2 Runtime ( Unchecked Exception )

/* <--------------HIERARCHY--------> */

// THESE ALL ARE COMPILE TIME EXCEPTIONS ------>
// 1. ClassNotFoundException
// 2. NoSuchMethodException
// 3. IOException [1. EOFException ] [2.FileNotFoundException] [3.IntruptedIOException]
// 4. SQL Exception
// 5. Remote Exception
// 6. Interruted Exception
// 7. Runtime Exception [1. Arthematic ] [2.ClassCastException] [3.NullPointerException] [IndexOutOfBoundException [1.ArrayIndexOutOfBound] [2.StringIndex]]  [7.IlligalArgumentException]

/*==========================================*/
// only there is checking at the compile time
// ALL THE EXCEPTION OCCUR AT THE RUNTMIE ONLY


// those exceptions which can be checked by the compiler are known as the compile time exception
// and those which cannot be checked by the compiler are known as the runtime exception

// and checked exception are need to try and catch i.e reported
// complier canot check the arthematic erros like sout(100/0);

// import java.io.*;
// import java.util.*;

// class Test {
// 	public static void main(String[] args) throws IOException {
// 		try {
// 			FileInputStream  fs = new FileInputStream("D:\\c++ code>output.txt");  /*FileNotFoundException:*/
// 		} catch (Exception e) {
// 			System.out.println(e);
// 		}
// 	}
// }
/*----------------------------*/

// import java.io.*;
// import java.util.*;

// class Test {
// 	public static void main(String[] args) throws IOException {
// 		// compile time example---->
// 		// FileInputStream fis = new FileInputStream("d:/abc.txt");
// 		// Clas.forName("com.mysql.jdbc.Driver");

// 		// runtime example ---> arthematic exception
// 		/*int a = 100 , b = 0 , c;
// 		c = a / b;
// 		System.out.println(c);*/

// 		/*String name = null;
// 		System.out.println(name.length());*/
// 	}
// }

// Whenever there is exception , the method in which exception occurs will create an object and that object will store
// three things :
// 1. exception name       2. description     3. stack trace

// if the exception is not handled by the jvm then it calls the (default exception handler)=> and it printes the exception
// We can handle the exception using 5 keyword :
// 1. try          2. catch           3. finally           4. throw            5. throws



/*----------------------------------------------*/
// handle exception throw the => (try and catch )

/*Syntax:
try
	{
	//risky code
}
catch (ExceptionClassName ref.var.name)
	{
	//handing code
}
*/


// import java.io.*;
// import java.util.*;

// class Test {
// 	public static void main(String[] args) throws IOException {
// 		try {
// 			int a = 100 , b = 0, c;
// 			c = a / b;
// 			System.out.println(c);
// 		} catch (ArithmeticException e) {  // e is ref of the exception used  and e store the (discription,stack trace,exception name)
// 			/* if we are not aware of the which exception should we provide then we can give [Exception] */
// 			System.out.println(e);
// 			// handling code ------->
// 			System.out.println("You Cannot Divide By Zero");
// 		}
// 	}
// }


/*------------------------------------------------------------------------------------------------------------------*/
// lecture 109
// e.printStackTrace()
// sout(e),    sout(e.toString())
// sout(e.getMessage()),  // no exception name , but prints description ,// and neither stack trace

/*------------------------------------------------------------------------------------------------------------------*/
// import java.io.*;
// import java.util.*;

// class javaDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		try {
// 			int a = 100, b = 0, c;
// 			c = a / b;
// 			System.out.println(c);
// 		} catch (ArithmeticException ae) {
// 			// ae.printStackTrace();
// 			System.out.println(ae);// java.lang.ArithmeticException: / by zero

// 		}
// 		// java.lang.ArithmeticException: / by zero
// 		// at javaDeepak.main(javaDeepak.java: 1589)

// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
//finally() ------>
// this is treated as the default word in the switch case cases-->

// import java.io.*;
// import java.util.*;

// class javaDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		try {
// 			// risky code
// 			System.out.println(100 / 2);
// 		} catch (Exception e) {
// 			// handling code
// 			System.out.println(e);
// 		} finally {
// 			// clean up code
// 			// the resources which are open in the try block i'll try to close the resources
// 			System.out.println("There is exception");
// 		}
// 	}
// }
/*---------------------------------*/
// read data from the file using the try and catch and finally block
// we can use multiple catch blocks with one try block but we can only use single finally block with one try block , not mutiple
// The statements presnt in the finally block executre evven if the try block contains control transfer statements (i.e ump statements ) like return , break or continue

// The possiblities that disturbs the execution of finally block are :
// Case 1 : Using of the System.exit() methods
// Case 2 : CAusing a fatal error that causes the process to abortt
// Case 3 : Due to an exception arising in the finally block
// Case 4 : The death of a Thread


// import java.io.*;
// import java.util.*;

// class javaDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		FileInputStream fis = null;
// 		try {
// 			fis = new FileInputStream("D:/c++ code/SUPREME_DSA/error.txt");
// 		} catch (FileNotFoundException e) {
// 			System.out.println("File not found");
// 		} finally {
// 			// cleanup here
// 			if (fis != null) {
// 				//  we can also use the try and catch block in the finally to close the files
// 				fis.close(); // this throws the Io exception
// 			}
// 			System.out.println("File closed");
// 		}
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
// WHAT IS DIFFERENCE BETWEEN FINAL FINALLY FINALIZE

// 1. Final is the keyword       		 1.finally is the block           1. Finalize is the method
// 2. Use with (varible)         		 2. use with the either try 	  2. Method is override for and object
// 		(method)	  		 or catch blocks		  3. protected void finalize() throws throable
// 		(class)				 3. finally block is used to         is the method which runs just before the garbage collection
// 					         close the resourse 		     clean up code ---> close the resource
//1. final int a = 10; (fixed value)

//2. cannot not be overrided if the
// method is declared as final
// class A{
// final void show(){}
// }
// class B extends A{
// void show(){} //---- this will show the error
// }

// 3. final class can't be inheried or extends

/*------------------------------------------------------------------------------------------------------------------*/
//lecture 112 :
// Various possible combinations of try and catch finally
// 1. single try , catch , finally can't be possible
// 2. I can use  the a single with multiple catch(exception 1) catch(exception 2) :: here exception 1 and 2 are not same
// 3. A single try can include the try and catch in itself but the outer try should have the catch block
// 4. same goes for the catch block :: statement 3
// 5. and simple try{} catch(){} finally{} possible
// 6. or try{} finally{}
// 7. or try{} finally{ try {}  catch(){} }

/*------------------------------------------------------------------------------------------------------------------*/
// lecture 113
// THROW KEYWORD :Throw keyword is used to create an exception object manually ie normally method creates an exception object as exception occurs in that method, but when use throw , programmer
// is responsible create an exception object.

// if there is error in the main method then jvm passes it to the defalut exception handler

// import java.io.*;
// import java.util.*;

// class javaDeepak {
// 	void divide() {
// 		// exception object is created with in this if this function is not handling the
// 		// exceptioo it is passed to the main method
// 		// if the main method is not handling the exception
// 		// then jvm passess it to the default exception handler

// 		try {
// 			System.out.println(100 / 0);
// 		} catch (ArithmeticException e) {
// 			e.printStackTrace();
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		javaDeepak t = new javaDeepak();
// 		// i am handling this divide exception in the caller method using the try and catch
// 		// try {
// 		// 	t.divide();
// 		// } catch (ArithmeticException e) {
// 		// 	// System.out.println(e);
// 		// 	e.printStackTrace();
// 		// }

// 		t.divide();
// 		System.out.println("hello"); // this shows the complete excution of the program
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
// USING THE THROW ---->

// if the age is below 18 then programmer creates and exception object manyally using throw keyword
// import java.io.*;
// import java.util.*;

// class test extends RuntimeException {
// 	test(String msg) {
// 		super(msg);
// 	}
// }
// class javaDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));

// 		/*// there is no rolw of the main method in this of throw exception by the user to the jvm
// 		throw new ArithmeticException();
// 		// throw keyword is used for the custom exception or user defined exception

// 		// unchecked exception are better to use : class test extends RuntimeException
// 		// if creating the checked exceptiom then : class test extends Exceptiom*/

// 		int age = 17;
// 		if (age < 18) {
// 			throw new test("You are not eligible");
// 			// class name, desc, stackTrace
// 			// this passes to the default exception handler by the jvm
// 		} else System.out.println("Success voting");
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
// lecture 114 : USE OF THROWS KEYWORD
// "throws" keyword is used to declare an exception. It gives an information to the caller method that there may occur an exception so it s better for the caller
// met to provide the exception handling code so that normal flow can be maintained
// throws keyword is used with the method

//FileInputStream class throws "FileNotFoundException " which is compile time exception or checked exception
// so we have to handle the exception and for this purpose we have to use either try-catch or throws keyword

// throws keyword is not used in the case of the unchecked exception

// throws keyword never handle the exception it just indicated and give the description of the exception

// import java.io.*;
// import java.util.*;

// class ReadAndWrite {
// 	void readfile() throws FileNotFoundException {
// 		FileInputStream fis = new FileInputStream("D:/c++ code/SUPREME_DSA/error.txt");
// 	}
// 	void sameFileName () throws FileNotFoundException {
// 		FileOutputStream fos = new FileOutputStream("D:/c++ code/javaworld/output.txt");
// 	}
// }
// class javaDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		ReadAndWrite rw = new ReadAndWrite ();
// 		try {
// 			rw.readfile();
// 		} catch (FileNotFoundException e) {
// 			e.printStackTrace();
// 		}
// 		System.out.println("Successful Execution");
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// DIFFERENCE BETWEEN THROW AND THROWS---->
// Throw ->  1. main method doesn't involve
//           2. throw keyword is mainly used for runtime exception or unchecked exception
//           3, In case of throw keywod we can throw only single exception
//           4. throw keyword is used within the method
//           5. throw keyword is followed by new instance
//           6. We cannot write any statement after throw keyword and thus it can be used to break the statement

// throws -> 1. keywod is used to declare the exception is. it indicates the call method
// 	        that given exception can occur so we have to handle it either using try catch block or again declare it by using throws keyword
//           2. but throws is mainly used for compile time exception
//              or checked exception
//           3. but in case of throws keyword we can declare multiple exception i.e void real
//           4. throws keyword is used with method signature
//           5. object but throws keyword is followed by class
//           6. but there is no such rule for the throws keyword
/*---------------------------------------------------------------------------------------*/
/*---------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/

// <=========== STRING IN JAVA ========>

// String is a non-primitive data type  -> all non-primitive data types simply called objects which are created by instantiating a class.
// size of string is not fixed
// 2.1 string is a array of characters  => char c = {'d','d','a'} (char Interface)  => String s = new String(c);
// 2.2 String is a class [class ... String]
// 2.3 string class inherites the objects class (which is the parent class of all classes)
// 3. SYNTAX :  public final class String extends Object implements (charSequence){.......}
// 4. String s = new String(); where s is pointing to the object which is IMMUTABLE in nature
// 4.1 String s = "Aman";


// 5. To create String there are three classes :
// 1. String      2. StringBuffer      3. StringBuilder

// STRING CONSTANT/LITERAL  POOL :---->  this is within the HEAP AREA
// 1. String s1 = new String ("deepak") ; // this created two objects one in heap and other in scp
// 2. String s2 = "rahul"; this is single object in the scp only
// In the case of the SCP the garbage collection doesn't work


// String objects are immutable it means once String objects created its data or state can't be changed but a new string object is created .. like catenation of the string of the previous value ------>
// why string are immuntable because =========>  all those refrence varbile which point the same value (mohali) if any of them changes their value then they didn't affect the other values and they create other object which changed reference gets pointed to that object


// 4, Why string class is final & difference between final and immutablity

//1. final class-----> can't be inherited those properties cannot be inherited
//2. final method----> if the same name method is created in other different class -----> method overriding  & also classes must have the Is-A relationship
// if the final method is created then the method cannot be overides
// 3. if the varible is created with the final then it's value cannot be changed
// if stringBuffere class object is declared final then it cannot be reassigned like s = s.append(" java")   but s.append("   java") can be done like its value can be changed


// Method of String ------------>
// 1.(==) is used for refernce comparison (address comparison) it means it cheks if both objects points to the same memory location or not
// 2. .equals() method is used for content comparison (in String class) it means it used to check object value


/*import java.io.*;
import java.util.*;

class Test {
	// (==) operator is used to reference comparison [address commparison]
	public static void main(String[] args) throws IOException {
		String s1 = new String("deepak");
		String s2 = new String("deepak");
		System.out.println(s1 == s2); //false  because they both are poiting to different object in the heap memory


		String s3 = "amit";
		String s4 = "amit";
		System.out.println(s3 == s4); //true they both are pointing to the same object created in the STRING CONSTANT POOL

		// whereas
		System.out.println(s1.equals(s2)); //true  content checking or value
		System.out.println(s3.equals(s4)); //true
	}
}*/

// 11 METHODS OF THE OBJECT CLASS()------------>
// 1.clone()
// 2.equals (Object obj)
// 3.finalize()
// 4.getClass()
// 5.hashCode()
// 6.notify()
// 7.notifyAll()
// 8.toString()
// 9.wait()
// 10.wait(long timeout)
// 11.wait(long timeout int nanos)


// this keyword can be used to pass as an argument of current class
// this keyword can be used to reference current class

// If we talk for the object class then equals and == both are same  ----> reference comparison and address comparison

/*import java.io.*;
import java.util.*;
// method overriding for the equals method
class Object {
	public boolean equals(Object obj) {
		return (this == obj);
	}
	public static void main(String[] args) throws IOException {
		// distinct object are pointing two different object
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2));   //false
	}
}*/

// since the .equals method is overridden in the string class and it changed the property of it by checking only the value not the reference of the two different object
// whereas .equals method of String class is used for content comparison i.e it is used for check object value

/*-----------------------------------------------------------------*/
// STRING CONSTRUCTORS----------------------->

// import java.io.*;
// import java.util.*;

// class stringDemo {
// 	// public String() {}
// 	// public String (String s) {}
// 	// public String (StringBuffer sb) {}
// 	// public String (StringBuilder sb) {}
// 	// public String (Char[] ch ) {}
// 	// public String (byte[] b) {}
// 	public static void main(String[] args) throws IOException {
// 		/*String s2 = new String();  // no arg constructor creates the empty object
// 		// this creates the immutable objects
// 		System.out.println(s2);
// 		// System.out.println(s2.length());*/

// 		/*StringBuffer ab = new StringBuffer ("Deepak");   // there can be StringBuilder
// 		String ss = new String(ab);
// 		System.out.println(ss);*/
// 		// byte []ab = {43, 23, 53};  //byte array can be passed in the string constructor
// 		// String ss = new String(ab);
// 		// System.out.println(ss);

// 		// byte[] ab = {43, 23, 53};  //+↨5
// 		// String ss = new String(ab);
// 		// System.out.println(ss); // Print the String object, not the byte array

// 		// char[] c = {'a', 'b', 'c'};
// 		// String ss = new String (c);
// 		// System.out.println(ss);


// 		char [] s1 = new char [] {'a', 'b', 'c'};
// 		String ss = new String ("abc");
// 		System.out.println("char arr: " + s1);
// 		System.out.println("string : " + ss);
// 	}
// }
/* So char array is better to store the password */
// char arr: [C@2f92e0f4  // it prints the object
// string : abc  // it prints the value in the object

// theory : String objects are immiuntable in java therefore if a passowrd is stored as plain text it wil be avaible in memory until Garbage collector clears, it but String objects are stored in String
// Literal pool for re-usablity and garbage colection is not applicable in SCP, which is security threat
// With an array, you can explicitly wipe the data after you're done with it. You can ovewrite the array with anything you like, and the password won't be present anywhere in the system, even before garbage collection .
/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

/* STRING CLASS METHOD (LENGTH , isEmpty , & trim() */

/*import java.io.*;
import java.util.*;

class Test {
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = read.nextLine();
		System.out.println("Enter the email : ");
		String email = read.nextLine();
		System.out.println("Enter the password : ");
		String password = read.nextLine();

		System.out.println(name.length());
		// int i = name.length();
		// if (i == 0)System.out.println("Name is empty");

		System.out.println(name.isEmpty()); //false
		// if(name.isEmpty()==true){
		// 	System.out.println("True");
		// }

		// trim method doesn't remove the spaces between the center
		String s = name.trim();
		System.out.println(s);
		// if(name.trim().length()==0){}//check if the length is empty or not
	}
}*/

/*------------------------------------------------------------------------------------------*/
// comparison of the two strings -------->

/*import java.io.*;
import java.util.*;

class Test {
	public static void main(String[] args) throws IOException {
		String s1 = "deepak";
		String s2 = "Deepak";
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2));  //true
		if (s1.equals("")) {}
		else {
			// this is the non empty case
		}
	}
}*/
/*--------------------------*/
// import java.io.*;
// import java.util.*;

// class Test {
// 	public static void main(String[] args) throws IOException {
// 		String a  = "a";
// 		String b  =  "A";
// 		System.out.println(a.compareTo(b)); // this lexicogrphicaly compare both the strings
// 		// output : 32
// 	}
// }
/*-------------------------------------------------------------------------------------------*/
// CATANATION |  JOIN  | subsquence
// join -> is the static method which concatenates the given elements with the delimeter and returnes the concatenated string

/*import java.io.*;
import java.util.*;

class Test {
	public static void main(String[] args) throws IOException {
		String s1 = "deepak";
		String s2 = "java";
		System.out.println(s1 + s2);// deepakjava
		System.out.println(s1 + 10);// deepak10
		System.out.println(s1 + 10 + 20);// deepak1020
		System.out.println(10 + 20 + s1 );// 30deepak
		System.out.println(s1 + 20 / 10 );// deepak2
		System.out.println(s1.concat(s2));// deepakjava

		// using the join
		System.out.println(String.join("~", s1, s2)); //deepak~java
	}
}*/

/*----------------*/
// There are two substring method of String clss i.e substring int (beginIndex) and substring (int beginIndex, intendIndex) it returns a new string that is a substring
// of this string, The substring begins at the specified beginIndex and extends to the character at index endIndex -1

/*import java.io.*;
import java.util.*;

class Test {
	public static void main(String[] args) throws IOException {
		String s = "This is the demo";
		System.out.println(s.subSequence(3, 9)); //s is t
		System.out.println(s.substring(3, 10)); //s is th
		System.out.println(s.substring(3)); //s is the demo
		System.out.println(s.substring(0, 0)); //This gives the empty string
	}
}*/

/*--------------------------------------------------------------------------*/
// Methods to update string
// 1. replace() 2. replaceFirst() 3. replaceAll()

// replace(char oldChar, char newChar) method returns a string replacing all the old characters or CharSequence to new characters or CharSequence

/*import java.io.*;
import java.util.*;

class Test {
	public static void main(String[] args) throws IOException {
		String s = "This is the Demo";
		System.out.println(s.replace("is" , "was"));    // it replaces the "is" with the "was"
		// Thwas was the Demo

		System.out.println(s.replaceFirst("is", "was"));//Thwas is the Demo
		System.out.println(s.replaceAll("is", "was"));//Thwas was the Demo
		System.out.println(s.replaceAll("is(.)", "was"));//Thwaswasthe Demo
		System.out.println(s.replaceAll("is(.*)", "was"));//Thwas
		// this is the called the regex
	}
}*/

/*----------------------------------------------------------------*/
// some searching method of the string in the java
/*import java.io.*;
import java.util.*;

class Test {
	public static void main(String[] args) throws IOException {

		// indexOf = returns the index pos of the char as well as string
		String s = "This is the demo";
		System.out.println(s.indexOf('e'));  //10
		System.out.println(s.indexOf("the"));  // 8

		// lastIndexOf = it searches the position from the last index
		String b = "deepak";
		System.out.println(b.indexOf('e')); //1
		System.out.println(b.lastIndexOf('e')); //2

		// charAt() method returns the character at the specified index. The index value should lie between 0 and len-1
		System.out.println(b.charAt(3)); //p

		// contains() method searches the dquence of charcters in the given string. It returns true if sequence of char values are are found in this string otherwise returns false
		System.out.println(b.contains("ep")); //true

		// startsWith() method tests if a string starts with the specified prefix beginning from 1st index. if yes then it will return true else false;
		System.out.println(b.startsWith("d")); //true

		// endsWith() method checks whether the string ends with a specified suffix. if yes then method will return true otherwise false
		System.out.println(b.endsWith("a"));  //false
	}
}*/

/*--------------------------------------------------------------*/
// String conversion ------------>
// Case conversion ---------> 1. toLowerCase() 2. toUpperCase()
// Type conversion  --------> 1. value of () 2. toCharArray()

/*import java.io.*;
import java.util.*;

class Test {
	public static void main(String[] args) throws IOException {

		// toUpperCase() method converts all characters of the string into a upperCase letter
		String s = "deepak";
		String a = "DEEPAK";
		System.out.println(s.toUpperCase()); //DEEPAK
		System.out.println(a.toLowerCase()); //deepak

		// valueOf () method converts different types of values into string By the of String valueof()  any data type into string
		int z = 20 , b = 10;
		System.out.println(z + b);  //30
		String p = String.valueOf(b);
		String q = String.valueOf(z);
		System.out.println(p + q);//1020

		// toCharArray() method  converts the given string into a sequnce of characters. The returned array length is equal to the length of the string
		char[] c = s.toCharArray();
		for (char i : c  ) System.out.print(i + " "); //d e e p a k
	}
}*/

/*------------------------------------------------------------------*/
// String buffer class ---------->
// Main difference between String and String buffer is : String objects are immutable and StringBuffer Objects are mutable
// if the data doesn't change or change one or two times only , use string if data is constantly or frequently changing like in calculator, notepad etc. we should use StringBuffer

// (old_cap(16)+1)*2

// import java.io.*;
// import java.util.*;

// class Test {
// 	public static void main(String[] args) throws IOException {
// 		StringBuffer sb = new StringBuffer("Aman");
// 		System.out.println(sb.capacity());  //16 + 4 aman i.e (string length)

// 		StringBuffer s = new StringBuffer(1000);  //default capacity set

// 		StringBuffer ss = new StringBuffer ("Deepak java");
// 		System.out.println(ss.length()); // 11
// 		System.out.println(ss.append(" Aman")); //Deepak java Aman
// 		System.out.println(ss.delete(0, 5)); // from 0 to 5    k java Aman


// 		/* imp */
// 		StringBuffer a = new StringBuffer("Aman");
// 		StringBuffer b = new StringBuffer("Aman");
// 		System.out.println(a.equals(b)); // false
// 		//  becoz StringBuffer cls doesn't override equals method of Object clss but String cls overide the equals cls override the method of Object cls
// 		// here a and b both are refering the different objects

// 		StringBuffer c = new StringBuffer ("raj");
// 		StringBuffer d = c;
// 		System.out.println(c.equals(d)); // [true] c and d both are pointing to the same object
// 		System.out.println(c.indexOf("j"));  //2
// 		System.out.println(c.insert(3, " Aman")); // raj Aman
// 		System.out.println(c.replace(4, 5, "T")); // s,e,string  raj Tman

// 		// The reverse method is in the stringBuffer cls not in the string cls
// 		StringBuffer x = new StringBuffer("abcdefgh");
// 		System.out.println(x.reverse()); //hgfedcba
// 		System.out.println(x.subSequence(2, 5)); //fed
// 		System.out.println(x.substring(2, 5)); //fed
// 		System.out.println(x.substring(2)); //fedcba

// 		x.setCharAt(3, 'c'); // set c at the 3rd pos
// 		System.out.println(x); //hgfcdcba

// 		// set the max lenght of the string
// 		x.setLength(5);
// 		System.out.println(x); //hgfcd


// 		// to delete the waste size
// 		StringBuffer obj = new StringBuffer ();
// 		obj.ensureCapacity(100);
// 		obj.append("hello");
// 		obj.trimToSize();  // 95 size were left it will trim out
// 		System.out.println(obj.capacity());  //5
// 	}
// }

/*---------------------------------------------------------------------*/
// STRING BUILDER ------------->

// String ==> immutable
// StringBuffer=> mutable (objects), synchronized(methods)
// Syn in java gurantess taht no two threads can execute a sun method which requires the same lock simultaneously or concurrently. And this, syn increases waiting time of thread and effects performance of the system .
// To overcome the pbrlm of slow performance of StringBuilder methods, and creates all methods of StringBuilder as non-synchronized which increases the methods performances.

// StringBuilder -> mutable(object), non-syn methods]


// import java.io.*;
// import java.util.*;

// class Test {
// 	public static void main(String[] args) throws IOException {
// 		StringBuffer sb = new StringBuffer();
// 		StringBuilder sb1 = new StringBuilder();
// 		// System.out.println(sb1.capacity());16
// 	}
// }
/*----------------------------------------------------------------------*/

// Reverse the string in java
// and check if Palindrome check

/*import java.io.*;
import java.util.*;

class Test {
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		String s = read.nextLine(), temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp += s.charAt(i);
		}
		System.out.println(temp);//Aman -> namA
		if (s.equals(temp)) System.out.println("Yes");
		else System.out.println("No");
	}
}*/
/*--------------------------------------------------------------------------------*/

// Find th emaximum & minimum occuring character in given String

// import java.io.*;
// import java.util.*;

// class Test {
// 	public static void main(String[] args) throws IOException {
// 		String s = "aaabbc";
// 		int[] temp = new int[127];
// 		for (int i = 0 ; i < s.length(); i++) {
// 			temp[s.charAt(i)]++;
// 		}
// 		char maxChar = ' ', minChar = ' ';
// 		int maxCount = -1 , minCount = Integer.MAX_VALUE;

// 		for (int i = 0 ; i < s.length(); i++) {
// 			int cnt = s.charAt(i);
// 			if (maxCount < temp[cnt]) {
// 				maxCount = temp[cnt];
// 				maxChar = (char)cnt;
// 			}
// 			if (minCount > temp[cnt]) {
// 				minCount = temp[cnt];
// 				minChar = (char)cnt;
// 			}
// 		}
// 		System.out.println("Maxi occ : " + maxChar);  // a
// 		System.out.println("Mini occ : " + minChar);  // c
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
/*---------------------------------------------------------------------*/
// MULTIPLE TASK -> It increases the performance of the cpu
// it can be achieved by two types ->1. process based by mutlitasking    2. Thread based multitaking

// multiprocessing =>When one system is connected to the muliple cpu to  complete the task.
// it is suitable at system level

// multithreading ---> executing muliple sub process (program) ( small task ) or threads at a single time
// it uses in the software and games and animations---
// thesee small task is acheived by the methods in java

// we have to create thread of the methods to execute it at a time
// multithreading is best suitable at programming level
// java provides predefined API'S (Application programming interface(includes more classes and interfaces)) {thread, runable , threadGroup, concurrency , threadPool}

// import java.io.*;
// import java.util.*;

// class VLC {
// 	public static void main(String[] args) throws IOException {  // jvm makes this main program thread to process it fast


// 	}
// }
// class Video {
// 	void playVideo() {

// 	}
// }
// class Music {
// 	void playMusic() {

// 	}
// }
/*------------------------------------------------------*/
// difference between the process and thread ------->

// program --> a program which is in executing state (heavy weight),( takes less time in context swiching),(communication - takes more time ),(each process has diff process address)(dependancy -they are not dependent on each other ),(don't require synchronization),(resource consuption is more )(time for creation -> more),(time for termination -> more time )
// thread ---> it is a subpart of the process(sub task)(light weight),(takes more time in context swiching),(communication - takes less time),(threads share same address space),(they are dependent are no each other),...............,(may require synchronization ),(resource consuptoin is less),(time for creation -> less),(time for termination -> less time )

// ```
// context switching----> is a process that involves switching of the CPU fromm one process or task to another.
// In this phenomenon, the execution of the process that is present in the running state is suspended , by the kernel and another process that is present in the ready state is executed by the cpu
// It is one of the imp feature of the mulitasking os. The processes are switched so fastly that it gives and illusinon to the user that all the processes are begin executed at the same time.
// ```
/*-------------------------------------------------------*/
// there are two ways to create the thread  1. thread class   2. Runnable (interface)
// class thread ------> is in pakage java.lang;
// 1.extends the thread clss   2. override the runmethod   3.create an obj of the cls     4. start the thread by using start()
/* LIFE CYCLE OF THREAD ( 5 stages ) */
// 1.1 new thread created  4.1. runnable  -->(jvm will allocate the process) -------->(when task is completed )---->dead(closed)
// 4.2  sleep(), waiting (),suspend() ------> non - runnable states

// syntaxes------>
// import java.io.*;
// import java.util.*;
// class Test extends Thread {
// 	public void run() {
// 		/* thread tasks */
// 	}
// 	public static void main(String []args) {
// 		Test t = new Test();
// 		t.start();
// 	}
// }
/*---------------------------------------------------------*/
//  HOW TO CREATE THREAD IN JAVA

// 1. way to create the thread using the extends of the thread class
// import java.io.*;
// import java.util.*;
// class Test extends Thread {
// 	public void run() {
// 		/* thread tasks */
// 		System.out.println("Thread tasks");
// 	}
// 	public static void main(String []args) {
// 		Test t = new Test();
// 		t.start();
// 		// we cannot invoke the thread multiple time using the start
// 	}
// }
/*----------*/

// 1.implement the runnable interface 2. override the run() method 3. create an obj of the(test) class 4. create an obj of the thread clss and pass the ref of the test cls obj
// this is the better way to create thread using the runnable interface

// import java.io.*;
// import java.util.*;

// class Test implements Runnable {
// 	@Override
// 	public void run() {
// 		System.out.println("thread tasks");
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Test t = new Test();
// 		Thread th = new Thread(t);  // passing the ref of the obj in the cons of the thread class
// 		th.start(); // thread tasks
// 	}
// }

/*--------------------------------------------------------*/
// Executing the muliple thread
// case 1.Performing single task from single thread
// case 2.Performing single task from multiple thread
// case 3.Performing mulitple task from single thread  ---> this is not possible
// case 4.Performing mulitple task from multiple thread

// import java.io.*;
// import java.util.*;

// class mythread_1 extends Thread {
// 	public void run() {
// 		System.out.println("task_1");
// 	}
// }
// class mythread_2 extends Thread {
// 	public void run() {
// 		System.out.println("task_2");
// 	}
// }
// class Test  {
// 	public static void main(String[] args) throws IOException {  // thread 3
// 		mythread_1 t1 = new mythread_1();  // thread 1
// 		t1.start();
// 		mythread_2 t2 = new mythread_2(); // thread 2
// 		t2.start();
// 	}
// }
// t1 thread and t2 can be start anomylsly we can't guess which will start first
// total no of thread will be 3(including the main thread)
/*-----------------------------------------*/
// Thread class constructor and methods-------->

// import java.io.*;
// import java.util.*;

// class Test extends Thread {
// 	public void run() {
// 		System.out.println("Thread 1");
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Test t = new Test();
// 		t.start();

// 	}
// }

