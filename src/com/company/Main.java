package com.company;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
/*
        //L1( input,output,debugging,data types)


 //Q1.write a program to print whether the number is even or odd,also take input.

         System.out.println("Enter integer: ");
         int n = sc.nextInt();
         if(n%2==0){
             System.out.println("n is even number");
         }
         else{
             System.out.println("n is odd number");
             }

 //Q2.Take name as input and print a greeting message for that name.

         System.out.print("Enter your name");
         String name = sc.next();

          System.out.println("Bonjour" +" "+ name);

 //Q3.write a program to input principle,rate,time (P,T,R) from the user and find simple interest.

         System.out.print("Enter principle value: ");
         float p = sc.nextFloat();
         System.out.println("Enter rate value: ");
         float r = sc.nextFloat();
         System.out.println("Enter time value: ");
         float t = sc.nextFloat();
         float nitin = (p*r*t/100);
         System.out.println(nitin);

 //Q4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions).

         System.out.println("Enter your number1: ");
         double number1 = sc.nextDouble();
         System.out.println("Enter your number2: ");
         double number2  = sc.nextDouble();
         System.out.println(" Select operator ( + , - , * , / ): ");
         char Op = sc.next().charAt(0);

         if (Op == '+') {
             System.out.println(number1 + number2);
         }
        else  if (Op == '-') {
             System.out.println(number1 - number2);
         }
        else if (Op == '*') {
             System.out.println(number1 * number2);
         }
       else  if (Op == '/') {
             System.out.println(number1 / number2);
         }
       else {
             System.out.println("invalid");
         }

 //Q5.Take 2 numbers as input and print the largest number

         System.out.print("Enter two numbers: ");
         int a = sc.nextInt();
         int b = sc.nextInt();

         if(a>b) {
             System.out.println("a is greater than b");
         } else if (a==b) {
             System.out.println("a is equal to b");
         }else {
             System.out.println("b is greater than a");
         }

 //Q6.Input currency in rupees and output in USD.

         System.out.println("Enter your amount in rupees to convert: ");
         int Rup = sc.nextInt();
         float doll = (Rup / 73.70f);
         System.out.println("Your amount in dollars are : " +" "+ doll);


                                 //L2.(conditional loops + calculator program )

 //Q1.Find the largest of the three numbers

         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

         int max = a;
         if (b > max) {
             max = b;
         }
         if (c > max) {
             max = c;
         }
         System.out.println(max);

 //Q2.Check if the letter entered is Uppercase or Lowercase

         char ch = sc.next().trim().charAt(0);

         if (ch == 'a' && ch <= 'z') {
             System.out.println("Lowercase");
         }
         else {
             System.out.println("uppercase");
         }

 //Q3.Find the nth fibonacci number?

         int n = sc.nextInt();
         int a = 0;
         int b = 1;
         int count = 2;

         while (count <= n) {
             int temp = b;
             b = b + a;
             a = temp;
             count++;
         }
         System.out.println(b);

 //Q4.Find the counting occurrence for number 5 ?

         int n = 94581434;

        int count = 0;

         while (n > 0);                  // Solution is wrong.
         {
             int rem = n / 10;
             if (rem == 5) ;

         }
         System.out.println(count);

 //Q.5 Find the reverse answer for the question ?

         int num = 19134;
         int ans = 0;

         while(num > 0) {
             int rem = num % 10;
             num /= 10;
             ans = ans * 10 + rem;
         }
         System.out.println(ans);


 //Q.6 Calculator Program

         int ans = 0;
         while (true) {
             System.out.print("Enter Operator: ");
             char op = sc.next().trim().charAt(0);

             if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                 System.out.print(" Enter Two Numbers: ");
                 int num1 = sc.nextInt();
                 int num2 = sc.nextInt();

                 if (op == '+') {
                     ans = num1 + num2;
                 }
                 if (op == '-') {
                     ans = num1 - num2;
                 }
                 if (op == '*') {
                     ans = num1 * num2;
                 }
                 if (op == '/') {
                     if (num2 != 0) {
                         ans = num1 / num2;
                     }
                 }
                 if (op == '%') {
                     ans = num1 % num2;
                 }
             } else if (op == 'x' || op == 'X') {
                 break;
             } else {
                 System.out.println("Invalid operation!!");
             }
             System.out.println(ans);
         }


                                 // L.3 Switch statements and Nested In Java

 //Q.1 Describe Fruit

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

 //Q.2 Display Day Name

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

         int day = sc.nextInt();
         switch (day) {
             case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
             case 6, 7 -> System.out.println("Weekends");
         }

 //Q.4 Nested Case In Java

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


         // L.4 Functions / Methods in Java

 //Q.1 Take Input of 2 numbers and print the sum

           a. Method without return type
         sum();
     }
     static void sum() {
         Scanner sc = new Scanner(System.in);
         int ans = 0;
         System.out.print("Enter Two Numbers: ");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();

         ans = num1 + num2;
         System.out.println(ans);


         // b. Method With return Type

         sum2();
     }
     static int sum2(){   //here we used int because the ans we have will be an integer.
         Scanner sc = new Scanner(System.in);
         int ans = 0;
         System.out.print("Enter Two Numbers: ");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();

         ans = num1 + num2;
         System.out.println(ans);
         return sum2();

 //Q.2 Example of Returning a string value

          greetings();
     }

     static String greetings() {
         String greetings = ("Hello Users, Have a good day!");
         System.out.println(greetings);
         return greetings;
     }

 //Q.3 Swapping Two Numbers

         int a = 10;
         int b = 20;

         int temp = a;
         a = b;
         b = temp;

         System.out.println("The value after swap is: " + a + " " + b);

 //Q.4 Swapping numbers in method file

         int arr [] = {0 , 1 , 2 , 3 , 4 , 5 };
         change(arr);
         System.out.println(Arrays.toString(arr));
     }
     static void change(int [] nums){
         nums[0] = 13;

          # Scope :  In Java Variables are only accessible inside the region they are created.
          # Method Scoping : Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared
          # Block Scope : Values initialized in this block will remain in this block. Eg:

         int a = 10;
         int b = 20;
         {
             int c = 30; // since this is specific for this block it cannot be used outside the block
             System.out.println(c);
         }
         System.out.println(c);

          # Loop Scope : Anything initialized inside the loop cannot be used outside the loop

 // Q.5 Shadowing

          If we initialize in the main public class it can be used for every file inside it

         public class Main{
          static int x = 10;
          public static void main (String[] args){

              System.out.println(x);
              fun();
              int x ;
              System.out.println(x); // Since x is not initialized it is giving error
              x = 90; // here x is initialized hence the next time if we print x we will get x = 90
              System.out.println(x);
          }
          static void fun(){
              System.out.println(x);
          }
       }



 //Q.6 Variable Arguments

    charu( 2 , 3 , "nitin" , 13 );
     demo(9); //It cannot be empty

        }
        static void charu(int a, int b, String v, int ...n){   //Variable arguments should always be on end
            System.out.println(Arrays.toString(n));  // Varargs cannot be duplicated while using overiding

            static void demo(int ...w){
                System.out.println(Arrays.toString(w));
            }  // Varargs cannot be duplicated while using overriding
            static void demo(String ...x){
                System.out.println(Arrays.toString(x));
                     }


 //Q.7 Find Prime numbers using methods.

         int n = sc.nextInt();
         System.out.println(isPrime(n));
     }

     static boolean isPrime(int n) {
         if (n <= 1) {
             return false ;
         }

         int c = 2;
         while (c * c <= 5) {
             if (n % c == 0) {
                 return false;
             }
             c++;
         }
          return c * c > n;



 //Q.8 Print all the 3 digit Armstrong no.


         for (int i = 100; i < 1000; i++) {
             if (isArmstrong(i))
                 System.out.println(i);
         }
     }
         static boolean isArmstrong ( int n){
             int orignal = n;
             int sum = 0;

             while (n > 0) {
                 int rem = n % 10;
                 n = n / 10;
                 sum = sum + rem * rem * rem;
             }
             return sum == orignal;
*/
        
    }
}






