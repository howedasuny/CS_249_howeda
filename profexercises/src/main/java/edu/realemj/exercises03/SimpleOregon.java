package edu.realemj.exercises03;

import java.util.*;

public class SimpleOregon {
    public static void main(String [] args) {
        System.out.println("WELCOME!");

        Supplies s = new Supplies();
        System.out.println(s);
        double food = s.getTotalFood();


        Scanner input = new Scanner(System.in);

        String myString = "" + 9 + 8;



        System.out.println("Enter food:");
        double totalFood = input.nextDouble();
        System.out.println("Enter # of people:");
        int numPeople = input.nextInt();
        System.out.println("Enter rations:");
        int ration = input.nextInt();

        int totalDays = (int)totalFood/(numPeople*ration);

        System.out.println("TOTAL DAYS: " + totalDays);
    }
}
