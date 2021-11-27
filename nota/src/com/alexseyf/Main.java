package com.alexseyf;

/*
 * Write a program that asks for a test grade between zero and ten.
 * Show a message if the value is invalid
 * and keep asking until the user enters a valid value.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade;

        System.out.println("Inform the test grade: ");
        grade = scan.nextInt();

        while (grade < 0 || grade > 10) {
            System.out.println("Enter a valid test grade: ");
            grade = scan.nextInt();
        }
    }
}
