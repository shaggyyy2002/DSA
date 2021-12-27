package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

//Q1.write a program to print whether the number is even or odd,also take input.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("n is even number");
        }
        else{
            System.out.println("n is odd number");

        }
    }
}
