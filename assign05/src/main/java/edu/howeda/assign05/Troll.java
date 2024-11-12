package edu.howeda.assign05;

public class Troll extends Giant {
    //public methods
    public Troll(String name) { super(name); }
    public String toString() { return "Troll " + super.toString(); }
    public String cook() { return "Mutton again..."; }
}
