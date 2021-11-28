package com.alexseyf;

/*
 * Make a program that reads N int numbers,
 * calculate and show the amount of even numbers
 * and the amount of odd numbers.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amount;
        int number;
        int even = 0;
        int odd = 0;
        int count = 0;

        System.out.println("Enter the amount: ");
        amount= scan.nextInt();

        do {
            System.out.println("Enter a number: ");
            number = scan.nextInt();
            if (number % 2 == 0){
                even++;
            } else {
                odd++;
            }
            count++;
        }while (count < amount);

        System.out.print("You entered " + even + " even numbers");
        System.out.print(" and " + odd + " odd numbers.");
    }
}
