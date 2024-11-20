package edu.realemj.exercises14;

import java.util.*;

public class World {
    public static void cook(Edible e) {
        System.out.println(e.howToEat());
    }

    public static void main(String [] args) {
        Chicken c1 = new Chicken();
        Edible e1 = new Chicken();
        Animal a1 = new Chicken();
        Edible e2 = new Salt();

        cook(e1);
        cook(c1);
        if(a1 instanceof Edible ea1) {
            cook(ea1);
        }
        cook(e2);

        ArrayList<Flammable> fuel = new ArrayList<>();
        fuel.add(new Magnesium());
        fuel.add(new Chicken());
        fuel.add(new Magnesium());

        for(Flammable f: fuel) {
            System.out.println("- " + f.howToIgnite());
        }


    }
}
