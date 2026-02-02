import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius:");
        int radius = input.nextInt();
        double result = Area(radius);
        System.out.println("Area of circle: " +result);
        double res = Perimeter(radius);
        System.out.println("Perimeter of circle: " +res);
    }

    static double Area(int radius){
        return Math.PI * Math.pow(radius,2);
    }
    static double Perimeter(int radius){
        return 2 * Math.PI * radius;
    }
}
