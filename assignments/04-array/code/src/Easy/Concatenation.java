package Easy;

import java.util.Arrays;

public class Concatenation{
    public static void main(String[] args) {
        int[] num1 = {2,54,24,74,234};
        int[] num2 = {54,65,13,98,34};

        int[] result = new int[num1.length+num2.length];

        for (int i = 0; i < num1.length; i++) {
            result[i] = num1[i];
        }

        for (int i = 0; i < num2.length; i++) {
            result[num1.length+i] = num2[i];
        }
        System.out.println(Arrays.toString(result));


    }
}