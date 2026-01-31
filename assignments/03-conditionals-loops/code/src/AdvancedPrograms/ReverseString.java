package AdvancedPrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse A String In Java
        Scanner input = new Scanner(System.in);
        String word = input.next();
        System.out.println(word);
        int len = word.length();
        System.out.println(len);

        for(int i =len-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }


    }
}
