package BinarySearchTree;

public class BSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		bst.insrt(50);
		bst.insrt(90);
		bst.insrt(40);
		bst.insrt(60);
		bst.insrt(10);
		bst.insrt(30);
		bst.insrt(45);
		bst.insrt(25);
		
		System.out.print("InOrder:");
		bst.inOrder(bst.root);
		System.out.println();
		System.out.print("PreOrder:");
		bst.preOrder(bst.root);
		System.out.println();
		System.out.print("PostOrder:");
		bst.postOrder(bst.root);
		System.out.println();
		
		System.out.println("Data presernt : "+ bst.search(90));
		
		bst.delete(90);
		System.out.print("InOrder:");
		bst.inOrder(bst.root);
		System.out.println();
		System.out.print("PreOrder:");
		bst.preOrder(bst.root);
		System.out.println();
		System.out.print("PostOrder:");
		bst.postOrder(bst.root);
		System.out.println();
	}

}
