package com.company;

import java.util.Scanner;

public class Intrest {
    public static void main(String[] args) {

//Q3.write a program to input principle,rate,time (P,T,R) from the user and find simple interest.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle value: ");
        float p = sc.nextFloat();
        System.out.println("Enter rate value: ");
        float r = sc.nextFloat();
        System.out.println("Enter time value: ");
        float t = sc.nextFloat();
        float nitin = (p*r*t/100);
        System.out.println(nitin);

    }
}
