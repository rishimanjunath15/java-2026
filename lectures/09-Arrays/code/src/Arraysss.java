import java.util.Arrays;
import java.util.Scanner;

public class Arraysss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1 :- array of primitives

//        int[] arr = new int[5];
//        arr[0] = 25;
//        arr[1] = 15;
//        arr[2] = 89;
//        arr[3] = 632;
//        arr[4] = 78;
//        System.out.println(arr[2]);


        //take input for array
//        for(int i= 0;i<arr.length;i++){
//            arr[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        //print the output for that input
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //enhanced for-loop
//        for(int num : arr){
//            System.out.println(num);
//        }


        //2 :- array of objects

        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));





    }
}
