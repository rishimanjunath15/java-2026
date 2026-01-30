package AdvancedPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int res = 1;
        while(num>0){
            res = res * num;
            num--;
        }
        System.out.println(res);

    }
}
