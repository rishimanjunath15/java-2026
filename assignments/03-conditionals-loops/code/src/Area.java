import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Area of circle
//        double radius = input.nextInt();
//        double area = Math.PI * Math.pow(radius,2);
//        System.out.println("area: " +area );

        //Area of triangle
//        int base = input.nextInt();
//        int height = input.nextInt();
//        double area = 0.5 * base * height;
//        System.out.println("Area of triangle: " +area);

        //Area of rectangle
//        int length = input.nextInt();
//        int width = input.nextInt();
//        int area = length * width;
//        System.out.println("area of rectangle: " +area);

        //Area of isocelous triangle
//        int bredth = input.nextInt();
//        int height = bredth;
//        double area = 0.5 * bredth * height;
//        System.out.println("area of isocelous triangle: " +area);

        //Area of parallelogram
//        int bredth = input.nextInt();
//        int height = input.nextInt();
//        int area = bredth * height;
//        System.out.println(area);

        //Area of rhombus
//        int d1 = input.nextInt();
//        int d2 = input.nextInt();
//        double area = d1 * d2 * 0.5;
//        System.out.println(area);

//        Area of equilateral triangle
        int sides = input.nextInt();
        double area = (Math.sqrt(3) / 4) * Math.pow(sides,2);
        System.out.println("area of equilateral triangle: " +area);

    }
}
