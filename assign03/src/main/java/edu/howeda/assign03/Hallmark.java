package edu.howeda.assign03;

import java.util.*;

public class Hallmark {

    public static GreetingCard generateCard(Scanner input) {
        //Ask user to input info, read inputs
        System.out.println("Enter boundary character:");
        char boundaryChar = (input.nextLine()).charAt(0);
        System.out.println("Enter number of lines:");
        int numLines = Integer.parseInt(input.nextLine());
        String[] allLines = new String[numLines];
        System.out.println("Enter lines:");
        for (int i = 0; i < numLines; ++i) {
            allLines[i] = input.nextLine();
        }
        GreetingCard card = new GreetingCard(allLines, boundaryChar);

        return card;
    }

    public static void main(String[] args) {
        //variables
        Scanner input = new Scanner(System.in);
        GreetingCard newCard = generateCard(input);

        //print out results
        System.out.println("For any occasion:");
        System.out.println(newCard);
    }

}
