import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empid = input.nextInt();
        String department = input.next();


//        switch(empid){
//            case 1:
//                System.out.println("rishi");
//                break;
//            case 2:
//                System.out.println("druva");
//                break;
//            case 3:
//                System.out.println("emp no 3");
//                switch(department){
//                    case"it":
//                        System.out.println("it department");
//                        break;
//                    case"non it":
//                        System.out.println("nonit department");
//                        break;
//                    default:
//                        System.out.println("enter correct department");
//
//                }
//                break;
//            default:
//                System.out.println("enter correct empid");
//        }

        //better way to write enhance switch statement

        switch (empid) {
            case 1 -> System.out.println("rishi");
            case 2 -> System.out.println("druva");
            case 3 -> {
                System.out.println("emp no 3");
                switch (department) {
                    case "it" -> System.out.println("it department");
                    case "non it" -> System.out.println("nonit department");
                    default -> System.out.println("enter correct department");
                }
            }
            default -> System.out.println("enter correct empid");
        }
    }
}
