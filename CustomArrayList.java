package arraylist;


class MyArrayList<T> {
 private Object[] data; // t[] epdi poota  Because at runtime, the JVM doesn't know what T is.
 						// So we use Object[] and cast when needed.
 private int size;
 private int capacity;
 
 
 public MyArrayList() {
     this.capacity = 10;
     this.data = new Object[capacity];
     this.size = 0;
 }
 
 
 public MyArrayList(int initialCapacity) {
     if (initialCapacity < 0) {
         throw new IllegalArgumentException(" negative");
     }
     this.capacity = initialCapacity;
     this.data = new Object[capacity];
     this.size = 0;
 }
 
 
 public boolean add(T element) {
     ensureCapacity();
     data[size] = element;
     size++;
     return true;
 }
 
 

 
 
 @SuppressWarnings("unchecked")
 public T get(int index) {
     if (index < 0 || index >= size) {
         throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
     }
     return (T) data[index];
 }
 
 
 @SuppressWarnings("unchecked")
 public T set(int index, T element) {
     if (index < 0 || index >= size) {
         throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
     }
     T oldValue = (T) data[index];
     data[index] = element;
     return oldValue;
 }
 
 
 @SuppressWarnings("unchecked") //i know what i do
 public T remove(int index) {
     if (index < 0 || index >= size) {
         throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
     }
     
     T removedElement = (T) data[index];
     
    
     for (int i = index; i < size - 1; i++) {
         data[i] = data[i + 1];
     }
     
     size--;
     data[size] = null; // clear panni vidurom 
     return removedElement;
 }
 
 
 public boolean remove(Object element) {
     int index = indexOf(element);
     if (index != -1) {
         remove(index);
         return true;
     }
     return false;
 }
 
 
 public int indexOf(Object element) {
     for (int i = 0; i < size; i++) {
         if (element == null ? data[i] == null : element.equals(data[i])) {
             return i;
         }
     }
     return -1;
 }
 
 
 public boolean contains(Object element) {
     return indexOf(element) != -1;
 }
 
 
 public int size() {
     return size;
 }
 
 
 public boolean isEmpty() {
     return size == 0;
 }
 
 
 public void clear() {
     for (int i = 0; i < size; i++) {
         data[i] = null;
     }
     size = 0;
 }
 

 private void ensureCapacity() {
     if (size >= capacity) {
         int newCapacity = capacity * 2;
         Object[] newData = new Object[newCapacity];
         
         
         for (int i = 0; i < size; i++) {
             newData[i] = data[i];
         }
         
         data = newData;
         capacity = newCapacity;
     }
 }
 
 
 @Override
 public String toString() {
     if (size == 0) {
         return "[]";
     }
     
     StringBuilder sb = new StringBuilder();
     sb.append("[");
     for (int i = 0; i < size; i++) {
         sb.append(data[i]);
         if (i < size - 1) {
             sb.append(", ");
         }
     }
     sb.append("]");
     return sb.toString();
 }
 
 // edu current capacity ku
 public int getCapacity() {
     return capacity;
 }
}


public class CustomArrayList {
 public static void main(String[] args) {
    
	 
     MyArrayList<String> list = new MyArrayList<>();
     
     
     list.add("Apple");
     list.add("Banana");
     list.add("Cherry");
     list.add("Date");
     
     
     
  
     System.out.println("List: " + list);
     
     
 }
}