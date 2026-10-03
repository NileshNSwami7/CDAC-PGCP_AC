package BinarySearchTree;

public class BST {

	Node root;

	public BST() {
		this.root = null;
	}

	private Node insert(Node root, int data) {
		if (root == null) {
			Node node = new Node(data);
			return node;
		}
		if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public void insrt(int data) {
		root = insert(root, data);
	}

	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	private boolean search(Node root, int data) {
		if (root == null) {
			return false;
		}
		if (root.data == data) {
			return true;
		}

		return data < root.data ? search(root.left, data) : search(root.right, data);

	}

	public boolean search(int data) {
		return search(root, data);
	}

	private Node delete(Node root, int data) {
		if (root == null) {
			return null;
		}

		if (data < root.data) {
			root.left = delete(root.left, data);
		} else if (data > root.data) {
			root.right = delete(root.right, data);
		} else {
			if (root.left == null && root.right == null) {
				return null;
			}
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				Node successor = findMin(root.right);

				root.data = successor.data;
				root.right = delete(root.right, successor.data);
			}
		}

		return root;
	}

	public Node findMin(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
		
	}

	public void delete(int data) {
		root = delete(root, data);
	}
}
