package edu.howeda.assign02;

import java.util.*;

public class Armada {
    public static void main(String [] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        SpaceVessel vessel = new SpaceVessel();

        //Ask user to input info, read inputs
        System.out.println("Enter vessel name: ");
        String name = input.nextLine();
        System.out.println("Enter length and weight: ");
        String line = input.nextLine();

        //Parse length and weight
        Scanner parseLine = new Scanner(line);
        int feet = parseLine.nextInt();
        int pounds = parseLine.nextInt();

        //Save name, feet, pounds
        vessel.setName(name);
        vessel.setLength(feet);
        vessel.setWeight(pounds);

        //Print value returned from toString()
        System.out.println( vessel.toString() );
        
    }
}

