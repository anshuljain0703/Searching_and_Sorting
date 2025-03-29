public class Duplicated {
    
    static int search(int[] a, int target) {
        int n = a.length;
        int s = 0, e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (a[mid] == target) {
                return mid;
            }
            else if(a[s]==a[mid]&&a[mid]==a[e]){
                s++;
                e--;
            }

            // Check if the left side is sorted
            if (a[s] <= a[mid]) {
                if (target >= a[s] && target < a[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } 
            // Otherwise, the right side must be sorted
            else {
                if (target > a[mid] && target <= a[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        // If target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3,3, 4,4, 5, 1, 2};
        int target = 1;
        System.out.println(search(a, target));
    }
}

    

