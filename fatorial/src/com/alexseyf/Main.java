package com.alexseyf;

/*Make a program that calculates the factorial of a
integer provided by the user.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Enter a number to calculate the factorial: ");
        int number = scan.nextInt();

        for (int i = number; i >=1; i--) {
            factorial = factorial * i;
        }
        System.out.println(number + "! " + "= " + factorial);
    }
}
