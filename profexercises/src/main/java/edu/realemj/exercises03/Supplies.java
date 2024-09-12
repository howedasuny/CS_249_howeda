package edu.realemj.exercises03;

public class Supplies {
    private double totalFood;

    public double getTotalFood() {
        return totalFood;
    }

    public double addFood(double foodInc) {
        if(foodInc >= 0) {
            totalFood += foodInc;
            return foodInc;
        }

        return 0;
    }

    public double removeFood(double foodDec) {
        if(foodDec >= 0) {
            foodDec = Math.min(totalFood, foodDec);
            totalFood -= foodDec;
            return foodDec;
        }

        return 0;
    }

    public String toString() {
        String s = "";
        s += "** SUPPLIES ***************\n";
        s += "* Food: " + getTotalFood() + "\n";
        s += "***************************\n";
        return s;
    }
}
