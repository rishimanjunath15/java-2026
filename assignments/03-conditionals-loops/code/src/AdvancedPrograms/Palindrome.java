package AdvancedPrograms;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int original = num;
        int ans = 0;
        while(num>0){
            int rem = num % 10;
//            System.out.print(rem);
            num = num/10;
            ans = ans * 10 + rem;


        }
        System.out.println(ans);
        if (original != ans) {
            System.out.println("not palindrome");
        } else {
            System.out.println("palindrome");
        }


    }
}
