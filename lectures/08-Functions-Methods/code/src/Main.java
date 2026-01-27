import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        //take a input of two  numbers and print the sum
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
         num1 = input.nextInt();
         num2 = input.nextInt();
         result = num1+ num2;
        System.out.println(result);
    }
}