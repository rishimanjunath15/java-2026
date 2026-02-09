public class FindMin {
    public static void main(String[] args) {
        int[] arr = {124,-354,123,4,56,322,57,1};
        int res = minimum(arr);
        System.out.println(res);
    }

    static int minimum(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
