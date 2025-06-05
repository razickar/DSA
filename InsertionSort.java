import java.util.*;

public class InsertionSort {
    public static void InsertionSort(int[] arr) {
        int n = arr.length;
       

        for (int i = 1; i < n ; i++) {
            
            int temp = arr[i];System.out.println(temp);
int j = i-1;
            while(  0 <= j && arr[j] > temp) {
               
                   arr[j+1] = arr[j]; System.out.println(Arrays.toString(arr));
                    j--;
                     System.out.println(j);
            }
            arr[j+1] = temp;
            
            
            

           
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1};
        InsertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

