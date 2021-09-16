package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Zadaj prvu stranu trojuholnika : ");
        int side1 = console.nextInt();
        System.out.println("Zadaj druhu stranu trojuholnika : ");
        int side2 = console.nextInt();
        System.out.println("Zadaj tretiu stranu trojuholnika : ");
        int side3 = console.nextInt();

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
            System.out.println("Trojuholnik sa neda zostrojit");
        }
        else {
            System.out.println("Trojuholnik sa da zostrojit");
        }
    }
}
