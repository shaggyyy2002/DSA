package com.company;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {

//Q.1 Describe Fruit

   Scanner sc = new Scanner(System.in);

        String Fruit = sc.next();
        switch (Fruit) {
            case "Mango":
                System.out.println("King Of All Fruits");
                break;
            case "Apple":
                System.out.println("Sweet Red Fruit");
                break;
            case "Cherry":
                System.out.println("Berry type Fruit");
                break;
            case "Watermelon":
                System.out.println("Big Round Fruit");
                break;
            default:
                System.out.println("Please Enter a Valid Fruit");
        }
    }
}
