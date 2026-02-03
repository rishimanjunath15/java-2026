import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();;
        int result = Factorial(num);
        System.out.println(result);
    }
    static int Factorial(int num){
        int res = 1;
        while(num>0){
            res = res * num;
            num--;
        }
        return res;
    }
}
