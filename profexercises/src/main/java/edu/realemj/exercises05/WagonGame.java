package edu.realemj.exercises05;

import java.util.*;

public class WagonGame {
    public static String giveMeName() {
        //return null;
        return "bob";
    }

    public static void main(String [] args) {
        String location = "Nebraska";
        int numOfPeople = 5;

        boolean wonGame = (location.equals("Oregon")
                            && numOfPeople > 0);
        System.out.println("Are ya winning son? " + wonGame);

        location = "Oregon";
        wonGame = (location.equals("Oregon")
                && numOfPeople > 0);

        System.out.println("How about now? " + wonGame);

        String name = giveMeName();

        if(name != null && name.length() > 10) {
            System.out.println("Length is " + name.length());
        }
        else {
            System.err.println("INSUFFICIENT!");
        }

        System.out.println("DONE!");

        int totalFood = 0;
        Scanner input = new Scanner(System.in);

        int food = 0;

        do {
            System.out.println("Enter food:");
            food = input.nextInt();
            totalFood += food;
            System.out.println("TOTAL FOOD: "
                                + totalFood);

        } while(food != 0);
    }
}
