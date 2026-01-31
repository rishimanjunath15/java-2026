package AdvancedPrograms;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        //"Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.\n" +
        Scanner input = new Scanner(System.in);
        int august = 31;
        int Evencount = 0;
        int Oddcount = 0;

        int i = 1;
        while (i<=august) {
            if((i/2)%2==0){
                Evencount = Evencount + 1;
            }else{
                Oddcount = Oddcount + 1;
            }

            i++;
        }
        System.out.println("Even count" +Evencount);
        System.out.println("Odd count" +Oddcount);


    }
}
