package com.alexseyf;

/*
 * Create a multiplication table generator,
 * capable of generating the multiplication table of any whole number between 1 and 10.
 * The user must inform which number he wants to see the multiplication table.
 * Output should be as per the example below.

 * Multiplication table 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int count;
        int result;

        System.out.println("Enter a number to see the multiplication table: ");
        number = scan.nextInt();

        for (count = 1; count <= 10; count++){
            result = number * count;
            System.out.println(number + " x " + count + " = " + result);
        }
    }
}
