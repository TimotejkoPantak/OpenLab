package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your first word here : ");
        String word1 = console.next();
        System.out.println("Enter your second word here : ");
        String word2 = console.next();

        System.out.println(EndOfString(word1,word2));
    }

    public static boolean EndOfString(String word1, String word2){

        if (word1.endsWith(word2)){
            return true;
        }
        else {
            return false;
        }
    }
}
