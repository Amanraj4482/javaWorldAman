import java.io.*;
import java.util.*;

class Human {
	// private int age = 11;
	private int age = 11;
	// this varible age means it only accessble in the same class
	// private String name = "Navin";
	private String name = "Navin";

	public int getAge() {
		return age;
	}
	public void setAge(int age, Human obj) {
		obj.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class revOopsDeepak {
	public static void main(String[] args) throws IOException {
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		Human obj = new Human();
		// obj.age = 11;
		// obj.name = "Aman";

		// System.out.println(obj.name);

		obj.setAge(12, obj);
		obj.setName("Navin");
		System.out.println(obj.getAge() + " " + obj.getName());
	}
}
/*------------------------------------------------------------------------------------------------------------------*/
// import java.io.*;
// import java.util.*;

// class revOopsDeepak {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));

// 	}
// }