import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num);
        evenOdd(num);
//        evenOdd(9);

    }
    static void evenOdd(int a){
        if(a%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }

}
