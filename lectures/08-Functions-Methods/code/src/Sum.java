import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
        int res = sum3(2,4);
        System.out.println(res);

    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a,int b){
        int sum = a+b;
        return sum;
    }

    //return a value
    static int sum2(){
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
        num1 = input.nextInt();
        num2 = input.nextInt();
        result = num1+ num2;
        return result;
//        System.out.println("this will never execute");
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
        num1 = input.nextInt();
        num2 = input.nextInt();
        result = num1+ num2;
        System.out.println(result);
    }



}
