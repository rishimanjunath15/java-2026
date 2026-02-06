package Easy;

import java.util.Arrays;

public class SmallCurr {
    public static void main(String[] args) {


        int[] nums = {12,45,2,5,67,34,12,43,23};

        int[] freq = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            freq[i] = count;
        }
        System.out.println(Arrays.toString(freq));


    }
}
