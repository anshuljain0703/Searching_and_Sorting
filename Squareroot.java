public class Squareroot {

    static int squareRoot(int x) {
        int s = 0;
        int e = x;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int val = mid * mid;

            if (val == x) {
                return mid;
            } else if (val < x) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 50;
        System.out.println("Square root of " + x + " is " + squareRoot(x));
    }
}
