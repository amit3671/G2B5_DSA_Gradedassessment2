package bst_to_skewed;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import complete_BSTree_creation.Node_Insertion;
import conversion_process_RSkewedTree.Tree_Modification;
import display_RSkewedTree.RSkewedTree_Display;

public class BinarySearchTree {

	protected static Deque<Integer> queue1 = new LinkedList<>();

	protected static Node root = null;

	public static class Node {

		public int key;
		public Node left;
		public Node right;

	}

	protected static Node newNode(int data) {
		Node temp = new Node();

		temp.key = data;
		temp.left = null;
		temp.right = null;

		return temp;
	}

	static int value;
	static int values;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node_Insertion Head = new Node_Insertion();
		Tree_Modification modify = new Tree_Modification();
		RSkewedTree_Display display = new RSkewedTree_Display();
		
		String status = "a";
		while (!status.equals("s")) {
			System.out.println("Enter value to insert");
			value = sc.nextInt();
			root = Head.insert1(root, value);

			System.out.println("Enter s to stop or any char to continue insertion");
			status = sc.next();
		}
		
		modify.Traversal(root, values);

		root = null;
		while (!(queue1.isEmpty())) {
			values = queue1.poll();
			
			root = Head.insert1(root, values);

		}
        System.out.println("\nOutput\n"); 
		display.Display(root, values);
		
	}

}
