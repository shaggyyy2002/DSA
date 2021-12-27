package com.company;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

//Q.1 Take Input of 2 numbers and print the sum

   Scanner sc = new Scanner(System.in);
        sum();
        sum2();
    }

//  a. Method without return type
    static void sum() {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        System.out.print("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        ans = num1 + num2;
        System.out.println(ans);
    }

 // b. Method With return Type

    static int sum2(){   //here we used int because the ans we have will be an integer.
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        System.out.print("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        ans = num1 + num2;
        System.out.println(ans);
        return sum2();

    }
}
