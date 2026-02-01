import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int[][] arr = new int[3][3];
//        or
//        int[][] arr = new int[3][];
//        or
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6,9},
//                {7,8}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); //no of rows - 3


        //input
        for (int row = 0; row < arr.length; row++) {
            for (int coloumn = 0; coloumn < arr[row].length; coloumn++)
                arr[row][coloumn] = input.nextInt();
        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int coloumn = 0; coloumn < arr[row].length; coloumn++) {
//                System.out.print(arr[row][coloumn] + " ");
//            }
//            System.out.println();
//        }

        //output
//        for(int row =0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //output
        for (int[] ele : arr) {
            System.out.println(Arrays.toString(ele));
        }


    }
}
