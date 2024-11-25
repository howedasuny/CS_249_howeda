package edu.howeda.assign06;

import edu.howeda.assign04.GameBoard;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GameState implements Loadable {
    //private variables
    private ArrayList<Loadable> loadables = new ArrayList<Loadable>();
    private GameBoard map = new GameBoard(12, 30, '.');
    private Loadable item;
    private int numLines = 0;
    private String gameString = "";
    
    //public methods
    public Loadable createLoadable(String typeName) throws GameFileException {
        return switch (typeName.toUpperCase()) {
            case "SKELETON":
                yield new Skeleton();
            case "RAT":
                yield new Rat();
            case "ITEM":
                yield new Item();
            case "TOME":
                yield new Tome();
            default:
                throw new GameFileException("Unknown type: " + typeName);
        };
    }
    public void load(Scanner input) throws GameFileException {
        map.clear();
        loadables.clear();
        numLines = input.nextInt();
        for (int i = 0; i < numLines; ++i) {
            item = createLoadable(input.next());
            item.load(input);
            loadables.add(item);
            if (item instanceof Drawable) {
                ((Drawable) item).draw(map);
            }
        }
    }
    public String toString() {
        gameString = "";
        gameString += "MAP:\n" + map.getBoardString() + "\nCREATURES:\n";
        for (Loadable i : loadables) {
            if (i instanceof Creature) {
                gameString += "* " + i + "\n";
            }
        }
        gameString += "INVENTORY:\n";
        for (Loadable i : loadables) {
            if (i instanceof Item) {
                gameString += "* " + i + "\n";
            }
        }
        return gameString;
    }
    public void save(String filename) throws GameFileException {
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.print(this.toString());
            writer.close();
        } catch (Exception e) {
            throw new GameFileException("Failed to save file!", e);
        }
    }
}
