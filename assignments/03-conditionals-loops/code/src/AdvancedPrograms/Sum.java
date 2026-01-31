package AdvancedPrograms;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum =0;
        System.out.println("enter the value of n:");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            num = input.nextInt();
            sum = sum + num;
        }
        System.out.println(sum);


}
}
