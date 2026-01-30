package AdvancedPrograms;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prev_reading = input.nextInt();
        System.out.println("previous reading: " +prev_reading);
        int curr_reading = input.nextInt();
        System.out.println("current reading: " + curr_reading);

        double charges;

        if(curr_reading > prev_reading){
            int units_consumed = curr_reading - prev_reading;
            System.out.println("units consumed: " +units_consumed);
            if(units_consumed <= 100){
                charges = units_consumed * 1.5;
                System.out.println("Total charges applied to him: " +charges);
            }
            if(units_consumed > 100 && units_consumed <= 200) {
                charges = units_consumed * 2.5;
                System.out.println("Total charges applied to him: " +charges);
            }
            if(units_consumed > 200) {
                charges = units_consumed * 4 ;
                System.out.println("Total charges applied to him: " +charges);
            }
        }else{
            System.out.println("current reading must be greater than previous reading");
        }
    }
}
