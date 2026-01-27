import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        greeting();
//        String ans = greet("rishi");
//        System.out.println(ans);

        //by using scanner
        Scanner input = new Scanner(System.in);
        System.out.println("enter the names:");
        String answer = input.next();
        String personal = personalized(answer);
        System.out.println(personal);
    }

    static String personalized(String names){
        String politician = "Hello " + names;
        return politician;
    }

    static String greet(String name){
        String message = "Hello" + name;
        return message;
    }

     static void greeting(){
        System.out.println("hello world");
    }
}
