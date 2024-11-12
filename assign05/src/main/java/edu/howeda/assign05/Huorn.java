package edu.howeda.assign05;

public class Huorn extends Tree {
    //public methods
    public Huorn(String name) { super(name); }
    public String toString() { return "Huorn " + super.toString(); }
    public String speak() { return "<angry rustling>"; }
}
