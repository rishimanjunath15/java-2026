import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        //Subtract the Product and Sum of Digits of an Integer
        int prod = 1;
        int sum = 0;
        while(num>0){
            int digits = num % 10;
            prod = digits * prod;
            sum = sum + digits;
            num = num/10;
        }
        int sub = prod - sum;
        System.out.println(sub);




    }
}
