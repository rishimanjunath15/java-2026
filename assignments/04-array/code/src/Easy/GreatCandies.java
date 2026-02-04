package Easy;

import java.util.Arrays;

public class GreatCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extracandies = 3;
        int max = candies[0];

        int[] ans = new int[candies.length];
        for (int i = 0; i < candies.length; i++) {
            ans[i] = candies[i] + extracandies;
        }
        System.out.println(Arrays.toString(ans));

        for (int i = 0; i < candies.length; i++) {
            if(ans[i]>max){
                max = ans[i];
            }
        }
        System.out.println("maximum: " +max);

        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if(ans[i]>=max){
                result[i] = true;
            }else{
                result[i] = false;
            }
        }
        System.out.println(Arrays.toString(result));



    }
}
