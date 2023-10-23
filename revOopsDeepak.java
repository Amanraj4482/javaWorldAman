// import java.io.*;
// import java.util.*;

// class Human {
// 	public Human() {

// 	}
// 	// private int age = 11;
// 	private int age = 11;
// 	// this varible age means it only accessble in the same class
// 	// private String name = "Navin";
// 	private String name = "Navin";

// 	public int getAge() {
// 		return age;
// 	}
// 	public void setAge(int age, Human obj) {
// 		obj.age = age;
// 	}
// 	public String getName() {
// 		return name;
// 	}
// 	public void setName(String name) {
// 		this.name = name;
// 	}
// }
// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		Human obj = new Human();
// 		// obj.age = 11;
// 		// obj.name = "Aman";

// 		// System.out.println(obj.name);

// 		obj.setAge(12, obj);
// 		obj.setName("Navin");
// 		System.out.println(obj.getAge() + " " + obj.getName());
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));

// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	public static void solve(int[] v) {
// 		int c1 = 0, c2 = 0, c0 = 0;
// 		for (int i = 0; i < v.length; i++) {
// 			if (v[i] == 0) c0++;
// 			else if (v[i] == 1) c1++;
// 			else c2++;
// 		}
// 		int i = 0;
// 		while (c0 > 0) {
// 			v[i] = 0;
// 			c0--; i++;
// 		}
// 		while (c1 > 0) {
// 			v[i] = 1;
// 			c1--; i++;
// 		}
// 		while (c2 > 0) {
// 			v[i] = 2;
// 			c2--; i++;
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		Scanner read = new Scanner(new File("input.txt"));
// 		int n = read.nextInt();
// 		int v[] = new int[n];
// 		for (int i = 0; i < n; i++) {
// 			v[i] = read.nextInt();
// 		}
// 		solve(v);
// 		for (int i = 0; i < n; i++) {
// 			System.out.print(v[i] + " ");
// 		}
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// Encapsulation program in the java
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	private String mb, ramSize;
// 	public void setmb(String mb) {
// 		this.mb = mb;
// 	}
// 	public void setramSize(String ramSize) {
// 		this.ramSize = ramSize;
// 	}
// 	public String getramSize() {
// 		System.out.println("Ramsize is " + ramSize);
// 		return ramSize;
// 	}
// 	public String getmb() {
// 		System.out.println("Mother Board is " + mb);
// 		return mb;
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		revOopsDeepak c = new revOopsDeepak();
// 		c.setmb("Aman");
// 		c.setramSize("16gb");



// 		c.getmb();
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// inheritance concept in the java
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	int z;
// 	public void add(int x, int y ) {
// 		z = x + y;
// 		System.out.println(z);
// 	}
// 	public void sub(int x, int y ) {
// 		z = x - y;
// 		System.out.println(z);
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		Child c = new Child();
// 		c.mul(19, 20);
// 		c.add(19, 20);
// 		c.sub(19, 20);
// 	}
// }
// class Child extends revOopsDeepak {
// 	public void mul(int x, int y ) {
// 		z = x * y;
// 		System.out.println(z);
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// polymorphism

// import java.io.*;
// import java.util.*;

// class c {
// 	// overloading
// 	static int mul(int a, int b ) {
// 		return a * b;
// 	}
// 	static double mul(double a , double b) {
// 		return a * b;
// 	}
// }
// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		System.out.println(c.mul(2, 4));
// 		System.out.println(c.mul(2.1, 4.1));
// 	}
// }
/*---------------------------------*/
// overriding
// import java.io.*;
// import java.util.*;

// class parent {
// 	void print() {
// 		System.out.println("parent class");
// 	}
// }
// class test1 extends parent {
// 	void print() {
// 		System.out.println("test1");
// 	}
// }
// class test2 extends parent {
// 	void print() {
// 		System.out.println("test2");
// 	}
// }
// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		parent a;
// 		a = new test1();
// 		a.print();
// 		a = new test2();
// 		a.print();
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// use of super keywrod
// import java.io.*;
// import java.util.*;

