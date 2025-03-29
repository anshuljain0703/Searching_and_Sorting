

public class SelectionSort {
    static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) { // Start from i+1
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // Swap if the smallest is not the current element
            if (smallest != i) {
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 5};
        selectionsort(arr);
        
        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
