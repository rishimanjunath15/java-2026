import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        eligibility(age);
    }
    static void eligibility(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("under 18");
        }
    }
}
