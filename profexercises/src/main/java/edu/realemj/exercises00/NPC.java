package edu.realemj.exercises00;

public class NPC {
    public final double PI = 3.14;

    private int health = 100;
    private String name = ""; // null

    public NPC() {}

    public NPC(String n) {
        name = n;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public boolean setHealth(int h) {
        boolean success = false;

        if(h >= 0 && h <= 100) {
            health = h;
            success = true;
        }
        //else {
        //    System.err.println("ERROR: BAD HEALTH!");
        //    return false;
        //}

        return success;
    }


}
