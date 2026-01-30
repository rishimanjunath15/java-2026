import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prev = 0;
        int curr = 1;
        int count = 2;
        int num = input.nextInt();

        while(count<=num){
            int temp = curr;
            curr = curr + prev;
            prev = temp;
            count++;
        }
        System.out.println(curr);

    }
}
