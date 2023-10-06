// ARRAY REPRESENTATION IN THE JAVA OF THE BINARY TREE------------------>

// import java.io.*;
// import java.util.*;

// class Node {
// 	int data;
// 	Node left, right;

// 	Node (int data) {
// 		this.data = data;
// 		left = right = null;
// 	}
// }
// class bt {
// 	static final int maxi = 100;
// 	static void printArray(int[] arr, int n ) {
// 		for (int i = 0 ; i < n ; i++ ) {
// 			if (arr[i] != -1) System.out.print(arr[i] + " ");
// 			else System.out.print("- ");
// 		}
// 		System.out.println();
// 	}
// 	public static void main(String[] args) throws IOException {
// 		int[] bt = new int[maxi];
// 		int size = 0; // current size of the array

// 		Arrays.fill(bt, -1); // initialize the array with -1 to represent empty nodes
// 		Node root = new Node(1);
// 		root.left = new Node(2);
// 		root.right = new Node(3);
// 		root.left.left = new Node(4);
// 		root.left.right = new Node(5);
// 		root.right.left = new Node(6);
// 		root.right.right = new Node(7);

// 		bt[size++] = root.data;
// 		bt[size++] = root.left.data;
// 		bt[size++] = root.right.data;
// 		bt[size++] = root.left.left.data;
// 		bt[size++] = root.left.right.data;
// 		bt[size++] = root.right.left.data;
// 		bt[size++] = root.right.right.data;

// 		printArray(bt, size);
// 	}
// }
// 1 2 3 4 5 6 7

/*------------------------------------------------------------------------------------------------------------------*/
// EVERY TRAVERSAL OF THE BINARY TREE -------->

// import java.io.*;
// import java.util.*;
// class TreeNode {
// 	int data;
// 	TreeNode left, right;

// 	TreeNode(int data) {
// 		this.data = data;
// 		this.right = this.left = null;
// 	}
// }
// class binary_trees_vignesh {
// 	public static List<Integer> Preorder_iterative(TreeNode root) {
// 		Stack<TreeNode> st = new Stack<TreeNode>();
// 		TreeNode current = root;
// 		List<Integer> result = new ArrayList<Integer>();
// 		while (true) {
// 			while (current != null) {
// 				result.add(current.data);
// 				st.push(current);
// 				current = current.left;
// 			}
// 			if (st.isEmpty()) break;
// 			current = st.pop();
// 			current = current.right;
// 		}
// 		return result;
// 	}
// 	public static List<Integer> Inorder_iterative(TreeNode root) {
// 		Stack<TreeNode> st = new Stack<TreeNode>();
// 		TreeNode current = root;
// 		List<Integer> result = new ArrayList<Integer>();
// 		while (true) {
// 			while (current != null) {
// 				st.push(current);
// 				current = current.left;
// 			}
// 			if (st.isEmpty()) break;
// 			current = st.pop();
// 			result.add(current.data);
// 			current = current.right;
// 		}
// 		return result;
// 	}
// 	public static List<Integer> PostOrder_iterative(TreeNode root) {
// 		Stack<TreeNode> st = new Stack<TreeNode>();
// 		TreeNode current = root , prev = null;
// 		List<Integer> result = new ArrayList<Integer>();
// 		while (true) {
// 			while (current != null) {
// 				st.push(current);
// 				current = current.left;
// 			}
// 			if (st.isEmpty())break;
// 			current = st.peek();
// 			if (current.right == null || current.right == prev) {
// 				result.add(current.data);
// 				st.pop();
// 				prev = current;
// 				current = null;
// 			} else current = current.right;
// 		}
// 		return result;
// 	}
// 	public static void inorder_recursion(TreeNode root) {
// 		if (root == null )return;
// 		inorder_recursion(root.left);
// 		System.out.print(root.data + " ");
// 		inorder_recursion(root.right);
// 	}
// 	public static void preorder_recursion(TreeNode root) {
// 		if (root == null )return;
// 		System.out.print(root.data + " ");
// 		preorder_recursion(root.left);
// 		preorder_recursion(root.right);
// 	}
// 	public static void postorder_recursion(TreeNode root) {
// 		if (root == null )return;
// 		postorder_recursion(root.left);
// 		postorder_recursion(root.right);
// 		System.out.print(root.data + " ");
// 	}
// 	public static void level_order(TreeNode root) {
// 		if (root == null) return;
// 		Queue<TreeNode> queue = new LinkedList<>();
// 		queue.offer(root);
// 		while (!queue.isEmpty()) {
// 			int levelSize = queue.size();
// 			for (int i = 0; i < levelSize; i++) {
// 				TreeNode node = queue.poll(); // remove node from the front of the queue
// 				System.out.print(node.data + " ");
// 				if (node.left != null) queue.offer(node.left);
// 				if (node.right != null)queue.offer(node.right);
// 			}
// 		}
// 	}
// 	public static void main(String[] args) throws IOException  {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		TreeNode root = new TreeNode(1);
// 		root.left = new TreeNode(2);
// 		root.right = new TreeNode(3);
// 		root.left.left = new TreeNode(4);
// 		root.left.right = new TreeNode(5);
// 		root.right.left = new TreeNode(6);
// 		root.right.right = new TreeNode(7);


