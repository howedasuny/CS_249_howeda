package edu.howeda.assign04;

public class GameBoard {
    //private variables
    private int rows, cols = 0;
    private char[][] charArray;
    private char fillChar = ' ';

    //public functions
    public GameBoard(int rows, int cols, char fillChar) {
        charArray = new char[rows][cols];
        this.fillChar = fillChar;
        this.rows = rows;
        this.cols = cols;
        clear();
    }
    public void clear() {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                charArray[i][j] = fillChar;
            }
        }
    }
    public int getRowCnt() { return rows; }
    public int getColCnt() { return cols; }
    public boolean isValidPosition(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return true;
        } else return false;
    }
    public char getPos(int row, int col) {
        if (isValidPosition(row, col)) {
            return charArray[row][col];
        } else return ' ';
    }
    public boolean setPos(int row, int col, char c) {
        if (isValidPosition(row, col)) {
            charArray[row][col] = c;
            return true;
        } else return false;
    }
    public String toString() {
        return rows + " x " + cols + " GameBoard (default: " + fillChar + ")";
    }
    public String getBoardString() {
        String boardString = "";
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                boardString += charArray[i][j];
            }
            boardString += "\n";
        }
        return boardString;
    }
}

