package trees;

import java.util.LinkedList;
import java.util.Queue;



public class TreeTraversal {
	
	
	public static void inorderTraversal(TreeNode root) {
		if(root == null)return;
			
		inorderTraversal(root.left);
		System.out.print(root.data +",");
		inorderTraversal(root.right);
		
		
	}
	
	public static void preorderTraversal(TreeNode root) {
		if(root == null)return;
		
		System.out.print(root.data +",");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		
	}
	
	public static void postorderTraversal(TreeNode root) {
		if(root == null)return;
		
		
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.data +",");
	}
	
	
	public static void levelorderTraversal(TreeNode root) {
		if(root == null)return;
		
		Queue<TreeNode>	levelList = new LinkedList<>(); 
		levelList.offer(root);
		
		while(!levelList.isEmpty()) {
			
			TreeNode node = levelList.poll();
			
			System.out.print(node.data+" ");
			
			if(node.left != null) {
				levelList.offer(node.left);
			}
			if(node.right != null) {
				levelList.offer(node.right);
			}
		}

		
	}
}
