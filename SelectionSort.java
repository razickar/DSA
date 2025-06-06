package sorting;
import java.util.*;

public class SelectionSort {

	public static int[] selectionSort(int[] ar) {
		 
		 int len = ar.length;
		 
		 for(int i = 0; i < len; i++ ) {
			 
			 int min = i;
			 int j = i+1;
			 while(j < len) {
				 
				 if(ar[min] > ar[j]) {
					 min = j;
				 }
				 j++;
			 }
			 int temp = ar[i];
			 ar[i] = ar[min];
			 ar[min] = temp;
			 System.out.println(Arrays.toString(ar));
			
		 }
		 
		 
		return ar;
	 }
	
	
	
	
	
	public static void main(String[] args) {
		
		 int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
	        selectionSort(arr);
	        System.out.println("Sorted Array: " + Arrays.toString(arr));
		
		

	}

}
