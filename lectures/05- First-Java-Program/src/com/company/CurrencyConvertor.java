package com.company;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {

//Q6.Input currency in rupees and output in USD

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount in rupees to convert: ");
        int Rup = sc.nextInt();
        float doll = (Rup / 73.70f);
        System.out.println("Your amount in dollars are : " +" "+ doll);

    }
}
