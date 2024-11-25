package edu.howeda.assign06;

import java.util.Scanner;

public abstract class Creature implements Loadable, Drawable {
    //private variables
    private int row, col = 0;
    
    //protected methods
    protected Creature() { }
    protected Creature(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    //public methods
    public int getRow() { return row; }
    public int getCol() { return col; }
    public void setRow(int row) { this.row = row; }
    public void setCol(int col) { this.col = col; }
    public void load(Scanner input) throws GameFileException {
        try {
            row = input.nextInt();
            col = input.nextInt();
        } catch (Exception e) {
            row = 0;
            col = 0;
            throw new GameFileException("Error loading Creature", e);
        }
    }
}
