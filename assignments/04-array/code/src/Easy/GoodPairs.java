package Easy;

import java.util.Arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int counter = 0;
        int[] nums = {1,5,1,1,4,3,4,7,7,2,3};

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]>nums[i]){
                    ans[i] = nums[j];
                }

                if(nums[i] == nums[j]){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
