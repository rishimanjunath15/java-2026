import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        System.out.println(isPrime(num));
        armstrong(153);
    }


    //print all three digits armstrong numbers
    static void armstrong(int a){
        int original_no = a;
        int sum = 0;
        while(a>0){
            int rem = a%10;
            a = a/10;
            int cube = (rem)*(rem)*(rem);
            sum = sum+cube;

        }
        System.out.println("the armstrong value : " +sum);
        if(sum == original_no){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


    //checking prime number
//    static boolean isPrime(int num){
//       if(num<=1){
//           return false;
//       }
//
//       int n = 2;
//       while(n*n<=num){
//           if(num%n==0){
//               return false;
//           }
//           n++;
//       }
//       if(n*n>num){
//           return true;
//       }
//       return false;
//
//    }
}
