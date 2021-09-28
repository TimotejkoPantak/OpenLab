package com.company;

public class Main {

    public static void main(String[] args) {
        String[] rook1 = {"A8","E8"};
        String[] rook2= {"A1","B2"};
        String[] rook3 = {"H4","H3"};
        String[] rook4 = {"F5","C8"};

        System.out.print(TwoRooksAttack(rook1) + "\n");
        System.out.print(TwoRooksAttack(rook2) + "\n");
        System.out.print(TwoRooksAttack(rook3) + "\n");
        System.out.print(TwoRooksAttack(rook4));
    }

    public static boolean TwoRooksAttack(String[] rook)
    {
        String rook1 = rook[0];
        String rook2 = rook[1];
        return rook1.charAt(0) == rook2.charAt(0) || rook1.charAt(1) == rook2.charAt(1);
    }
}
