package edu.howeda.assign04;

public class Box {
    //private variables
    private int sr, sc, er, ec = 0;
    private boolean filled = false;
    private char drawChar = ' ';
    
    //public functions
    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar) {
        this.sr = sr;
        this.sc = sc;
        this.er = er;
        this.ec = ec;
        this.filled = filled;
        this.drawChar = drawChar;
    }
    public String toString() {
        if (filled) {
            return "Filled Box from (" + sr + "," + sc + ") to (" +
                    er + "," + ec + ") with char '" + drawChar + "'";
        } else {
            return "Box from (" + sr + "," + sc + ") to (" +
                    er + "," + ec + ") with char '" + drawChar + "'";
        }
    }
    public void draw(GameBoard s) {
        if (filled) {
            for (int i = sr; i <= er; ++i) {
                for (int j = sc; j <= ec; ++j) {
                    s.setPos(i, j, drawChar);
                }
            }
        } else {
            for (int i = sr; i <= er; ++i) {
                for (int j = sc; j <= ec; ++j) {
                    if (i == sr || i == er || j == sc || j == ec) {
                        s.setPos(i, j, drawChar);
                    }
                }
            }
        }
    }
}
