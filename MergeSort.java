package sorting;

public class MergeSort {

	
	public static void mergeSort(int a[],int lb,int ub){
		int	len = a.length;
			
		if(lb < ub){
		int mid = lb +(ub - lb)/2;
		mergeSort(a,lb,mid);
		mergeSort(a,mid+1,ub);
		merge(a,lb,mid,ub);
		}	
	
	}
	
	
	public static void merge(int a[],int left,int mid,int right){
		int len = right - left +1;
		int [] arr = new int[len];
		
		 for(int i = 0; i < len; i++) {
			 arr[i] = a[i+left];
		 }
		 int leftStart = 0;
		 int leftEnd = mid - left;
		 int rightStart = mid - left + 1;
		 int rightEnd = len-1;
		 int idx = left;
		 while(leftStart <= leftEnd && rightStart <= rightEnd) {
			 
			 if( arr[leftStart] <= arr[rightStart] ) {  // edu ulla ulla araiku check
				 a[idx++] = arr[leftStart++];
			 }
			 else {
				 a[idx++] = arr[rightStart++];
			 }
			  
		 }
		 
		 while(leftStart <= leftEnd) {
			 a[idx++] = arr[leftStart++]; 
		 }
		 while(rightStart <= rightEnd) {
			 a[idx++] = arr[rightStart++]; 
		 }
		 
		 
		
		 
		
	}
	
	
	
	
    

    public static void main(String[] args) {
        int[] arr = {5,2,4,1};
        
        mergeSort(arr,0,arr.length-1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}
