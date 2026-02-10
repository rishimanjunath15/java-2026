public class HigherLower {
    static int target = 23;

    public static void main(String[] args) {
        int num = 30;
        System.out.println(guessnum(num));

    }

    static int guessnum(int num) {
        int start = 1;
        int end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ans = guess(mid);
            if (ans == 0) {
                return mid;
            } else if (ans == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

        static int guess (int mid){
            if (mid == target) {
                return 0;
            } else if (mid > target) {
                return -1;
            } else {
                return 1;
            }
        }
    }

