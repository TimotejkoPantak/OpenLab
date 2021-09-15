package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Write first number :");
        int input1 = console.nextInt();
        System.out.println("Write second number :");
        int input2 = console.nextInt();
        System.out.println("Write third number :");
        int input3 = console.nextInt();
        int output = 0;

        if (input1 == input2 && input1 == input3) {
            output = 3;
            System.out.println();
            System.out.print((output + " same numbers.")
            );
        }

        else if (input1 == input2 || input1 == input3) {
            output = 2;
            System.out.println();
            System.out.println(output + " same numbers.");
        }
        else {
            output = 0;
            System.out.println();
            System.out.println(output + " same numbers.");
        }

    }
}
