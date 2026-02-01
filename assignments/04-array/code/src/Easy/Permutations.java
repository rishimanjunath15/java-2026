package Easy;

import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 3};


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        int[] ans = new int[4];
        for(int i=0;i<ans.length;i++){
            ans[i] = arr[arr[i]];
            System.out.println(ans[i]);
        }
        System.out.println(Arrays.toString(ans));

    }
}
