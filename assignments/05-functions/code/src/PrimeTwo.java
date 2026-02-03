import java.util.Scanner;

public class PrimeTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean res = getprime(num);
        System.out.println(res);

        int a = input.nextInt();
        int b = input.nextInt();
        btwno(a,b);

    }

    static void btwno(int a,int b){
        for (int i = a; i < b; i++) {
            if (getprime(i)){
                System.out.println(i);
            }
        }
    }


    static boolean getprime(int num){
        int n =2;
        if(num<1){
            return false;
        }
        while(n*n<=num){
            if(num%n==0){
                return false;
            }return true;
        }
        if(n*n>num){
            return true;
        }return false;


    }
}
