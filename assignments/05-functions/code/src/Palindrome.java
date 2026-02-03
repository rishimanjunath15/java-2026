import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int prod = Palindrome(num);
        System.out.println(prod);
        if(prod == num){
            System.out.println("yes it is");
        }else{
            System.out.println("no its not");
        }
    }
    static int Palindrome(int num){
        int sum =0;
        int reversed = 0;
        while(num>0){
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num/10;
        }
        return reversed;
    }
}
