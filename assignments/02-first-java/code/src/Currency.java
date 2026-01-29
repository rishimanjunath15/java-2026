import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rupees = input.nextInt();
        System.out.println("Rupees: " +rupees);
        rupees = rupees * 0.011;
        System.out.println(rupees);
    }
}
