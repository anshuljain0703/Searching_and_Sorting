public class QuickSort {
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int s, int e) {
        int pivot = arr[s];
        int cnt = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < pivot) {
                cnt++;
            }
        }
        
        int pivotIndex = s + cnt;
        swap(arr, s, pivotIndex);

        int i = s, j = e;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void quicksort(int[] arr, int s, int e) {
        if (s >= e) return;
        
        int pivot = partition(arr, s, e);
        quicksort(arr, s, pivot - 1);
        quicksort(arr, pivot + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 3, 7, 10, 13};
        quicksort(arr, 0, arr.length - 1);
        
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
