package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int kamen, papier, noznice;
        kamen = 1;
        papier = 2;
        noznice = 3;
        System.out.println("Hrac 1");
        System.out.println("Vyber jednu z moznosti : 1 - Kamen   2 - Papier   3 - Noznice");
        int player1 = console.nextInt();
        System.out.println("Hrac 2");
        System.out.println("Vyber jednu z moznosti : 1 - Kamen   2 - Papier   3 - Noznice");
        int player2 = console.nextInt();
        System.out.println();

        if (player1 == player2) {
            System.out.println("Remiza");
        } else {
            switch (player1) {
                case 1:
                    if (player2 == 3)
                        System.out.print("Hrac 1 vyhral!");
                    else
                        System.out.print("Hrac 2 vyhral!");
                    break;
                case 3:
                    if (player2 == 2)
                        System.out.print("Hrac 1 vyhral!");
                    else
                        System.out.print("Hrac 2 vyhral!");
                    break;
                case 2:
                    if (player2 == 1)
                        System.out.print("Hrac 1 vyhral!");
                    else
                        System.out.print("Hrac 2 vyhral!");
                    break;
            }
        }
    }
}
