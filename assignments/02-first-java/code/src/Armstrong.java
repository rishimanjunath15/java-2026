import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while(num>0){
            int rem = num % 10;
            rem = rem * rem * rem;
            sum = sum + rem;
            System.out.println(sum);
            num = num/10;
        }
    }
}
