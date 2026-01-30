import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Curved surface area
//        int r = input.nextInt();
//        int h = input.nextInt();
//        double result = 2 * Math.PI * r * h;
//        System.out.println("curved surface area: " +result);

        //Total surface area of cube
        int a = input.nextInt();
        double result = 6 * Math.pow(a,2);
        System.out.println("Total surface area of cube: " +result);




    }
}
