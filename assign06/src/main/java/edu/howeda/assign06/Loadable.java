package edu.howeda.assign06;

import java.util.Scanner;

public interface Loadable {
    public abstract void load(Scanner input) throws GameFileException;
}
