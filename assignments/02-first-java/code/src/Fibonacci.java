import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int prev = 0;
        int curr = 1;

        int count = 2;   //i want to find out 5th fibonnaci number

        while(count<=num){
            int temp = curr;
            curr = curr + prev;
            prev = temp;
            count++;
        }
        System.out.println(curr);













    }
}
