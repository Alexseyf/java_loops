package com.alexseyf;

/*
 * Make a program that reads 5 numbers
 * and inform the biggest one
 * and the average of these numbers.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 0;
        int big = 0;
        int sum = 0;
        int count = 0;

        while (count < 5) {
            System.out.println("Enter a number: ");
            number = scan.nextInt();

            sum = sum + number;

            if (number > big) big = number;

            count++;
        }

        System.out.println("The biggest number is: " + big);
        System.out.println("The average is: " + (sum / count));
    }
}
