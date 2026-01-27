import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "Mango" -> System.out.println("king of fruit");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Orange" -> System.out.println("round fruit");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("please enter valid fruit");
        }
    }
}