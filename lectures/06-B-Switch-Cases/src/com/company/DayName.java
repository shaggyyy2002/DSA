package com.company;

import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {

 //Q.2 Display Day Name

  Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");  //This is enhanced Version of Switch Statement
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

 //Q.3 Weekends And Weekdays

        int day2 = sc.nextInt();
        switch (day2) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekends");
        }
    }
}
