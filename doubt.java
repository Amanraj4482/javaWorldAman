// HOW TO REVERSE THE STRING IN JAVA

// import java.io.*;
// import java.util.*;

// class reverseString {
// 	public static void main(String[] args) throws IOException {
// 		Scanner read = new Scanner(System.in);
// 		/*int size = read.nextInt();
// 		read.nextLine();   //consume the new line character*/

// 		String name = read.nextLine();
// 		int size = name.length();
// 		String ans = "";
// 		for (int i = size - 1; i >= 0 ; i--) {
// 			ans += name.charAt(i);
// 		}
// 		System.out.println("Reverse of " + name + " is " + ans);
// 	}
// }

/*----------------------------------------------------------------*/

//QUICK SORT ALGORITHM
/*import java.io.*;
import java.util.*;

class Sort {
	static void swaping(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	int partition(int[] arr , int low , int high) {
		int pivot = arr[low];
		int i = low + 1;
		for (int j = low + 1 ; j <= high ; j++) {
			if (pivot >= arr[j]) {
				swaping(arr, i, j);
				i++;
			}
		}
		swaping(arr, i - 1, low);
		return i - 1;
	}
	void Quick_sort(int[] arr, int low , int high) {
		if (low < high) {
			int pivot_index = partition(arr, low , high);
			Quick_sort(arr, low , pivot_index - 1);
			Quick_sort(arr, pivot_index + 1, high);
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++ ) {
			arr[i] = read.nextInt();
		}
		read.nextLine();
		int low = 0 , high = size - 1;
		Sort s = new Sort();
		s.Quick_sort(arr, low , high);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}*/

/*----------------------------------------------------------------------------------------*/
// MERGE SORT IN THE JAVA
/*
import java.io.*;
import java.util.*;

class Sort {
	void merge_arr(int [] arr, int low , int high , int mid) {
		int left = low , right = mid + 1, k = 0;
		int[] temp = new int[high - low + 1];
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp[k++] = arr[left++];
			} else {
				temp[k++] = arr[right++];
			}
		}
		while (left <= mid) {
			temp[k++] = arr[left++];
		} while (right <= high) {
			temp[k++] = arr[right++];
		}
		for (int i = low ; i <= high; i++) {
			arr[i] = temp[i - low];
		}
	}
	void merge_sort(int[] arr , int low , int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			merge_sort(arr, low , mid);
			merge_sort(arr, mid + 1 , high);
			merge_arr(arr, low , high, mid);
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] arr = new int[size];
		for (int i = 0 ; i < size ; i++ ) {
			arr[i] = read.nextInt();
		}
		int low = 0, high = size - 1;
		Sort s  = new Sort();
		s.merge_sort(arr, low , high);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}*/

/*-------------------------------------------------------------------------*/
// HEAP SORT IN THE JAVA
// this is the part of the tree

// Binary tree does not allow duplicate values

// Heap is Binary tree with the  property
// 1. it should be the complete binary tree : that each level should be filled , except possibly the bottomlevel and the levels should be filled from left to right
// 2. head-order-property : The dataq item soted in each node is greater then & equals or smller then & equals to the data itesms stored in its children


// represenation of heap into arrays :
// child index left = 2*i -1   and child index right = 2*i+2
// parent node = (i-1)/2;


// read.hasNextInt()`` stops when non-integer value is added in the input


// import java.io.*;
// import java.util.*;

// class Testing {
// 	void heap_store(int [] arr, int n , int i) {
// 		// parent node index position ------>
// 		int parent_index = i ;
// 		// left child index position  ----->>
// 		int child_left_index = 2 * i + 1;
// 		// right child index position ----->>
// 		int child_right_index = 2 * i + 2;

// 		if (child_left_index < n && arr[parent_index] < arr[child_left_index]) {
// 			parent_index = child_left_index;
// 		}
// 		if (child_right_index < n && arr[parent_index] < arr[child_right_index]) {
// 			parent_index = child_right_index;
// 		}
// 		if (parent_index != i) {
// 			int temp = arr[i];
// 			arr[i] = arr[parent_index];
// 			arr[parent_index] = temp;

// 			heap_store(arr, n, parent_index);
// 		}
// 	}
// 	void sorting(int []arr, int n) {
// 		// Build max heap
// 		for (int i = n / 2 - 1 ; i >= 0 ; i-- ) {
// 			// where i is the parent node index position----->
// 			// this will store the array in this heap_store
// 			heap_store(arr, n , i);
// 		}
// 		// swap the elements and heap_store again
// 		// Extract elements from the heap one by one
// 		for (int i = n - 1 ; i >= 0; i-- ) {
// 			int temp = arr[0];
// 			arr[0] = arr[i];
// 			arr[i] = temp;
// 			heap_store(arr, i , 0);
// 		}

// 	}
// 	void array_print(int []arr ) {
// 		for (int i = 0;	i < arr.length ; i++ ) {
// 			System.out.print(arr[i] + " ");
// 		}
// 	}
// 	public static void main(String[] args) throws IOException {
// 		Scanner read = new Scanner(System.in);
// 		int n = read.nextInt();
// 		int []arr = new int[n];
// 		for (int i = 0; i < n; i++) {
// 			arr[i] = read.nextInt();
// 		}
// 		Testing t = new Testing();
// 		t.sorting(arr, n);
// 		t.array_print(arr);
// 	}
// }
// 7
// 22 13 17 11 10 14 12
// output :  10 11 12 13 14 17 22
/*-----------------------------------------------------------*/
import java.io.*;
import java.util.*;

class Aman {
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner (System.in);
		String a = read.nextLine();
		System.out.println(a);
	}
}