/*           abstract class                         |               Interface
1.Abstract class can have abstract 		  |1.Interface can have only abstract method
and non-abstract methods			  |2. Interface supports mulitple inheritance
2. abstract class doesn't support mulitple 	  |3.interface has only static and final varibles
inheritence					  |4.interface can't provide the immplementation of
3.Abstract class can have fin, non-final, 	  |abstact class
static, and non-static varibles			  |5.Members of a java interface are public by default
4. Abstarct class can provide the immplementation |6/ there is not constructor
of the interface                                  |
5. A java abstarct class can have class members   |
like private protected etc,
6. there is constructor
*/









/*---------------------------------*/
/*import java.io.*;
import java.util.*;

abstract class Ademo {
	int var1;
	final int var2 = 10;
	void f() {
		System.out.println("F from Ademo");
		var1++;
	}
	abstract void g();
}
interface I {
	// it has only static and final varibles
	int var3 = 4 ; // it is must to give the initial value
	// it is default final varible in the interface
	final int var4 = 5;
	// there is default abstract method in the interface
	// we need to make it default
default void h () {
		System.out.println(" B from I ");
		var3++; // this cannot be done until the var3 is final
	}
	abstract void j();
}*/
/*------------------------------------------------------------------------------------------------------------------*/
// i can make the abstract class if i have the interface

// interface I1 {
// }
// class Abase implements I1 {}
/*---------------------------------*/
// i cannot make the interface using the class
// a interface can only implements the interface it cannot extends any
/*abstact class Abase {}
interface I extends Abase {}*/
/*---------------------------------*/

// interface I {
// 	void f(); // this methods is public
// 	// we cannot make the constructor in the interface
// 	/*public I(){
// 		System.out.println(" I created ");
// 	}*/
// }
// abstract class Abase {
// 	abstract void h ();
// 	public Abase() {
// 		System.out.println(" Abase created ");
// 	}
// }
// class Derived extends Abase implements I {
// 	// this void f methods has to be public
// 	public void f() {
// 		System.out.println("F called ");
// 	}
// 	void h() {
// 		System.out.println("H called");
// 	}
// }
/*--------------------------------------*/
