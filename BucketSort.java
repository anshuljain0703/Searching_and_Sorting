import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    static void bucketsort(float[] a) {
        int n = a.length;
        // Create empty buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // Put array elements into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (a[i] * n); // Index in bucket
            buckets[bucketIndex].add(a[i]);
        }

        // Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate all buckets into a[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float value : buckets[i]) {
                a[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        float[] a = {0.5f, 0.4f, 0.3f, 0.2f};
        bucketsort(a);
        for (float value : a) {
            System.out.println(value);
        }
    }
}

