package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

	double stepHeight = 0.3;
        double stepLenght = 0.2;
        double towerHeight = 25;
        double numberOfSteps = towerHeight/stepHeight;
        double totalDistance = numberOfSteps * (stepHeight+stepLenght);

    System.out.println(totalDistance);
    }
}
