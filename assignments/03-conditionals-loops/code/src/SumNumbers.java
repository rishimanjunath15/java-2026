import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
        while(true){
            num = input.nextInt();
            if(num==0){
                break;
            }
                sum = sum + num;
        }
        System.out.println(sum);

    }
}
