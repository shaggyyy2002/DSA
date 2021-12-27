package com.company;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

//Q4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions).

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number1: ");
        double number1 = sc.nextDouble();
        System.out.println("Enter your number2: ");
        double number2  = sc.nextDouble();
        System.out.println(" Select operator ( + , - , * , / ): ");
        char Op = sc.next().charAt(0);

        if (Op == '+') {
            System.out.println(number1 + number2);
        }
        else  if (Op == '-') {
            System.out.println(number1 - number2);
        }
        else if (Op == '*') {
            System.out.println(number1 * number2);
        }
        else  if (Op == '/') {
            System.out.println(number1 / number2);
        }
        else {
            System.out.println("invalid");
        }

//Q5.Take 2 numbers as input and print the largest number

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) {
            System.out.println("a is greater than b");
        } else if (a==b) {
            System.out.println("a is equal to b");
        }else {
            System.out.println("b is greater than a");
        }

    }
}
