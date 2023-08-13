package complete_BSTree_creation;

import java.util.Deque;
import java.util.LinkedList;

import bst_to_skewed.BinarySearchTree;

public class Node_Insertion extends BinarySearchTree {

	Deque<Node> queue = new LinkedList<Node>();

	static Node node1;

	public Node insert1(Node node, int key) {

		Node newNode = newNode(key);

		if (root == null) {
			root = newNode;

			node1 = root;
			return root;

		} else {
			queue.add(newNode);
			while (!(queue.isEmpty())) {

				if (node1.key > newNode.key) {

					if (node1.left == null) {
						node1.left = newNode;
						queue.pop();
					} else {
						node1 = node1.left;
					}
				}
				if (node1.key < newNode.key) {

					if (node1.right == null) {
						node1.right = newNode;
						queue.pop();
					} else {
						node1 = node1.right;
					}
				}
			}
		}
		node1 = root;
		return node1;
	}

}