//CONSTRUCTORS-special method that is called when an object is instanitiated(created)

// import java.io.*;
// import java.util.*;

// public class Human {
// 	String name;
// 	int age;
// 	double weight;

// 	//construct has been created
// 	Human(String name, int age, double weight) {//instance of the Human class
// 		this.name = name;
// 		this.age = age;
// 		this.weight = weight;

// 	}
// 	void eat() {
// 		System.out.println(this.name + " is eating");
// 	}
// 	void drink() {
// 		System.out.println(this.name + " is drinking");
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Human human = new Human("Aman", 34, 65);//passing an argument to a constructor
// 		Human human2 = new Human("Raj", 18, 70);
// 		// System.out.println(human.name);//object name and it's attribute
// 		// System.out.println(human.age);
// 		// System.out.println(human.weight);
// 		// System.out.println();
// 		// System.out.println(human2.name);//object name and it's attribute
// 		// System.out.println(human2.age);
// 		// System.out.println(human2.weight);

// 		human2.eat();
// 		human.drink();
// 	}
// }
//constructors allows us to assign different attributes to each objects
// Aman
// 34
// 65.0

// Raj
// 18
// 70.0
// Raj is eating
// Aman is drinking




// Instance variable are declared in a class, but outside a method, constructor or any block

// an instance varible is a variable that belongs to an instance (obejct) from a class of a class rather
// that being associated with the class itself Each object created from a class has its own copy of instance varible , and they hold the specifc state
// or data for that data Instance varibles are declared within the class but outside any method. and they are initiized when an object is created using the class constructor.

// instance varible are used to represent the state or attributes of an object.

// import java.io.*;
// import java.util.*;

// class Emp {
// 	public String name; // visible for any child class
// 	private  int salary; // visible only in the emp class only
// 	public Emp (String empName) { // the name varible is assinged in the constructor
// 		name = empName;
// 	}
// 	public void setSalary(int empSal) {
// 		salary = empSal;
// 	}

// 	// this method prints the emp details
// 	public void printEmp() {
// 		System.out.println("name :" + name);
// 		System.out.println("salary :" + salary);
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Emp empone = new Emp("Rasmika");
// 		empone.setSalary(1000);
// 		empone.printEmp();
// 	}
// }


// class varibles are also known as static varibles are declared with the static keyword
// but outside the method constructor or block


// constants variable never change form their declared value and they are declared as public /private final and static
// static varibles are created when the program starts and destroyed when it stop

// static varibles can be asseced by calling the class name className.VariblesName

// import java.io.*;
// class Employee {
// // salary variable is a private static variable
// 	private static double salary;
// // DEPARTMENT is a constant
// 	public static final String DEPARTMENT = "Development ";
// 	public static void main(String args[]) {
// 		salary = 1000;
// 		System.out.println(DEPARTMENT + "average salary:" + salary);
// 	}
// }



// DYNAMIC INITILISATION
// import java.io.*;
// import java.util.*;

// class Rectangle {
// 	private double length;
// 	private double width;

// 	public Rectangle (double length, double width) {
// 		this.length = length;
// 		this.width = width;
// 		System.out.println("length is: " + length);
// 		System.out.println("Width is: " + width);
// 	}
// 	public static void main(String[] args) throws IOException {
// 		// creating a instance of Rectangle class
// 		Rectangle rec = new Rectangle(12, 12);
// 	}
// }

// USING THE SETTER GETTER METHOD

// import java.io.*;
// import java.util.*;

// class Rectangle {
// 	// this are two instance varibles
// 	double length;
// 	double width;

// 	// Getter method are used to access the value of an instance varible

// 	public double getLength() {
// 		return length;
// 	}

// 	// Setter method are used to set the value of an instance varible
// 	// this method sets the value of the length to the given input parameter.

// 	public void setLength(double length) {
// 		this.length = length;
// 	}


// 	public double getWidth() {
// 		return width;
// 	}
// 	public void setWidth(double width) {
// 		this.width = width;
// 	}

// 	public void printdata() {
// 		System.out.println("length is : " + length);
// 		System.out.println("width is : " + width);
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Rectangle rec = new Rectangle();
// 		// setting the value of the length and width usnig the setter method
// 		rec.setLength(23);
// 		rec.setWidth(33);
// 		rec.printdata();
// 	}
// }


// Widening=> Converting a lower datatype to a higher datatype is known as widening.
// In this case the casting  / conversion is done automatically therefore, its is known as implicit type casting. In this
// case both datatypes should be compatible with each other.

// import java.io.*;
// import java.util.*;
// class WideningExample {
// 	public static void main(String args[]) {
// 		char ch = 'C';
// 		System.out.println((int)ch);
// 	}
// }


// Narroing => also known as explicitly using the cast operator .
// therefore it is known as explicit type casting .

// import java.util.Scanner;
// class NarrowingExample {
// 	public static void main(String args[]) {
// 		int i = 67;
// 		System.out.println((char) i);
// 	}
// }



// import java.io.*;
// import java.util.*;

// class Test {

// 	public static void main(String[] args) throws IOException {
// 		String name = "james";

// 		boolean result = name instanceof String;
// 		System.out.println(result);

// 	}
// }


// CALCULATION JAVA
// FOR EACH LOOP IN THE JAVA
// import java.io.*;
// import java.util.*;

// class Calculation {

// 	public static void main(String[] args) throws IOException {
// 		String []names = {"Java", "C", "C++", "Python", "JavaScript"};
// 		System.out.println("Printing the content of the array names:\n");
// 		for (String name : names) {
// 			System.out.println(name);
// 		}
// 	}
// }


// An entity that has state and behaviour is know as an object.
// Collection of objects is called class.
// it can also be defined as a blueprint form which you can create an individual object. Class doesn't consume any space.





// code to print the 1 to 100 palindrome number

// import java.io.*;
// import java.util.*;

// public class Human {
// 	// function to check the palindrome or not

// 	public static boolean isPalindrome(int n ) {
// 		int a = n;
// 		int b = 0;
// 		while (n != 0) {
// 			int rem = n % 10;
// 			b = b * 10 + rem;
// 			a /= 10;
// 		}
// 		return a == b;
// 	}
// 	public static void main(String[] args) throws IOException {
// 		for (int i = 1; i <= 10; i++ ) {
// 			if (isPalindrome(i)) {
// 				System.out.println(i + " ");
// 			}

// 		}

// 	}
// }

import java.io.*;
import java.util.*;

class A {
	int x = 10;
	A() {
		System.out.print("A");
	}
	void show() {
		System.out.print("B");
	}
}
class B extends A {
	int x = 20;
	B() {
		System.out.print("B");
	}
	@Override
	void show() {
		System.out.print("A");
	}
}
class Main {
	public static void main(String[] args) throws IOException {
		A a1 = new B();
		System.out.print(a1.x); // AB10
		a1.show(); //A
		System.out.println();   //----------- AB10A

		B b1 = new B();
		System.out.print(b1.x); //AB20
		b1.show(); //A
		System.out.println();//------------- AB20A

		A a2 = new B();
		System.out.print(a2.x); //AB10
		a2.show();//A
		System.out.println();//-------------AB10A

		// B b2 = new A(); // runtime error
		// System.out.print(b2.x); //AB10 with the runtime error
		// b2.show();
	}
}
// AB10A
// AB20A
// AB10A
// runtime error