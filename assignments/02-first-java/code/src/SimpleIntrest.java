import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the p value: ");
        int p = input.nextInt();
        System.out.println("enter the t value: ");
        int t = input.nextInt();
        System.out.println("enter the r value: ");
        int r = input.nextInt();
        int SI = (p*t*r)/100;
        System.out.println("The simple intrest: "  +SI);
    }
}
