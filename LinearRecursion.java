package linearbinarysearch;

public class LinearRecursion {

	public static void main(String[] args) {
		int[] arr = {7,8,4,12};
		
		System.out.println("INDEX OF "+4+" Is "+recurser(arr.length-1,4,arr));

	}
	
	static int recurser(int n,int key,int[] ar) {
		if(ar[n] == key)return  n;
		
		return recurser(n-1,key,ar);
	}

}
