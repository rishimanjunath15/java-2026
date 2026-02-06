package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {


        int[] nums = {1,2,4,12,1,3,2,9,8,3,1,2,3};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
