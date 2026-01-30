package AdvancedPrograms;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        //Calculate Discount of Product
        Scanner input = new Scanner(System.in);
        System.out.println("enter the original amount");
        int original_price = input.nextInt();
        System.out.println("enetr the discount on this product amount");
        int discount = input.nextInt();
        double discounted_price = (original_price/100.0) * 10.0;
        double amount_paid = original_price - discounted_price;
        System.out.println(amount_paid);
    }
}
