package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

//Q.6 Calculator Program

        Scanner sc = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.print("Enter Operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print(" Enter Two Numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }

    }
}
