package edu.realemj.exercises03;

import java.util.*;

public class SimpleOregon {
    public static void main(String [] args) {
        System.out.println("WELCOME!");

        Scanner input = new Scanner(System.in);

        double totalFood = input.nextDouble();
        int numPeople = input.nextInt();
        int ration = input.nextInt();

        int totalDays = (int)totalFood/(numPeople*ration);

        System.out.println("TOTAL DAYS: " + totalDays);
    }
}