// 		System.out.print("Preorder : ");
// 		preorder_recursion(root); System.out.println();
// 		System.out.print("Inorder : ");
// 		inorder_recursion(root); System.out.println();
// 		System.out.print("Postorder : ");
// 		postorder_recursion(root); System.out.println();
// 		System.out.print("Levelorder ");
// 		level_order(root); System.out.println();
// 		System.out.println();
// 		/*----------------------------------------*/
// 		List<Integer> result_Preorder = Preorder_iterative(root);
// 		System.out.print("PreOrder_iterative : ");
// 		System.out.println(result_Preorder);


// 		List<Integer> result_Inorder = Inorder_iterative(root);
// 		System.out.print("Inorder_iterative : ");
// 		System.out.println(result_Inorder);

// 		List<Integer> result_Postorder = PostOrder_iterative(root);
// 		System.out.print("PostOrder_iterative : ");
// 		System.out.println(result_Postorder);
// 	}
// }
/*Preorder : 1 2 4 5 3 6 7
Inorder : 4 2 5 1 6 3 7
Postorder : 4 5 2 6 7 3 1
Levelorder 1 2 3 4 5 6 7

PreOrder_iterative : [1, 2, 4, 5, 3, 6, 7]
Inorder_iterative : [4, 2, 5, 1, 6, 3, 7]
PostOrder_iterative : [4, 5, 2, 6, 7, 3, 1]*/
/*------------------------------------------------------------------------------------------------------------------*/
// binary tree search and insertion
// import java.util.*;
// import java.io.*;
// class Node {
// 	int data;
// 	Node left, right;

// 	public Node(int data) {
// 		this.data = data;
// 		left = right = null;
// 	}
// }
// class BinarySearchTree {
// 	Node root;
// 	public BinarySearchTree() {
// 		// this constructor initilizes the empty binaryst with root= null
// 		root = null;
// 	}
// 	public void insert_node(int data) {
// 		root = new_node_insertion(root, data);
// 	}
// 	public Node new_node_insertion(Node root, int data) {
// 		if (root == null) {
// 			// if the root is null means we have reached the pos
// 			// where  we can insert the new node so it creats a new node with the data and return it
// 			root = new Node(data);
// 			return root;
// 		}
// 		if (data < root.data) {
// 			root.left = new_node_insertion(root.left, data);
// 		} else if (data > root.data) {
// 			root.right = new_node_insertion(root.right, data);
// 		}
// 		return root;   // after insertion the root is returned
// 	}
// 	/*---------------------------------*/
// 	public boolean search (int data) {
// 		return search_rec(root, data);
// 	}
// 	public boolean search_rec(Node root, int data) {
// 		if (root == null)return false;
// 		if (data == root.data) return true;
// 		else if (data < root.data) return search_rec(root.left, data);
// 		else return search_rec(root.right, data);
// 	}
// 	public void delete(int data) {
// 		root = deleteRec(root, data);
// 	}

// 	private Node deleteRec(Node root, int data) {
// 		if (root == null) {
// 			return root; // If the tree is empty or the node is not found, return the original root.
// 		}
// 		// Recursive calls for left and right subtrees
// 		if (data < root.data) {
// 			root.left = deleteRec(root.left, data);
// 		} else if (data > root.data) {
// 			root.right = deleteRec(root.right, data);
// 		} else {
// 			// Node with one child or no child
// 			// returning the other childs if no found
// 			if (root.left == null) {
// 				return root.right;
// 			} else if (root.right == null) {
// 				return root.left;
// 			}

// 			// smallest node in the right subtree
// 			// Node with two children: Get the inorder successor (smallest in the right subtree)
// 			root.data = minValue(root.right);

// 			// Delete the inorder successor
// 			root.right = deleteRec(root.right, root.data);
// 		}

// 		return root;
// 	}

// 	private int minValue(Node root) {
// 		int minValue = root.data;
// 		while (root.left != null) {
// 			minValue = root.left.data;
// 			root = root.left;
// 		}
// 		return minValue;
// 	}
// }
// class binary_trees_vignesh {
// 	public static void main(String[] args) throws IOException {
// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
// 		BinarySearchTree bst = new BinarySearchTree();
// 		bst.insert_node(50);
// 		bst.insert_node(30);
// 		bst.insert_node(70);
// 		bst.insert_node(20);
// 		bst.insert_node(40);
// 		bst.insert_node(60);
// 		bst.insert_node(80);
// 		System.out.println("Search for the 40 : " + bst.search(40));
// 	}
// }

// output->Search for the 40 : true
/*------------------------------------------------------------------------------------------------------------------*/
// AVL TREE --- left right rotations, and insertion and deletion

