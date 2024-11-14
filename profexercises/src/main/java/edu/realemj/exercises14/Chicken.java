package edu.realemj.exercises14;

public class Chicken extends Animal
    implements Edible, Flammable {
    public String howToEat() {
        return "Fried chicken";
    }

    public String howToIgnite() {
        return "Oven";
    }
}
