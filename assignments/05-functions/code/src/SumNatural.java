import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = sum(n);
        System.out.println(result);
    }
    static int sum(int n){
        if(n<=0){
            System.out.println("no negetive number");
        }

        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum+i;
        }
        return sum;
    }
}
