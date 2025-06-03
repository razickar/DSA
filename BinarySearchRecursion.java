package linearbinarysearch;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int[] arr = {7,8,4,12};
		
		System.out.println("INDEX OF "+4+" Is "+recurser(0,arr.length-1,4,arr));

	}
	
	static int recurser(int left,int right,int key,int[] ar) {
		
		int mid = left +(right - left)/2;
		
		if(ar[mid] == key)return  mid;
		
		if(ar[mid] < key) {
			return recurser(left,mid-1,key,ar);
		}
	
			return recurser(mid+1,right,key,ar);
		
	}

}
