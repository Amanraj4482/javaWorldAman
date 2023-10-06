//  A pakage arrange number of classes , interfaces and sub-pakages of same type onto a particular group

// pakage is nothing but a folder in a windows
// types - > 1. predefined       2. user defined

// 1. reusablity    2. security   3. fast searching   4. naming conflectin    5. hiding

// java.lang => it is the default pakage also known as the heart of the java because without using this we can't write even a single progarm and we not need to import this because it is default
// java.util => this package is used to implement data structure of java . it contain utility classes also knwon as collection framework ( LinkedList , stack , vector, hashset, tree)
// java.applet=> This pakage mainly use to develop GUI related application .Applet programs are web realted progeam created at server but executed at client machine
// java.awt => Awt stands for the abstract window toolkit . it is also wused to developed GUI application progeam is awt program between applet & awt program is awt pogram are stand alone program and it contain main method unlike applet
// java.net => realted to the network URL, InetAddress , URLconnection , and so on
// java.SQL => connection , statement , result set etc, realted to sql
// javax.Swing => Jframe, Jbuttom , ,Jtextfield (platform independent)--> where x denoted the it extends the java.awt classes

/*------------------------------------------------------------------------------------------------------------------*/
// READ DATA FROM THE  FILE

/*import java.io.*;
import java.util.*;

class pakage {
	public static void main(String[] args) throws IOException {
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));

		try {
			File r = new File ("D:\\c++ code\\JavaWorld\\input.txt");
			Scanner sc = new Scanner (r);
			while (sc.hasNextLine()) { // if data available then returns true
				System.out.println(sc.nextLine());
			}
		} catch (IOException e)  {
			System.out.println("Exception Handled...");
		}
	}
}*/
/*input*/
// java Programming
// please like and share SUBSCRBIE

/*output*/
/*java Programming
please like and share SUBSCRBIE
*/
/*------------------------------------------------------------------------------------------------------------------*/
// USER DEFINED FUNCTION ------>
// syntax : pakage PACKAGE_NAME;
// Rules 1. pakages statement must be first line of the program
// Rules 2. The way of complitation of these classes would be different
// ex. javac -d . CLASS_NAME.java       (compiled program)
// and then the folder will be created then the .classfile will avaible in the that folder
/*------------------------------------------------------------------------------------------------------------------*/
// D:\c++ code\JavaWorld\aman>javac -d . pakage_file.java
// D:\c++ code\JavaWorld\aman>java aman.pakage_file
// Learn coding..!
/*---------------------------------------------------------*/
// javac -d . package_file.java && java aman.package_file

/*package aman;
public class package_file {
	private void show() {
		System.out.println("Learn coding..!");
	}
	public static void main (String[] args) {
		package_file obj = new package_file();
		obj.show();
	}
}
*/

/*----------------------------*/
// private method type
// with in the package other classes cannot access the method of the another class which is of private type;
/*package aman;
class A {
	void show() {
		System.out.println("Grasp Coding...!");
	}
}
class package_file {
	public static void main(String[] args) {
		A obj = new A();
		obj.show();
	}
}*/
/*-------------------------------*/
// default method type --> within class and within the package it can be access
/*package aman;
class A {
	public void show() {
		System.out.println("Grasp Coding...!");
	}
}
class package_file {
	public static void main(String[] args) {
		A obj = new A();
		obj.show();
	}
}*/
/*---------------------------------*/
// proteceted -> within (class, package , outside the package by sub class)--, but not outside the pacakge

/*package aman;
class A {
	protected void display() {
		System.out.println("A Method");
	}
}
// make this pacakge_file public
public class package_file extends A {
	//  i have to access this protected void show method in the other file
	protected void show() {
		System.out.println("Package_file Method");
	}
	public static void main(String[] args) {
		A obj = new A();
		obj.display();

		package_file obj1 = new package_file();
		obj1.show();
		obj1.display();
	}
}*/

/*---------------------------------*/
package aman;
public class package_file {
	protected void show() {
		System.out.println("package file Method");
	}
	public static void main(String[] args) {
		package_file obj = new package_file();
		obj.show();
	}
}