package conversion_process_RSkewedTree;

import bst_to_skewed.BinarySearchTree;

public class Tree_Modification extends BinarySearchTree {

	static Node prevNode = null;
	Node node1 = null;

	public void Traversal(Node root, int key) {

		if (root == null)
			return;
		else {
			Traversal(root.left, key);
			queue1.add(root.key);
			Traversal(root.right, key);
		}
	}
}
