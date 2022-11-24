package myTest;

/**
 * Binary Search Tree.<br/>
 * 樹根高度 1<br/>
 * countH, countNode, countLeaf, swap
 *
 * @version 2021/04/04_21:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R60_Bst" >R60_Bst.java</a>
 *
 */
class Node {

	int data;
	Node left, right;

	public Node(int data) {

		this.data = data;
		left = right = null;

	}
}

public class R60_Bst {

	Node root;

	R60_Bst() {

		root = null;
	}

	Node addNode(Node root, int key) {

		if (root == null)
			return new Node(key);

		if (key < root.data)
			root.left = addNode(root.left, key);

		if (key > root.data)
			root.right = addNode(root.right, key);

		// 不會出現 key == root.data
		return root;

	}

	void add(int key) {

		root = addNode(root, key);
	}

	Node searchNode(Node root, int key) {

		if (root == null)
			return null;

		if (key < root.data)
			return searchNode(root.left, key);

		if (key > root.data)
			return searchNode(root.right, key);

		// else (key == root.data)
		return root;

	}

	boolean search(int key) {

		return (searchNode(root, key) != null);
	}

	Node findMin(Node root) {

		if (root == null)
			return null;

		if (root.left == null)
			return root;

		return findMin(root.left);

	}

	Node findNDel(Node root, int key) {

		if (root == null)
			return null;

		if (key < root.data) {

			root.left = findNDel(root.left, key);

			return root;

		}

		if (key > root.data) {

			root.right = findNDel(root.right, key);

			return root;

		}

		if (key == root.data) {

			if (root.left == null && root.right == null) // 可省略這句
				return null;

			if (root.left == null)
				return root.right;

			if (root.right == null)
				return root.left;

			// else node has two children:
			// get the in-order successor data (min in the right subtree)
			root.data = findMin(root.right).data;

			// get the in-order successor
			root.right = findNDel(root.right, root.data);

			return root; // 記得寫 return

		}

		return root; // 記得寫 return

	}

	void del(int key) {

		root = findNDel(root, key);
	}
}
