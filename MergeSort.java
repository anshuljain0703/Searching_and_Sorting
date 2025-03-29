public class MergeSort {
    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        
        int i = 0, j = 0;
        int k = l;
        
        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        // Copy remaining elements of left[] if any
        while (i < n1) {
            arr[k++] = left[i++];
        }
        
        // Copy remaining elements of right[] if any
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
    
    static void mergesort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            
            // Sort first and second halves
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);
            
            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 20, 4, 6, 3};
        int n = arr.length;
        mergesort(arr, 0, n - 1);
        
        System.out.println("Sorted array:");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
