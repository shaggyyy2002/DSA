package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

//Q.5 Find the reverse answer for the question ?

        Scanner sc = new Scanner(System.in);

        int num = 19134;
        int ans = 0;

        while(num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);

    }
}
