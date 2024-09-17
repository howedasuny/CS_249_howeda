package edu.howeda.exercises00;

public class NPC {
    private int health;
    private int strength;
    private char relationship;

    public NPC() {
        health = 100;
        strength = 10;
        relationship = 'n';
    }

    public NPC(int h, int s, char r) {
        health = h;
        strength = s;
        relationship = r;
    }

    public int getHealth() { return health; }
    public int getStrength() { return strength; }
    public char getRelationship() { return relationship; }

    public void setHealth(int h) { health = h; }
    public void setStrength(int s) { strength = s; }
    public void setRelationship(char r) { relationship = r; }
}
