package edu.howeda.assign05;

import java.util.ArrayList;

public class Woods {
    //private variables
    private ArrayList<Giant> giants = new ArrayList<Giant>();
    
    //public methods
    public Giant createGiant(String name, String typeName) {
        if (name.isEmpty()) {
            return null;
        } else {
            return switch (typeName.toUpperCase()) {
                case "GIANT":
                    yield new Giant(name);
                case "TROLL":
                    yield new Troll(name);
                case "TREE":
                    yield new Tree(name);
                case "ENT":
                    yield new Ent(name);
                case "HUORN":
                    yield new Huorn(name);
                default:
                    yield null;
            };
        }
    }
    public boolean addGiant(String name, String typeName) {
        Giant giant = createGiant(name, typeName);
        if (giant != null) {
            giants.add(giant);
            return true;
        } else return false;
    }
    public Giant getGiant(int index) {
        if (index >= 0 && index < giants.size()) {
            return giants.get(index);
        } else return null;
    }
    public void printAllGiants() {
        System.out.println("ALL GIANTS:");
        for (Giant i : giants) {
            System.out.println("- " + i);
        }
    }
    public void printAllTrees() {
        System.out.println("ALL TREES:");
        for (Giant i : giants) {
            if (i instanceof Tree) {
                System.out.println("- " + i + ": " + ((Tree)i).speak());
            }
        }
    }
    public void printAllTrolls() {
        System.out.println("ALL TROLLS:");
        for (Giant i : giants) {
            if (i instanceof Troll) {
                System.out.println("- " + i + ": " + ((Troll)i).cook());
            }
        }
    }
}
