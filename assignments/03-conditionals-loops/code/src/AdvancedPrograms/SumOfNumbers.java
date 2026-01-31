package AdvancedPrograms;//package AdvancedPrograms;
//
//import com.sun.security.jgss.GSSUtil;
//
//import java.util.Scanner;
//
//public class Problem2 {
//    public static void main(String[] args) {
//        //"Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.");
//
//        Scanner input = new Scanner(System.in);
//
//        int psum = 0;
//        int posum = 0;
//        int nsum = 0;
//        while(true){
//
//            int num = input.nextInt();
//            if(num==0){
//                break;
//            }
//            if(num>0){
//                psum = psum+num;
//
//            } else if (num%2==0) {
//                posum = posum+num;
//
//            } else if (num<0) {
//                nsum = nsum + num;
//
//            }
//        }
//        System.out.println(psum);
//        System.out.println(posum);
//        System.out.println(nsum);
//
//
//
//    }
//
//}


import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int negSum = 0;
        int posEvenSum = 0;
        int posOddSum = 0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            if (n < 0) {
                negSum += n;
            } else if (n % 2 == 0) {
                posEvenSum += n;
            } else {
                posOddSum += n;
            }
        }

        System.out.println("Sum of negative numbers: " + negSum);
        System.out.println("Sum of positive even numbers: " + posEvenSum);
        System.out.println("Sum of positive odd numbers: " + posOddSum);
    }
}


