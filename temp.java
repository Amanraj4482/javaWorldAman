/*import java.io.*;
import java.util.*;

class temp {
	void show(int... a ) {
		System.out.println("A");
		System.out.println(a);
		System.out.println("B");
	}
	public static void main(String[] args) throws IOException {
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		temp t = new temp();
		t.show(10);
		t.show(10, 20, 30);
	}
}
A
[I@372f7a8d
B
A
[I@2f92e0f4
B
*/
/*------------------------------------------------------------------------------------------------------------------*/
/*import java.io.*;
import java.util.*;

class A {
	int a = 10;
	// void show(int a) {
	// 	System.out.println(this.a);//10
	// 	System.out.println(a);//400
	// }
	A(temp t) {
		System.out.println(this.a);
		System.out.println(" p constructor");
	}
	A() {
		System.out.println(this.a);
		System.out.println(" Non constructor ");
	}
}
class temp extends A {
	temp() {
		super();
	}
	int a  = 20;
	// void show(int a) {
	// 	System.out.println(a);//400
	// 	System.out.println(this.a);//20
	// 	super.show(a);
	// }
	void m1() {
		System.out.println(" m1 ");
		temp t = new temp (this);
	}
	void m2() {
		System.out.println(" m2 ");
		m1(this);
	}
	public static void main(String[] args) throws IOException {
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		// temp  t = new temp(t);
		// t.show(400);
	}
}*/

/*------------------------------------------------------------------------------------------------------------------*/
// import java.io.*;
// import java.util.*;
// class imp {
// 	void m2 () {
// 		System.out.println(" I am in the method ");
// 	}
// }
// class demo extends imp {
// 	int a  = 10;
// 	demo(temp t ) {
// 		System.out.println(" p demo cons");
// 	}
// 	demo() {
// 		System.out.println(" non demo cons");
// 	}
// 	void m2(int a) {
// 		System.out.println(" method ");
// 		System.out.println(this.a);
// 		super.m2();
// 	}
// }
// class temp {
// 	int a = 20;
// 	temp() {
// 		super();
// 	}
// 	void m1() {
// 		demo d = new demo(this);
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		temp obj = new temp();
// 		obj.m1();
// 		demo d = new demo(obj);
// 		// d.m2();
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
// abstraction implementation code practise
// import java.io.*;
// import java.util.*;

// abstract class vehical {
// 	int n;
// 	abstract void start();
// }
// class car extends vehical {
// 	int n = 3;
// 	void start() {
// 		System.out.println("Start with the key");
// 	}
// }
// class temp {
// 	int n = 3;
// 	void start() {
// 		System.out.println("start with kick");
// 	}
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		car c = new car();
// 		c.start();
// 		temp t = new temp();
// 		t.start();
// 	}
// }
/*------------------------------------------------------------------------------------------------------------------*/
import java.util.Scanner;

class BinaryTree {
	public BinaryTree() {

	}
	private static class Node {
		int val;
		Node left;
		Node right;

		public Node(int node) {
			this.val = node;
		}
	}

	private Node root;

	//insert the elements
	public void populate(Scanner scanner) {
		System.out.println("Enter the root node: ");
		int val = scanner.nextInt();
		root = new Node(val);
		populate(scanner, root);
	}

	private void populate(Scanner scanner, Node node) {
		System.out.println("Do you want enter the no. left of" + node.val);
		boolean left = scanner.nextBoolean();
		if (left) {
			System.out.println("Enter the value of left node" + node.val);
			int val = scanner.nextInt();
			node.left = new Node(val);
			populate(scanner, node.left);
		}

		System.out.println("Do you want to enter right of " + node.val);
		boolean right = scanner.nextBoolean();
		if (right) {
			System.out.println("Enter the value of the right of " + node.val);
			int val = scanner.nextInt();
			node.right = new Node(val);
			populate(scanner, node.right);
		}
	}

	public void display() {
		display(this.root, "");
	}

	private void display(Node node, String indent) {
		if (node == null) {
			return;
		}
		System.out.println(indent + node.val);
		display(node.left, indent + "\t");
		display(node.right, indent + "\t");

	}

}