class RadixSort {
    // Corrected findMax method to return the maximum value, not the index.
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void countsort(int[] arr, int place) {
        int n = arr.length;
        int[] count = new int[10]; // Radix is 10 (digits 0-9)
        int[] output = new int[n];

        // Frequency Count
        for (int i = 0; i < n; i++) {
            count[(arr[i] / place) % 10]++;
        }

        // Prefix Sum (Cumulative Count)
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Sorting based on current digit
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        // Copy sorted values back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr) {
        int max = findMax(arr);

        // Iterate through each digit's place value
        for (int place = 1; max / place > 0; place *= 10) {
            countsort(arr, place);
        }
    }

    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 2};
        radixSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

