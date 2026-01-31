package AdvancedPrograms;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double sum = 0;
        while(num>0){
            double rem = num % 10;
            System.out.println(rem);
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}
