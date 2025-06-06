public class RadixSort {

    // Function to get the maximum value in the array
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max)
                max = value;
        }
        return max;
    }

    // Counting sort for a specific digit (place)
    static void countingSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // for digits 0-9

        // Count occurrences of digits
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / place) % 10;
            count[digit]++;
        }

        // Convert count to cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (right to left for stability)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / place) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy output to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Main radix sort function
    static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Do counting sort for every digit place
        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(arr, place);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        radixSort(arr);

        System.out.println("\n\nAfter Radix Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
