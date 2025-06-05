//package Hashing;


class Node<T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		this.next = null;
	}
	
}

class OpenHashing<T> {
	private int size;
	public Node<T>[] arr ;
	
	
	@SuppressWarnings("unchecked")
	OpenHashing(int size) {
		this.size = size;
		arr = (Node<T>[]) new Node[size];    //	= (Node<T>) new Node<?>[size]   X wrong
					// 	new Node<?>[size] is not legal, because Java doesn’t allow arrays of parameterized types with wildcards like <?>.

					// new Node<T>[5]
					//	Java generics use type erasure, which means the type T is erased at runtime.
					//	Arrays in Java are reified, meaning they know their element type at runtime.
	}
	
	
	void add(T data) {
		Node<T> newNode = new Node(data);
		int index  = ((2*(data.hashCode())) + 3 ) % size;;
		
		if(arr[index] == null) {
			arr[index] = newNode;
		}
		else{
		
			Node<T> setter = arr[index];
			
			while(setter.next != null){
				setter = setter.next;
			}
			
			setter.next = newNode;
			
		}
		
	}
	
	void display() {
        System.out.println("Hash Table Contents:");
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            Node<T> temp = arr[i];
            if (temp == null) {
                System.out.println("null");
            } else {
                while (temp != null) {
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        }
    }
	
	
	
	
}






public class SeperateChaining {

	public static void main(String[] args) {
		
		OpenHashing<String> ar = new OpenHashing<>(5);
		
		ar.add("hii");
		ar.add("hellow");
		ar.add("mama");
		ar.add("miii");
		ar.add("joo");
		ar.add("yooo");
		ar.add("hii");
		
		
		ar.display();
		

	}

}
