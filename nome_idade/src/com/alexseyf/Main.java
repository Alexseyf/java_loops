package com.alexseyf;

/*Make a program that reads two values,
the first representing the student's name and the second representing their age.
(Stop the program by entering the value 0 in the name field)*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while(true) {
            System.out.println("Name: ");
            name = scan.next();
            if (name.equals("0")) break;

            System.out.println("Age: ");
            age = scan.nextInt();
        }

        System.out.println("to be continued...");
    }
}

