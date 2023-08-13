package display_RSkewedTree;

import bst_to_skewed.BinarySearchTree;

public class RSkewedTree_Display extends BinarySearchTree {

	static Node prevNode = null;
	Node node1 = null;

	public void Display(Node root, int key) {

		if (root == null)
			return;
		else {
			System.out.print(root.key + " ");
			Display(root.left, key);
			Display(root.right, key);
		}
	}
}
