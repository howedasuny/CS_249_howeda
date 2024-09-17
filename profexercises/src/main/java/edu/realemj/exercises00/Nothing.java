package edu.realemj.exercises00;

import edu.realemj.items.*;

public class Nothing {
    public static void main(String [] args) {
        int x = 5;

        Weapon w = new Weapon();

        NPC bob = new NPC();
        NPC susan = new NPC("SUSAN");

        //bob.health = -10;
        System.out.println(
                "Bob's health: "
                + bob.getHealth());

        bob.setHealth(500);
        System.out.println(
                "Bob's health again: "
                        + bob.getHealth());
        System.out.println(
                "Susan's health: "
                        + susan.getHealth());



    }

}
