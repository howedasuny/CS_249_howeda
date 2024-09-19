package edu.realemj.exercises04;

import java.util.*;

public class FordCheck {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seed:");
        long seed = input.nextLong();
        Random r = new Random(seed);

        for(int i = 0; i < 10; i++) {
            boolean result = r.nextBoolean();
            if (result) {
                System.out.println("Got across safely.");
            } else {
                System.out.println("YOU ALL DROWNED.");
            }
        }
    }
}
