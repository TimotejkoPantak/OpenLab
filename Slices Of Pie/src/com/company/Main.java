package com.company;
import java.util.Scanner;

public class Main {

    public static boolean main(String[] args) {

        Scanner console = new Scanner(System.in);

        int totalSlices = 48;
        int recipients = 12;
        int sliceEach = 4;
        boolean Equal;

        if (recipients*sliceEach <= totalSlices ){
            Equal = true;
        }
        else {
            Equal = false;
        }
        return Equal;
    }
}
