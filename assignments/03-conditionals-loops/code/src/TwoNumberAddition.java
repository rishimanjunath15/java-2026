import java.util.Scanner;

public class TwoNumberAddition {
    public static void main(String[] args) {
        //Addition Of Two Numbers
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int result = num1 + num2;
        System.out.println("Addition of two numbers: " +result);

    }
}
