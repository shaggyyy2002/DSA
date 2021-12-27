package com.company;

import java.util.Scanner;

public class NestedCase {
    public static void main(String[] args) {

//Q.4 Nested Case In Java

    Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();
        switch(empID){
            case 1 -> System.out.println("Nitin Gouda");
            case 2 -> System.out.println("Leena Raut");
            case 3 -> System.out.println("Priti Pal");
            case 4 -> {
                switch (department) {
                    case "CSE" -> System.out.println("CSE Department");
                    case "Electrical" -> System.out.println("Mechanical Department");
                    default -> System.out.println("Please Enter Valid Department");
                }
            }
            default -> System.out.println("PLease Enter Valid EmpID");
        }
    }
}
