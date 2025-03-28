package edu.howeda.assign06;

import java.util.Scanner;

public class Item implements Loadable {
    //private variables
    private String ID = "";
    private int value = 0;
    
    //public methods
    public Item() { }
    public Item(String ID, int value) {
        this.ID = ID;
        this.value = value;
    }
    public String getID() { return ID; }
    public void setID(String ID) { this.ID = ID; }
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
    public String toString() { return ID + " with value " + value; }
    public void load(Scanner input) throws GameFileException {
        try {
            ID = input.next();
            value = input.nextInt();
        } catch (Exception e) {
            ID = "";
            value = 0;
            throw new GameFileException("Error loading Item", e);
        }
    }
}
