package AdvancedPrograms;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        //method-01
//        Scanner input = new Scanner(System.in);
//        int num;
//        int sum = 0;
//
//        while(true){
//            num = input.nextInt();
//            if(num<=0){
//                break;
//            }else{
//                sum = sum + num;
//            }
//        }
//        double avg = sum/2.0;
//        System.out.println(avg);


        //method-02
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many numbers");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=n;i++){
            int num = input.nextInt();
            sum = sum + num;
        }
        double avg = sum/2.0;
        System.out.println("average of these numbers is: " +avg);

    }


}
