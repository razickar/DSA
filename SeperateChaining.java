package hashing;


class Node<T> {
	
	int data;
	Node<T> next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
}

class OpenHashing<T> {
	private int size;
	public Node<Node<T>>[] arr ;
//	@suppresswarnings("unchecked")
	
	OpenHashing(int size) {
		this.size = size;
		arr = (Node<Node<T>>[])new Node<?>[size];
	}
	
	
	void add(int data) {
		
		int index  = ((2*data) + 3 ) % size;;
		
		if(arr[index] == null) {
			
		}
		
	}
	
	
	
}






public class SeperateChaining {

	public static void main(String[] args) {
		

	}

}
