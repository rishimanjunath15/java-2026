public class SquareRoot {
    public static void main(String[] args) {
        int x = 9;
        System.out.println(sqrt(x));


    }
    static double sqrt(int x){
        int start = 1;
        int end = x;
        int ans = 0;

        while(start <= end){
            int mid = start + (end-start)/2;
            int sqr = mid * mid;

            if (sqr == x){
                return mid;
            } else if (sqr < x) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid-1;
            }

        }
        return ans;
    }

}
