package AdvancedPrograms;

import java.util.Scanner;

public class PerComb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        double sum = 0;
        int x = 1;
        while(n>0){
            double prod = n * (n-1);
            sum = sum + prod;
            n--;
        }
    }
}
