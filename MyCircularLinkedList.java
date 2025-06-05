import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList<T> {
    private Node<T> tail;
    private int size;

    public CircularLinkedList() {
        this.tail = null;
        this.size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } 
        else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } 
        else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (tail == null) {
            throw new RuntimeException("List is empty");
        }

        Node<T> head = tail.next;
        T data = head.data;

        if (tail == head) {
            tail = null;
        } else {
            tail.next = head.next;
        }

        size--;
        return data;
    }

    public T removeLast() {
        if (tail == null) {
            throw new RuntimeException("List is empty");
        }

        Node<T> current = tail.next;

        if (tail == current) {
            T data = tail.data;
            tail = null;
            size--;
            return data;
        }

        while (current.next != tail) {
            current = current.next;
        }

        T data = tail.data;
        current.next = tail.next;
        tail = current;
        size--;
        return data;
    }

    public void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node<T> current = tail.next;
        System.out.print("CircularLinkedList: ");
        do {
            System.out.print(current.data);
            current = current.next;
            if (current != tail.next) System.out.print(" -> ");
        } while (current != tail.next);
        System.out.println();
    }

    public int size() {
        return size;
    }

    public boolean contains(T data) {
        if (tail == null) return false;

        Node<T> current = tail.next;
        do {
            if (current.data.equals(data)) return true;
            current = current.next;
        } while (current != tail.next);

        return false;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void clear() {
        tail = null;
        size = 0;
    }
}

public class MyCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList<String> list = new CircularLinkedList<>();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nCIRCULAR LINKED LIST  ");
            System.out.println("1. Add Last");
            System.out.println("2. Add First");
            System.out.println("3. Remove First");
            System.out.println("4. Remove Last");
            System.out.println("5. Display");
            System.out.println("6. Size");
            System.out.println("7. Contains");
            System.out.println("8. Clear");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to add: ");
                    list.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter data to add first: ");
                    list.addFirst(sc.nextLine());
                    break;
                case 3:
                    try {
                        System.out.println("Removed: " + list.removeFirst());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Removed: " + list.removeLast());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Size: " + list.size());
                    break;
                case 7:
                    System.out.print("Enter data to search: ");
                    System.out.println(list.contains(sc.nextLine()) ? "Found" : "Not Found");
                    break;
                case 8:
                    list.clear();
                    System.out.println("List cleared.");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}

