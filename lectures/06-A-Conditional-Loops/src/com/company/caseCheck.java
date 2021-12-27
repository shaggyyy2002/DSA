package com.company;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {

//Q2.Check if the letter entered is Uppercase or Lowercase

     Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        if (ch == 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("uppercase");
        }

    }
}
