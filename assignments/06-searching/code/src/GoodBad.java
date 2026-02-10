public class GoodBad {
    static int bad = 5;
    public static void main(String[] args) {
        int n =15;
        System.out.println(result(n));
    }
    static int result(int n){
        int start = 1;
        int end = n;

        while (start<end){
            int mid = start + (end - start)/2;
            if (isBad(mid)){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
    static boolean isBad(int version){
        return version>=bad;
    }
}
