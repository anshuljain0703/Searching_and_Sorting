

public class SortFruits {
    static void sortfruits(String[] fruits) {
        int n = fruits.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min]) < 0) {
                    min = j;
                }
            }
            // Swap the elements
            String temp = fruits[i];
            fruits[i] = fruits[min];
            fruits[min] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"apple", "kiwi", "lime", "mango"};
        sortfruits(fruits);
        
        // Print sorted array
        System.out.print("Sorted fruits: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