// class SuperCls {
// 	int num = 20;
// }
// class SubCls extends SuperCls {
// 	int num = 10;
// 	public void myMethod() {
// 		SubCls s = new SubCls();
// 		System.out.println("value in sub " + s.num);
// 		System.out.println("value in super " + super.num);
// 	}
// }
// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		SubCls d = new SubCls();
// 		d.myMethod();
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// inner cls in the java
// import java.io.*;
// import java.util.*;

// class outer {
// 	int x = 19;
// 	class inner {
// 		int y = 5;
// 	}
// }
// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		outer o = new outer();
// 		outer.inner i = o.new inner();
// 		System.out.println(o.x);
// 		System.out.println(i.y);
// 	}
// }

/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		char[] c = {'j', 'a', 'v', 'a'};
// 		String s1 = new String(c);

// 		String s2 = "java";

// 		System.out.println(s1);
// 		System.out.println(s2);
// 		System.out.println(s1.length());
// 		System.out.println(s2.concat(s1));
// 		System.out.println(s1.substring(1));
// 		System.out.println(s1.substring(1, 4));
// 		System.out.println(s1.replace('a', 'e'));
// 		System.out.println(s1.replace("a", "within"));
// 		System.out.println(s1.trim());
// 		System.out.println(s1.toUpperCase());
// 		System.out.println(s1.toLowerCase());
// 		System.out.println(s1.equals(s2));
// 	}

// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// Enum
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	public enum toss {WIN, LOSE}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		for (toss t : toss.values()) {
// 			System.out.println(t);
// 		}
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// exceptional handling
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		try {
// 			int data = 23 / 5;
// 		} catch (NullPointerException e) {
// 			System.out.println(e);
// 		} finally {
// 			System.out.println("Finally block is always executed");
// 		}
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
//throw keyword
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	public static void checkNum(int num) {
// 		if (num < 1) {
// 			throw new ArithmeticException ("\nNumber is negative , can't calculate square");
// 		} else {
// 			System.out.println("Square of " + num + " is " + (num * num));
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		revOopsDeepak obj = new revOopsDeepak();
// 		obj.checkNum(-3);
// 		System.out.println("Rest of the code");
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// throws keyword
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	public static int divideNum(int n , int m ) throws ArithmeticException {
// 		int div = m / n;
// 		return div;
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		revOopsDeepak t = new revOopsDeepak();
// 		try {
// 			System.out.println(t.divideNum(33, 0));
// 		} catch (ArithmeticException e) {
// 			System.out.println("Number can't be divided by zero");
// 		}
// 		System.out.println("Rest of all");
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// throw and throws
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	static void method()throws ArithmeticException {
// 		System.out.println("Inside the method");
// 		throw new ArithmeticException ("Throwing ArithmeticException");
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		try {
// 			method();
// 		} catch (ArithmeticException e) {
// 			System.out.println("caught is main() method");
// 		}
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// user defined excetion----->
// import java.io.*;
// import java.util.*;

// class excep1 extends Exception {
// 	excep1(String s) {
// 		super(s);
// 	}
// }
// class abc {
// 	static void check(int i )throws excep1 {
// 		throw new excep1 ("Not valid number");
// 	}
// }
// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		try {

// 			abc.check(15);
// 		} catch (excep1 e1) {
// 			System.out.println(e1);
// 		}
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// static keyword
// import java.io.*;
// import java.util.*;

// class abc {
// 	static int count = 0;
// 	abc() {
// 		count++;
// 		System.out.println(count);
// 	}
// }
// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		abc a = new abc();
// 		abc b = new abc();
// 		abc c = new abc();
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		String a = "Easy Engineering classes";
// 		int countCh = 0;
// 		String[] s = a.split(" ");
// 		for (int i = 0; i < s.length ; i++ ) {
// 			countCh += s[i].length();
// 		}
// 		System.out.println(s.length);
// 		System.out.println(countCh);
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------*/
