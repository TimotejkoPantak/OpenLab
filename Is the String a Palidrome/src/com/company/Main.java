package com.company;
import java.util.Scanner;
public class Main {

    static boolean palindrome(String word)
    {
        int a = 0, b = word.length() - 1;

        while (a < b) {

            if (word.charAt(a) != word.charAt(b))
                return false;
            a++;
            b--;
        }
        return true;
    }

    public static void main (String[] args){
        Scanner comsole = new Scanner(System.in);
        String word = comsole.nextLine();

        if (palindrome(word)){
            System.out.println("Is palindrome");
        }
        else {
            System.out.println("Is not palindrome");
        }

    }
}

