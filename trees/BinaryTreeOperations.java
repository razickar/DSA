package trees;


public class BinaryTreeOperations extends TreeTraversal {
	
		private TreeNode root;
		
		BinaryTreeOperations(){
			root = null;
		}
		public TreeNode getRoot() {
		    return root;
		}

	
	public void insert(int data) {
		root = insertChecker(root,data);
		
	}
	private TreeNode insertChecker(TreeNode node,int data) {
		if(node == null)return new TreeNode(data);                 // FOR RECURSION
																  //	EVERY TIME VALUE SET PANNITU CUURENT ROOT TA RETURN PANNUROM UN WINDS AAHUM POODU INITIAL ROOT ROOTKAY VANDURUM (UPADATED MARI)								
																  //  FOR DUBLICATE KUM RETURN ROOT WORK AAHUM
		if(data < node.data) {
			node.left = insertChecker(node.left,data);
		}
		else if(data > node.data) {
			node.right = insertChecker(node.right,data);
		}
		
		return node; // base case for dublicate ku
	}
	
	
	
	public TreeNode search(int data) {
		return finder(root,data);
	}
	private TreeNode finder(TreeNode node, int data) {
		if(node == null || node.data == data) {
			return node;
		}
		
		if(node.data > data) {
			return finder(node.left,data);
		}
		else  {   // INGA ELSE IF PODA MUDIYADHU BECAUSE NAMM ARETURN PANNANUM LA
			return finder(node.right,data);
		}
	}
	
}
