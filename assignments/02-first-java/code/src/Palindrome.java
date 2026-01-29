import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = (sum * 10) + rem;
            num/=10;

        }
        System.out.println("rev no: " +sum);
    }
}
