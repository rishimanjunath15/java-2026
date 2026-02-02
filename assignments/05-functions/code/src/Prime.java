import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = input.nextInt();
        boolean ress = prime(num);
        System.out.println(ress);

    }

    static boolean prime(int num){
        int a = 2;
        if(num<=1){
            return false;
        }
        while(a*a<=num){
            if(num%a==0){
                return false;
            }return true;
        }
        if(a*a>num){
            return true;
        }
        return false;
    }
}
