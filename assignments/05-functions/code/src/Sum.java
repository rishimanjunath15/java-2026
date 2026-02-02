import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("num1: " +num1);
        int num2 = input.nextInt();
        System.out.println("num2: " +num2);
        int res = sum(num1,num2);
        System.out.println(res);

    }
    static int sum(int num1,int num2){
        int result = num1+num2;
        return result;
    }
}
