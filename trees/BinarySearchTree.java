package trees;

public class BinarySearchTree extends BinaryTreeOperations {



	public static void main(String[] args) {
		
		
		BinarySearchTree test = new BinarySearchTree();
		
		test.insert(10);
		test.insert(11);
		test.insert(22);
		test.insert(99);
		test.insert(1);
		
		inorderTraversal(test.getRoot());// edu vey print pannirum print pooda veenam
		System.out.println("\n"+test.search(11).data);
	
	}

}
