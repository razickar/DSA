class Node<T> {
    T data;
    Node<T> next;
    
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList<T> {
    private Node<T> head;
    private Node<T> current;
    private int size;
    
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    
   
  
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        
        if (head == null) {
            head = newNode;
            current = head;
        } 
        else {
            current.next = newNode;
            current = newNode;
        }
        size++;
    }
   
   
   
   
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
   
    
    
    
    
    public T removeFirst() {
        if (head == null) {
            System.out.println("List is empty");return;
        }
        
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }
    
    
    public T removeLast() {
        if (head == null) {
            System.out.println("List is empty");return;
        }
        
        if (head.next == null) {
            T data = head.data;
            head = null;
            size--;
            return data;
        }
        
        Node<T> currentDelete = head;
        while (currentDelete.next.next != null) {
            currentDelete = currentDelete.next;
        }
        T data = currentDelete.next.data;
        currentDelete.next = null;
        size--;
        return data;
    }
    
  
    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");return;
        }
        
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    
   
   
    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    
    public int size() {
        return size;
    }
    
   
    public boolean isEmpty() {
        return head == null;
    }
    
   
    public void clear() {
        head = null;
        size = 0;
    }
    

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node<T> current = head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
    
   
}


public class MyLinkedList {
    public static void main(String[] args) {
    	
    	LinkedList<String> ar = new LinkedList<>();
    	
    	ar.add("rzk");
    	ar.add("kcizar");
    	ar.add("ludba");
    	
    	ar.display();	
    	
    	ar.addFirst("dadaaa");
    	
    	ar.display();
    	
    	ar.removeFirst();
    	ar.display();
    	ar.removeLast();
    	ar.display();

        LinkedList<Integer> ar = new LinkedList<>();
    	
    	ar.add(1);
    	ar.add(2);
    	ar.add(6);
    	
    	ar.display();	
    	
    	ar.addFirst(11);
    	
    	ar.display();
    	
    	ar.removeFirst();
    	ar.display();
    	ar.removeLast();
    	ar.display();
    	
    	    
    }
}

