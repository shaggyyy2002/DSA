package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Arrays of Primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 22;
        arr[2] = 2;
        arr[3] = 252;
        arr[4] = 229;
        //[ 23 , 22 , 2 , 252 , 229]

        System.out.println(arr[3]);

        //input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(arr[5]); //index out of bound error

        //array of objects
        String [] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //Modify
        str [1] = "Kunal";

        System.out.println(Arrays.toString(str));



    }

}
