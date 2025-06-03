class Node<T> {
    T data;
    Node<T> next;
    Node<T> pre;
    
    public Node(T data) {
        this.data = data;
        this.next = null;
        this.pre = null;
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
            newNode.pre = current;
            current = newNode;
            
        }
        size++;
    }
   
   
   
   
   public void addFirst(T data) {
    Node<T> newNode = new Node<>(data);
    if (head != null) {
        newNode.next = head;
        head.pre = newNode;
    }
    head = newNode;
    size++;
}

   
    
    
    
    
    public T removeFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        
        T data = head.data;
        head = head.next;
        head.pre = null;
        size--;
        return data;
    }
    
    
    public T removeLast() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        
        if (head.next == null) {
            T data = head.data;
            head = null;
            size--;
            return data;
        }
        
        Node<T> currentDelete = head;
        while (currentDelete.next.next != null) {
            currentDelete = current.next;
        }
        T data = currentDelete.next.data;
        currentDelete.next = null;
        currentDelete.pre = null;
        size--;
        return data;
    }
    
  
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
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


public class MyDoubleLinkedList {
    public static void main(String[] args) {
    	
    	LinkedList<String> ar = new LinkedList<>();
    	
    	ar.add("rzk");
    	ar.add("kcizar");
    	ar.add("ludba");
    	
    	ar.display();	
    	
    	ar.addFirst("dada");
    	
    	ar.display();
    	    
    }
}

