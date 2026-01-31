package AdvancedPrograms;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num  = input.nextInt();
        double sum = 0;
        while(num>0){
            int rem = num % 10;
            double prod = Math.pow(rem,3);
            sum = sum + prod;
            num = num /10;
        }
        System.out.println("Armstrong number: " +sum);
    }
}
