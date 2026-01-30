import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //volume of cone
//        int radius = input.nextInt();
//        int height = input.nextInt();
//        double volume = (1.0/3) * Math.PI * Math.pow(radius,2) * height;
//        System.out.println("volume of cone: " +volume);

        //volume of prism
//        int h = input.nextInt();
//        int r = input.nextInt();
//        double area = Math.PI * Math.pow(r,2);
//        double volume = area * h;
//        System.out.println("volume of prism: " +volume);

        //volume of cylinder
//        int r = input.nextInt();
//        int h = input.nextInt();
//        double volume = Math.PI * Math.pow(r,2) * h;
//        System.out.println("volume of cylinder: " +volume);

        //volume of Pyramid
//        int h = input.nextInt();
//        int r = input.nextInt();
//        double area = Math.PI * Math.pow(r,2);
//        double volume = (1.0/3) * area * h;
//        System.out.println("volume of prism: " +volume);

        //volume of sphere
        int r = input.nextInt();
        double volume = (4.0/3) * Math.PI * Math.pow(r,3);
        System.out.println("volume of spher: " +volume);




    }
}
