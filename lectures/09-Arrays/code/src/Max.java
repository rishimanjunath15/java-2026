public class Max {
    public static void main(String[] args) {
        int[] arr = {1,65,4,23,98,43};
//        System.out.println(max(arr));
//        System.out.println(maxbtw(arr));
        System.out.println(maxparams(arr,0,3));
    }

    //range find out by changing params
    static int maxparams(int[] arr,int start,int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    //max value from range 1-3
//    static int maxbtw(int[] arr) {
//        int max = arr[0];
//        for (int i = 1; i < 3; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;

    //max value
//    static int max(int[] arr) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;


    }
}
