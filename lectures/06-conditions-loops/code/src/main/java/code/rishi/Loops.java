package code.rishi;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //for loop

        //q: print numbers 1 to 5
        for(int i=1;i<=5;i++){
            System.out.print(i);
        }

        //q: print numbers 1 to n
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = input.nextInt();
        for(int num = 1;num<=n;num++){
            System.out.println(num);
        }

        //while loop

        //q: print numbers 1 to 5
        int num = 1;
        while(num<=5){
            System.out.println(num);
            num++;
        }

        //do-while loop

        //q: print numbers 1 to 5
        int num1 = 1;
        do{
            System.out.println(num1);
            num1++;
        }while(num1<=5);

    }
}
