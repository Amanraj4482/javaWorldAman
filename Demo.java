
//PRINTIING THE MAXIMUM NUMBER WITH THE TERNERIY OPERATOR------------------------
// class Demo {
// 	public static void main(String args[]) {
// 		int a = 4, b = 5, c = 6;
// 		int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c; //if a is greater than b and and a is greater than c then check with a otherwise c
// 		//checking the b with the c
// 		System.out.println(max);
// 	}
// }


//FOR CHECKING THE NUMBER IS EVEN OR ODD--------------------------
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) {
// 		int num = 43;
// 		if (num % 2 == 0) {
// 			System.out.println("Number is Even");
// 		} else {
// 			System.out.println("Number is Odd");
// 		}
// 	}
// }

//WRITING THE CODE WITH THE SWITCH CASE STATEMENT--------------------------
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println();
// 		int day_of_week = 234;
// 		switch (day_of_week) {
// 		case 1: System.out.println("Monday");
// 			break;
// 		case 2: System.out.println("Tuesday");
// 			break;
// 		case 3: System.out.println("Wednesday");
// 			break;
// 		case 4: System.out.println("thrusday");
// 			break;
// 		case 5: System.out.println("Friday");
// 			break;
// 		case 6: System.out.println("Saturday");
// 			break;
// 		case 7: System.out.println("Sunday");
// 			break;
// 		default: System.out.println("Invalid Day of the week");

// 		}
// 	}
// }

//WHILE CONTROL STATEMENT PRINTING THE DIGITS--------------------------
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println();
// 		int num = 10;
// 		int i = 0;
// 		while (i <= num) {
// 			System.out.print(" " + i);
// 			i++;
// 		}
// 	}
// }


// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println();
// 		int n = 50, i = 0, sum = 0;
// 		while (i <= n) {
// 			sum += i;
// 			i++;
// 		}
// 		System.out.println("The sum of 1 to 50 is:"sum);
// 	}
// }
//answer is 1275

//for each - loop sum of all elements in array---------------------
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) {
// 		int a[] = {1, 2, 3, 4, 5};
// 		int sum = 0;
// 		for (int e : a)
// 			sum += e;
// 		System.out.println("Sum of all elements in the array is:" + sum);
// 	}
// }

//LABELLED BREAK AND CONTINUE--------------
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) {
// 		out:
// 		for (int i = 1; i <= 15; i++) {
// 			System.out.println("Outer: " + i);
// 			for (int j = 1; j <= 5; j++) {
// 				if (j == 2) break out;//this breaks out both loops
// 				// if (j == 2) continue out;
// 				System.out.println("     Inner: " + j);
// 			}
// 		}
// 	}
// }

//RETURN STATEMENT
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	//CREATING A METHOD
// 	public static int sum(int a, int b, int c) {
// 		return a + b + c;
// 	}
// 	public static int check(int a, int b, int c) {
// 		return a > b ? a > c ? a : c : b > c ? b : c;
// 	}
// 	public static void main(String[] args) {
// 		int a = 7, b = 8, c = 10;
// 		System.out.println(sum(a, b, c));
// 		System.out.println(check(a, b, c));
// 	}
// }
//ARRAYS--------------------------------------------------
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) {
// 		int age[] = {1, 2, 3, 4, 5};//we cannot put the lenght of array in the bracket
// 		// int age[] = new int[5]; //to declare the size we must create the new
// 		//how much age to be stored all the empty array will be the zero
// 		// age[0] = 2;
// 		// age[1] = 4;
// 		// age[2] = 6;
// 		// age[3] = 8;
// 		// age[4] = 10;
// 		int sum = 0, count = 0;
// 		for (int i = 0; i < age.length; i++) {
// 			sum += age[i];
// 			if (sum > 0) {
// 				count++;
// 			}
// 		}
// 		System.out.println("Total ageSum: " + sum + "\nCount: " + count);
// 	}
// }
// Total ageSum: 30
// Count: 5



//3D - dimensions array--------------------------
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) throws IOException {
// 		System.out.println();
// 		int num[][] = new int [3][];//allocating memory in dynamic way by writing the new keyword
// 		for (int i = 0; i < num.length; i++) {
// 			num[i] = new int [i + 1];
// 		}
// 		for (int j = 0; j < num.length; j++) {//j=0,1,2
// 			for (int k = 0; k < num[j].length; k++) {//k=0,1,2,3,4
// 				num[j][k] = j * k;
// 			}
// 		}
// 		for (int j = 0; j < num.length; j++) {
// 			for (int k = 0; k < num[j].length; k++)
// 				System.out.print(num[j][k] + "\t");
// 			System.out.println("\n");
// 		}
// 	}
// }
// for the =>num[i]=new int [6]
// 0   0   0   0   0   0

// 0   1   2   3   4   5

// 0   2   4   6   8   10

//and for the [i+1]

// 0

// 0   1

// 0   2   4

//COPYING AND CLONNING OF ARRAY-----------------------
//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) throws IOException {
// 		char[] copyFrom = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'}; //declaring the destination array
// 		char []copyTo = new char[3]; //copying array using System.arraycopy() method
// 		System.arraycopy(copyFrom, 8, copyTo, 0, 3 );//8-> from the 8 the pos in the CopyFrom //0-> starting index pos  && 3-> ending index pos
// 		System.out.println(copyTo);

// 	}
// }
//ouput-> fun with (8,0,3)
//output->java is fun(0,0,10) with the new char [11]


//1-d deep copy and 2-d/3-d shallow copy  ->>cloning array

//TAKING THE INPUT AND OUTPUT FROM THE USER
// import java.util.*;
// import java.io.*;

// class Demo {
// 	public static void main(String [] args) {
// 		//Creaing the input box
// 		Scanner read = new Scanner(System.in);
// 		//first taking the size from the user
// 		int size = read.nextInt();
// 		//giving the size of the array
// 		int[] num = new int [size];

// 		//taking input from the for loop
// 		for (int i = 0; i < size; i++) {
// 			num[i] = read.nextInt();
// 		}

// 		//printing the output
// 		for (int i = 0; i < size; i++) {
// 			System.out.println(num[i]);
// 		}

// 	}
// }




//__________TAKING THE 2-D_________________- ARRAY INPUT FROM THE USER AND PRINTINNG AND FINDING THE KEY
// import java.io.*;
// import java.util.*;

// class Demo {
// 	public static void main(String [] args) {
// 		Scanner read = new Scanner(System.in);
// 		int row = read.nextInt();
// 		int col = read.nextInt();
// 		int[][] arr = new int[row][col];

// 		//input //by row
// 		for (int i = 0; i < row; i++) {
// 			//col
// 			for (int j = 0; j < col; j++) {
// 				arr[i][j] = read.nextInt();
// 			}
// 		}
// 		//printing the output
// 		for (int i = 0; i < row; i++) {
// 			for (int j = 0; j < col; j++) {
// 				System.out.print(arr[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }


//__________________________USE OF CHAR AT____________________
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) throws IOException {
// 		// concatation in java
// 		String a = "Tony";
// 		String b = "Stark";
// 		// String fullName = a + " " + b;
// 		// System.out.println(fullName);
// 		// System.out.println(fullName.length());//10

// 		// //charAT
// 		// for (int i = 0; i < fullName.length(); i++) {
// 		// 	System.out.println(fullName.charAt(i));
// 		// }
// // T
// // o
// // n
// // y

// // S
// // t
// // a
// // r
// // k
// 		if (a.compareTo(b) == 1)
// 			System.out.println("Equal");
// 		System.out.println("NotEqual");

// 	}
// }

//___________________________STING BUILDER______________________
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) throws IOException {
// 		StringBuilder read = new StringBuilder("Tonys");
// 		System.out.println(read);//Tonys
// 		// char at index 0
// 		System.out.println(read.charAt(0));//t
// 		//set char at index
// 		read.setCharAt(1, 'd');
// 		System.out.println(read); //Tdnys

// 		//Insert function
// 		read.insert(0, 'A');
// 		System.out.println(read);//ATdnys

// 		//delete function
// 		read.delete(2, 3);//it deletes the n
// 		System.out.println(read);//Atnys

// 		//appends function
// 		read.append("ABC");
// 		System.out.println(read);//AtnysABC

// 		//Reverse the string
// 		for (int i = 0; i < read.length() / 2; i++) {
// 			int front = i;
// 			int back = read.length() - 1 - i;
// 			char frontChar = read.charAt(front);
// 			char backChar = read.charAt(back);
// 			read.setCharAt(front, backChar);//replaces the front char with the backChar
// 			read.setCharAt(back, frontChar);//replaces the back char with the frontChar
// 		}
// 		System.out.println(read);//CBAsynTA
// 	}
// }


// //SET BIT
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) throws IOException {
// 		int n = 5; //0101
// 		int pos = 1;
// 		int bitMask = 1 << pos;
// 		int newNumber = bitMask | n;

// 		System.out.println(newNumber);//7
// 	}
// }

// // clear bit
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) throws IOException {
// 		int n = 5; //0101
// 		int pos = 2;
// 		int bitMask = 1 << pos;
// 		int notBitMask = ~(bitMask);
// 		int newNumber = notBitMask & n;

// 		System.out.println(newNumber);//1
// 	}
// }


// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) throws IOException {
// 		Scanner read = new Scanner(System.in);
// 		int oper = read.nextInt();
// 		//oper=1  : set oper=0  : clear
// 		int n = 5; //0101
// 		int pos = 1;
// 		int bitMask = 1 << pos;
// 		if (oper == 1) {
// 			//set
// 			int newNumber = bitMask | n;
// 			System.out.println(newNumber);
// 		}

// 		else {
// 			//clear
// 			int newBitMask = ~(bitMask);
// 			int newNumber = newBitMask & n;
// 			System.out.println(newNumber);
// 		}

// 	}
// }
//input->1  output-> 7


//_____________________________BUBBLE SORT______________________--
//heavy elements are pussed at the back of the array
//swap if i pos> i+1 pos

// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void printArray(int arr[]) {
// 		for (int i = 0; i < arr.length; i++) {//there should be any bracket in the length function
// 			System.out.print(arr[i] + " ");
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Scanner read = new Scanner (System.in);
// 		int n = read.nextInt();
// 		int arr[] = new int[n];

// 		for (int i = 0; i < n; i++) {
// 			arr[i] = read.nextInt();
// 		}

// 		for (int i = 0; i < n - 1; i++) {//it is just a counter
// 			for (int j = 0; j < n - 1 - i; j++) {
// 				if (arr[j] > arr[j + 1]) {//sorted elements ko hatakar baakin ka jitna v bachega hm uspe loop chala rhe h
// 					//we need to swap
// 					int temp = arr[j];
// 					arr[j] = arr[j + 1];
// 					arr[j + 1] = temp;
// 				}
// 			}
// 		}
// 		printArray(arr);
// 	}
// }

//______________________________selection sort_________________

//-> taking the oth index and comparing with all
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void printArray(int arr[]) {
// 		for (int i = 0; i < arr.length; i++) {//there should not be any bracket in the length function
// 			System.out.print(arr[i] + " ");
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Scanner read = new Scanner (System.in);
// 		int n = read.nextInt();
// 		int arr[] = new int[n];
// 		for (int i = 0; i < n; i++) {
// 			arr[i] = read.nextInt();
// 		}
// 		for (int i = 0; i < n - 1; i++) {
// 			int fixedIndex = i;
// 			for (int j = i + 1; j < n; i++) {
// 				if (arr[fixedIndex] > arr[j]) {
// 					fixedIndex = j;
// 				}
// 			}
// 			int temp = arr[fixedIndex];
// 			arr[fixedIndex] = arr[i];
// 			arr[i] = temp;

// 		}
// 		printArray(arr);

// 	}
// }



//___________________USING SETTER GETTER METHOD ____________
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	String name;
// 	int roll;


// 	void setName(String nm) {
// 		name = nm;
// 	}
// 	String getName() {
// 		return name;
// 	}
// 	void setRoll(int rl) {
// 		roll = rl;
// 	}
// 	int getRoll() {
// 		return roll;
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Demo stu = new Demo();//new object has been created in the heap memory
// 		Scanner read = new Scanner(System.in);//taking input from the user i have created the object class
// 		int d = read.nextInt();
// 		String r = read.nextLine();
// 		stu.setRoll(d);
// 		stu.setName(r);

// 		System.out.println("Name-> " + stu.getRoll());
// 		System.out.println("Roll-> " + stu.getName());

// 	}
// }

//___________________ARRAY LIST_________________-
//a resizable array. Elements can be added removed after compliation phase
//store reference data types
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) throws IOException {
// 		ArrayList<String> food = new ArrayList<String> ();
// 		food.add("Pizza");
// 		food.add("Hamburger");
// 		food.add("hotdog");

// 		// food.set(0, "Sushi");//change the value at certain index
// 		// food.remove(2);//remove specified with the index(hotdog)
// 		// food.clear();//array list is being cleared

// 		for (int i = 0; i < food.size(); i++) {
// 			System.out.println(food.get(i));
// 		}
// // Pizza
// // Hamburger
// // hotdog

// 	}
// }


//_________________________2D array of string dynamic________________________
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) throws IOException {
// 		ArrayList <String> bakeryList = new ArrayList();
// 		bakeryList.add("Pasta");
// 		bakeryList.add("Garlik");
// 		System.out.println(bakeryList.get(0));
// 	}
// }


//______________String_methods____________
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	public static void main(String[] args) throws IOException {
// 		String name = "Bros";
// 		hello(name);
// 	}
// 	//method
// 	// static void hello(String x) {//non static method
// 	// 	System.out.println(x + "  Hello");
// 	// }
// }

//_____________________________creating a car's object class file________________________
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	String make = "Chevrolet";
// 	String model = "covertte";
// 	int year = 2020;
// 	String color = "blue";
// 	double price = 5000.0;
// 	//creating the methods
// 	void drive () {
// 		System.out.println("You drive the car");
// 	}
// 	void brake() {
// 		System.out.println("You step on the Car");
// 	}
// 	public static void main(String[] args) throws IOException {

// 		Demo myCar1 = new Demo();//creating the unique name for the instance of the class
// 		Demo myCar2 = new Demo();
// 		//displaying some attributes
// 		// System.out.println(myCar1.model);//name of the object . it's attribute
// 		// System.out.println(myCar1.price);//name of the object . it's attribute
// 		// myCar1.drive();
// 		// myCar1.brake();
// 		System.out.println(myCar2.make);
// 		System.out.println(myCar2.model);
// 	}
// }

//______________________MAKING A CONSTRUCTOR_________________
// import java.io.*;
// import java.util.*;

// public class Demo {

// 	int num;
// 	String name;
// 	float digit;
// 	//constructor has been created
// 	Demo(int num, String name, float digit) {
// 		this.num = num;
// 		this.name = name;
// 		this.digit = digit;
// 	}
// 	//creating method for the Demo class
// 	void fuck() {
// 		System.out.println("I like to fuck");
// 	}
// 	void noise() {
// 		System.out.println("I like to do noise");
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Demo demo = new Demo(23, "Aman", 234);//passing an argument to a constructor
// 		Demo demo2 = new Demo(40, "Raj", 432);//passing an argument to a constructor

// 		//object name and it's attiribute
// 		System.out.println(demo.num);
// 		System.out.println(demo.name);
// 		System.out.println(demo.digit);

// 		System.out.println();
// 		System.out.println(demo2.num);
// 		System.out.println(demo2.name);
// 		System.out.println(demo2.digit);

// 		demo2.fuck();
// 		demo.noise();

// 	}
// }

//______________RANDON NUMBER PRINT______________

// import java.io.*;
// import java.util.*;
// import java.util.Random;

// public class Demo {
// 	Demo random;
// 	// int nu
// 	Demo() {//instance of the Demo class
// 		Demo random = new Demo();
// 		int num = 0;
// 		roll();
// 	}
// 	void roll () {
// 		num = random.nextInt(5) + 1;
// 		System.out.println(num);
// 	}
// 	// public static void main(String[] args) throws IOException {
// 	// }
// }



//________________OVERLOADED CONSTRUCTORS_____________=multiple constructorss within a class with the same name,
// but have different parameters name + parameters = signature

// import java.io.*;
// import java.util.*;

// public class Demo {
// 	static class Pizza {
// 		String bread;
// 		String sauce;
// 		String cheese;
// 		String topping;
// 		Pizza(String bread, String sauce, String cheese, String topping) {
// 			this.bread = bread;
// 			this.sauce = sauce;
// 			this.cheese = cheese;
// 			this.topping = topping;
// 		}
// 		Pizza(String bread, String sauce, String cheese) {
// 			this.bread = bread;
// 			this.sauce = sauce;
// 			this.cheese = cheese;
// 		}
// 		Pizza(String bread, String sauce) {
// 			this.bread = bread;
// 			this.sauce = sauce;
// 		}
// 	}
// 	static class Human {
// 		int age;
// 		String name;
// 		Human(int age, String name) {
// 			this.age = age;
// 			this.name = name;
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Pizza pizza = new Pizza("ticc crust", "tomato", "mozzerella", "pepperoni");
// 		//	Pizza pizza = new Pizza("ticc crust", "tomato", "mozzerella");
// 		// Pizza pizza = new Pizza("ticc crust", "tomato");

// 		System.out.println("Here are the ingrediants of your pizza: ");
// 		System.out.println(pizza.bread + " " + pizza.sauce);
// 		// System.out.println(pizza.sauce);
// 		System.out.println(pizza.cheese);
// 		System.out.println(pizza.topping);
// 		System.out.println();
// 		System.out.println();
// 		Human human = new Human(23, "Aman");
// 		System.out.println(human.age);
// 		System.out.println(human.name);

// 	}
// }

//_______________________TO STRING METHOD________________
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	static class Car {
// 		String make = "Ford";
// 		String model = "Mustang";
// 		String color = "red";
// 		int year = 2023;

// 		public String toString() {
// 			return make + "\n" + model + "\n" + color + "\n" + year;
// 		}

// 	}
// 	public static void main(String[] args) throws IOException {
// 		//toString()=special method that all objects inherit,
// 		//that returns a string that "textually represents" an object.
// 		//can be used both implicitly and explicitly
// 		Car car = new Car();
// 		// System.out.println(car.make + "\n" + car.model + "\n" + car.color + "\n" + car.year);


// 		//explicit use of toString method
// 		// System.out.println(car.toString());//returns the address


// 		//implicit use of toString method
// 		// System.out.println(car);
// 		//same result with no difference
// 	}
// }
// output->Ford Mustang red 2023



//	-------------------ARRAY OF OBJECT----------------
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	static class Food {
// 		String name;
// 		Food(String name) {
// 			this.name = name;
// 		}

// 	}
// 	public static void main(String[] args) throws IOException {
// 		//array of objects
// 		// Food[] refrigerator = new Food[3];
// 		Food food1 = new Food("pizza");
// 		Food food2 = new Food("hamburger");
// 		Food food3 = new Food("hotdog");

// 		Food[] refrigerator = {food1, food2, food3};

// 		// refrigerator[0] = food1;
// 		// refrigerator[1] = food2;
// 		// refrigerator[2] = food3;

// 		// System.out.println(refrigerator[0]);//returns the address
// 		System.out.println(refrigerator[0].name);
// 		System.out.println(refrigerator[1].name);
// 		System.out.println(refrigerator[2].name);

// 	}
// }
//pizza hamburger hotdog





//___________________OBJECT PASSING AS ARGUMENT________________

// import java.io.*;
// import java.util.*;

// public class Demo {
// 	static class Garage {
// 		void park(Car car) {//method
// 			//Car is a datatype
// 			System.out.println("The " + car.name + " is parked in the Garage");
// 		}
// 	}
// 	static class Car {
// 		String name;
// 		Car(String name) {//method
// 			this.name = name;
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Garage garage = new Garage();

// 		Car car1 = new Car("BMW");

// 		Car car2 = new Car("Bugati");
// 		garage.park(car1);//sending car as a object
// 		garage.park(car2);//sending car as a object
// 	}
// }
//output->The BMW is parked in the Garage




//____________________-STATIC KEYWORD MODIFIER WORKS IN JAVA____________
//static = modifier . A single copy of a varible / method is created and shared.
//The class "owns" the static member
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	static class Friend {
// 		String name;
// 		static int numberOfFriends;
// 		Friend(String name) {
// 			this.name = name;
// 			numberOfFriends++;
// 		}
// 		static void displayFriends() {
// 			System.out.println("You have " + numberOfFriends + " friends");
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Friend friend1 = new Friend("Sponegbob");
// 		Friend friend2 = new Friend("Patrick");
// 		Friend friend3 = new Friend("Squidward");
// 		Friend friend4 = new Friend("Squidward");
// 		// System.out.println(Friend.numberOfFriends);//this gives the 3

// 		//accessing the members of the Friends class by name of the class itself
// 		Friend.displayFriends();//You have 4 Friends
// 	}
// }




//______________________INHERITANCE IN JAVA___________________
//the process where one class acquires
//the attributes and methods of another.

// import java.io.*;
// import java.util.*;

// public class Demo {
// 	static class Vehicle {
// 		double speed;

// 		void go() {
// 			System.out.println("This vehicle is moving");
// 		}
// 		void stop() {
// 			System.out.println("This vehicle is stopped");
// 		}
// 	}
// 	static class Car extends Vehicle {
// 		int wheels = 4;
// 		int doors = 4;
// 	}
// 	static class Bycycle extends Vehicle {
// 		int wheels = 2;
// 		int paddles = 2;
// 	}
// 	public static void main(String[] args) throws IOException {
// 		//creating a car object and bycycle object
// 		Car car = new Car();
// 		car.go();//This vehicle is moving
// 		System.out.println();

// 		//creating a bycycle object
// 		Bycycle bike = new Bycycle();
// 		bike.stop();//This vehicle is stopped


// 		// System.out.println(car.speed);
// 		// System.out.println(bike.speed);

// 		System.out.println(car.doors);
// 		System.out.println(bike.paddles);

// 		System.out.println(car.wheels + " " + bike.wheels);

// 	}
// }





//___________METHOD OVERRIDIING________________->Declaring method in sub class.
//which is already present in parent class
//done so that a child calss can give its own implementation

// import java.io.*;
// import java.util.*;

// public class Demo {
// 	static class Animal {
// 		void speak() {
// 			System.out.println("The animal speaks");
// 		}
// 	}
// 	static class Dog extends Animal {
// 		@Override//just for the user to know that this is overriding method
// 		void speak() {//this is method overriding
// 			System.out.println("The dog goes park");
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Dog dog = new Dog();
// 		Animal animal = new Animal();
// 		// animal.speak();
// 		dog.speak();
// 		//1 The dog goes bark//when overriding is on
// 		//2 The animal speaks//when overriding is off
// 	}
// }



//____________________SUPER KEYWORD __________________-> refers ot the superclass ( parents) of an
//object very similar to the "this" keyword

// import java.io.*;
// import java.util.*;

// public class Demo {
// 	static class Person {
// 		String name;
// 		int age;

// 		Person(String name, int age) { //This is the constructor for this class
// 			this.name = name;
// 			this.age = age;

// 		}
// 		public String toString() {
// 			return this.name + "\n" + this.age + "\n";
// 		}
// 	}
// 	static class Hero extends Person {
// 		String power;

// 		Hero(String name, int age, String power) { //constructor for this Hero
// 			//if we want to get the attention of super class we have to use
// 			super(name, age); //it referes to the super class (Person)
// 			this.power = power;

// 		}
// 		public String toString() {
// 			return super.toString() + this.power;
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		//creating  a obj Hero
// 		Hero hero1 = new Hero("Batman", 34, "$$$"); //sinding arguments for the constructor for the Hero
// 		Hero hero2 = new Hero("Superman", 100, "&&&"); //sinding arguments for the constructor for the Hero

// 		System.out.println(hero2.toString());
// System.out.println(hero1.name);
// System.out.println(hero1.age);
// System.out.println(hero1.power);

// System.out.println();

// System.out.println(hero2.name);
// System.out.println(hero2.age);
// System.out.println(hero2.power);
// 	}
// }



//_______________ABSTRACTION IN JAVA___________
//abstract classes cannot be instanitiated, but they can have a subclass
//abstract methods are declared without a implementation
// import java.io.*;
// import java.util.*;

// public class Demo {
// 	static abstract class Vehicle {//we cannot longer create a instance of this class
// 		//we cannot declare the Vehicle type object
// 		//we need child class of vehicle class

// 		abstract void go() ;//abstract method cannot have a body

// 	}
// 	static class Car extends Vehicle {
// 		@Override
// 		void go() {
// 			System.out.println("The driver is driving the car");
// 		}

// 	}
// 	public static void main(String[] args) throws IOException {
// 		//cannot inititate the type vehicle
// 		// Vehicle Vehicle = new Vehicle(); //instance of the class
// 		Car car = new Car();
// 		car.go();

// 	}
// }


//_____________________ACCESS MODIFIERS___________________
