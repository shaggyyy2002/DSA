package com.company;

import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {

//Q2.Take name as input and print a greeting message for that name.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = sc.next();

        System.out.println("Bonjour" +" "+ name);
    }
}
