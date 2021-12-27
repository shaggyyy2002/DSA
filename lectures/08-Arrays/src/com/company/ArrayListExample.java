package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
          ArrayList<Integer> list = new ArrayList<Integer>(10);
        // We cannot pass primitives we have to pass wrapper classes
        //  Wrapper class is a class whose object wraps or contains primitive data types.
        //Inside the (size) contains initial capacity but can add many if wanted.

        list.add(25); // this is how we can add stuff in list
        list.add(55);
        list.add(554);
        list.add(6546);
        list.add(57);
        System.out.println(list);
        //[25 , 55, 554, 6546, 57]

        // We can Update it as well
        list.set(0, 22 );// Here it says set 0th index to 22
        list.set(1, 25); // Set 1st index to 25
        System.out.println(list);
        //[22, 25, 554, 6546, 57]

        //If we choose to remove
        list.remove(3); //here it says remove 3rd index
        System.out.println(list);
        //[22, 25, 554, 57]

        //We can take input as well by iterating

        for (int i = 0; i <5 ; i++) {
            list.add(sc.nextInt());
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
       // [22, 25, 554, 57, --> Scanner Class Inputs will be added here <--]


    }
}
