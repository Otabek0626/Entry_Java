package com.example.oopswithjava;

import java.util.Scanner;

public class OOPsWithJava {
    static int first(){
        Scanner num = new Scanner(System.in);
        System.out.println("1. Given a two-digit number. Print its first digit (i.e. the number of tens).");
        System.out.print("Enter a number... ");
        int num1 = num.nextInt();

        return num1/10;
    }

    static int second(){
        Scanner num = new Scanner(System.in);
        System.out.println("2. Write a program that finds tens digit in a non-negative integer N (0 ≤ N ≤ 1000000).");
        System.out.print("Enter a number... ");
        int num1 = num.nextInt();

        return (num1/10)%10;
    }

    static int third(){
        Scanner num = new Scanner(System.in);
        System.out.println("3. Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.");
        System.out.print("Enter a number... ");
        int num1 = num.nextInt();

        int first, second, third;

        third = (num1%10)*100;
        num1 = num1/10;
        second = (num1%10)*10;
        first = num1/10;
        return first+second+third;
    }

    static int fourth(){
        Scanner num = new Scanner(System.in);
        System.out.println("4. Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.");
        System.out.print("Enter a number... ");
        int num1 = num.nextInt();

        int first, second, third;

        third = (num1%10);
        num1 = num1/10;
        second = (num1%10);
        first = num1/10;
        return first+second+third;
    }

    static int fifth(){
        Scanner num = new Scanner(System.in);
        System.out.println("5. 04. Given a natural number, not greater than 10000. Output the even number following this number. (In this problem, you can use if Statement)");
        System.out.print("Enter a number... ");
        int num1 = num.nextInt();

        if(num1%2 == 0){
            num1 = num1+2;
        }else{
            num1 = num1+1;
        }
        return num1;
    }

    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
        System.out.print("Select the numbers from 1 to 5... ");
        int answer1 = answer.nextInt();
        switch (answer1) {
            case 1:
                System.out.println(first());
                break;
            case 2:
                System.out.println(second());
                break;
            case 3:
                System.out.println(third());
                break;
            case 4:
                System.out.println(fourth());
                break;
            case 5:
                System.out.println(fifth());
                break;
        }
    }
}
