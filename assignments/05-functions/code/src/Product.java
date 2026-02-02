import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int res = Product(num1,num2);
        System.out.println(res);
    }
    static int Product(int num1,int num2){
        return num1 * num2;
    }
}
