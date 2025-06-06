package sorting;
import java.util.*;

public class ShellSort {

	public static int[] shellSort(int[] ar) {
		 
		 int len = ar.length;
		 
		 for(int gap = len/2; gap > 0 ; gap = gap/2 ) {
			 
			 for(int j =  gap; j < len; j++) {
				 
				 for(int i =  j - gap; i >= 0 ; i= i - gap) {
					 
					 if(ar[i] < ar[gap + i]) {
						 break;
					 }
					 else {
						 int temp = ar[i];
						 ar[i] = ar[gap + i];
						 ar[gap + i] = temp;
					 }
					 System.out.println(Arrays.toString(ar));
				 }
			 }
		 }
		 
		 
		return ar;
	 }
	
	
	
	
	
	public static void main(String[] args) {
		
		 int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
	        shellSort(arr);
	        System.out.println("Sorted Array: " + Arrays.toString(arr));
		
		

	}

}
