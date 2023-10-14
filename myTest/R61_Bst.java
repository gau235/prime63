package myTest;

import static java.lang.System.out;
import static lgpl3.o.B.T;

import lgpl3.o.O;

/**
 * Binary Search Tree.<br/>
 * 樹根的高度為 1<br/>
 *
 * @version 2021/04/07_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R61_Bst" >R61_Bst.java</a>
 *
 */
public class R61_Bst extends R60_Bst {

	int countH(Node root) {

		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		return 1 + Math.max(countH(root.left), countH(root.right));

	}

	int countAllNode(Node root) {

		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		return (1 + countAllNode(root.left) + countAllNode(root.right));

	}

	int countAllLeaf(Node root) {

		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		return countAllLeaf(root.left) + countAllLeaf(root.right);

	}

	void swapAllNode(Node root) {

		if (root == null)
			return;

		Node tmp = root.left;
		root.left = root.right;
		root.right = tmp;

		swapAllNode(root.left);
		swapAllNode(root.right);

	}

	static boolean ifAllNodeEq(Node root1, Node root2) {

		if (root1 == null && root2 == null)
			return T;

		if (root1 == null && root2 != null)
			return !T;

		if (root1 != null && root2 == null)
			return !T;

		return ((root1.data == root2.data) && ifAllNodeEq(root1.left, root2.left) && ifAllNodeEq(root1.right, root2.right));

	}

	void printInOrder(Node root, int lv) {

		if (root != null) {

			printInOrder(root.left, lv + 1);
			out.println(root.data + " lv=" + lv);
			printInOrder(root.right, lv + 1);

		}
	}

	void printPreOrder(Node root, int lv) {

		if (root != null) {

			out.println(root.data + " lv=" + lv);
			printPreOrder(root.left, lv + 1);
			printPreOrder(root.right, lv + 1);

		}
	}

	void printInOrder() {

		printInOrder(root, 1);
	}

	void printPreOrder() {

		printPreOrder(root, 1);
	}

	Node cloneAllNode(Node root) {

		if (root == null)
			return null;

		Node newNode = new Node(root.data);

		newNode.left = cloneAllNode(root.left);
		newNode.right = cloneAllNode(root.right);

		return newNode;

	}

	R61_Bst cloneTree() {

		R61_Bst newTree = new R61_Bst();
		newTree.root = cloneAllNode(root);

		return newTree;

	}

	public static void main(String[] args) {

		R61_Bst tree1 = new R61_Bst();
		// .....45
		// ..../..\
		// ...10...90
		// ../..\../..\
		// ./.\/.\80./.\

		tree1.add(45);
		tree1.add(10);
		tree1.add(90);
		tree1.add(80);

		O.l("printInOrder=");
		tree1.printInOrder();
		O.l();

		O.l("printPreOrder=");
		tree1.printPreOrder();
		O.l();

		int key = 45;
		O.l("aft del" + " " + key);
		tree1.del(key);

		O.l("printInOrder=");
		tree1.printInOrder();
		O.l();

		O.l("printPreOrder=");
		tree1.printPreOrder();
		O.l();

		R61_Bst tree2 = tree1.cloneTree();
		O.l("tree2 printInOrder=");
		tree2.printInOrder();
		O.l();

		O.l("tree2 printPreOrder=");
		tree2.printPreOrder();
		O.l();

		/////////////////////////////////

		R61_Bst tree3 = new R61_Bst();

		tree3.add(10);
		tree3.add(9);
		tree3.add(8);
		tree3.add(11);
		tree3.add(5);

		O.l("tree3 printPreOrder=");
		tree3.printPreOrder();
		O.l();

		O.l("H=" + tree3.countH(tree3.root));
		O.l("count of node=" + tree3.countAllNode(tree3.root));
		O.l("count of leaf=" + tree3.countAllLeaf(tree3.root));

		///////////////

		tree3.swapAllNode(tree3.root);

		O.l("tree3 printPreOrder=");
		tree3.printPreOrder();
		O.l();

		O.l("eq=" + ifAllNodeEq(tree1.root, tree2.root));

	}
}
