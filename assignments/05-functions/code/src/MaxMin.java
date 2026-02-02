import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        maxNum(23,1,45);
        minNum(23,1,45);
        //input by user
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        maxNum(a,b,c);
        minNum(a,b,c);



    }

    static void maxNum(int a,int b,int c) {
        int max = a;
            if(b>max){
                max = b;
            }if (c>max){
                max = c;
            }
        System.out.println(max);
    }

    static void minNum(int a,int b,int c) {
        int min = a;
            if(b<min){
                min = b;
            }if (c<min){
                min = c;
            }
        System.out.println(min);
    }
}
