package Easy;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] num = {23,54,12,87,34};

        for (int i = 1; i < num.length; i++) {
            num[i] = num[i] + num[i-1];
        }
        System.out.println(Arrays.toString(num));
    }
}
