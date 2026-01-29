import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + " " +b);
        char ch = input.next().trim().charAt(0);
        System.out.println("Enter the character: " +ch);
        if(ch == '+' || ch == '-' || ch == '/' || ch == '%' || ch == '*'){
            if(ch == '+'){
                int res = a+b;
                System.out.println(res);
            }
            if(ch == '-'){
                int res = a-b;
                System.out.println(res);
            }
            if(ch == '%'){
                int res = a%b;
                System.out.println(res);
            }
            if(ch == '*'){
                int res = a*b;
                System.out.println(res);
            }
            if(ch == '/'){
                if(b==0){
                    System.out.println("It should be greater than zero");
                }
                if(b!=0){
                    int res = a/b;
                    System.out.println(res);
                }

            }
        }else{
            System.out.println("you are providing an wrong operator");
        }
    }
}
