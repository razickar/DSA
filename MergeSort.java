public class MergeSort {
	int len = 10;
	static int[] = new int[len];
	
	public static void mergeSort(int a[],int lb,int ub){
			len = a.length;
			
		if(lb < ub){
		int mid = lb +(ub - lb)/2;
		mergeSort(a,lb,mid);
		mergeSort(a,mid+1,ub);
		merge(
		}	
	
	}
	
	
	public static int merge(){
		
		
	}
	
	
	
	
    

    public static void main(String[] args) {
        int[] arr = {5,2,4,1};
        
        quickSort(arr,0,arr.length-1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}

