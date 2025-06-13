public class QuickSort {
	
	public static void quickSort(int a[],int lb,int ub){
	
		if(lb < ub){
		int mid = partion(a,lb,ub);
		
		quickSort(a,lb,mid-1);
		quickSort(a,mid+1,ub);
		
		}	
	
	}
	
	public static int partion(int arr[],int lb,int ub){
		
		int pvot = arr[lb];
		int start = lb;
		int end = ub;
		
		while(start < end){
		
			while(start < ub && pvot >= arr[start]){
				start++;
			}
			while(pvot < arr[end]){
				end--;
			} 
			
			if(start < end){
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
			
		
		}
		
		int temp = arr[end];
		arr[end] = arr[lb];
		arr[lb] = temp;
		
		return end;
	
	}
	
	
	
	
    

    public static void main(String[] args) {
        int[] arr = {5,2,4,1};
        
        quickSort(arr,0,arr.length-1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}

