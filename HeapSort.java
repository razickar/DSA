import java.util.*;

public class HeapSort {

	public void heapSort(int[] arr,int n) {
	
		for(int i = (n/2) - 1; i >= 0; i--){
		
			heapify(arr,i,n);
			System.out.println(Arrays.toString(arr));
		}
// 		for(int x : arr){
// 		System.out.print(x+" ");
// 		}
System.out.print("============== ");
		
		for(int i = n-1; i > 0; i--) {
			
			swap(arr,0,i);
			heapify(arr,0,i);
			System.out.println(Arrays.toString(arr));
		}
		
	
		
	}
	
	private static void swap(int[] ar,int a,int b) {
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp; 
	}
	
	private void heapify(int[] ar, int i, int n) {
	
		int larger = i;
		int left = (2*i)+1;
		int right = (2*i)+2;
		
		if(left < n && ar[left] > ar[larger]) {
			larger = left;
		}
		if( right < n && ar[right] > ar[larger] ) {
			larger = right;
		}
		
		if(larger != i) {
			swap(ar,i,larger);
			heapify(ar,larger,n);
		}
		else {
			return;
		}
	
	}
	
public static void main(String args[]) {
		
		int[] a = {9,6,4,32,5,6,7,82,1};
		
		HeapSort hp = new HeapSort();
		hp.heapSort(a,a.length);
		

}

}
