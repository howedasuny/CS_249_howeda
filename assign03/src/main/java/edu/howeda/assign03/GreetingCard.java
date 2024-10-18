package edu.howeda.assign03;

import java.util.*;

public class GreetingCard {
    //private variables
    private char inBoundChar;
    private String shortString = "";
    private String[] inLines;
    private String boundLine = "";
    private String centerLine = "";
    private String returnLine = "";
    private int lineLength = 0;
    private int remainingLines = 0;
    private int lineCount = 0;
    private int extraLineCount = 0;

    //public functions
    public GreetingCard(String[] allLines, char boundaryChar) {
        setBoundaryChar(boundaryChar);
        setLines(allLines);
    }
    public char getBoundaryChar() { return inBoundChar; }
    public String getLines() {
        shortString = "";
        for (String i : inLines) {
            shortString += (i + "\n");
        }
        return shortString;
    }
    public void setBoundaryChar(char boundaryChar) { inBoundChar = boundaryChar; }
    public void setLines(String[] allLines) {
        inLines = Arrays.copyOf(allLines, allLines.length);
    }
    public String generateBoundaryLine() {
        boundLine = "";
        for (int i = 0; i < 50; ++i) {
            boundLine += inBoundChar;
        }
        return boundLine + "\n";
    }
    public String generateCenteredLine(String text) {
        if (!text.isEmpty()) {
            text = " " + text + " ";
        }
        centerLine = "";
        lineLength = 50 - text.length();
        int i, j = 0;
        i = lineLength / 2;
        j = lineLength - i;
        for (int k = 0; k < i; ++k) {
            centerLine += inBoundChar;
        }
        centerLine += text;
        for (int k = 0; k < j; ++k) {
            centerLine += inBoundChar;
        }
        centerLine += "\n";
        return centerLine;
    }
    public String toString() {
        returnLine = "";
        remainingLines = inLines.length;
        for (int i = 0; i < remainingLines; i += 5) {
            returnLine += "\n";
            returnLine += generateBoundaryLine() + generateBoundaryLine();
            if ((remainingLines - i) < 5) {
                lineCount = (remainingLines - i);
                extraLineCount = 5 - (remainingLines - i);
            } else {
                lineCount = 5;
                extraLineCount = 0;
            }
            for (int j = 0; j < lineCount; ++j) {
                returnLine += generateCenteredLine(inLines[j + i]);
            }
            for (int j = 0; j < extraLineCount; ++j) {
                returnLine += generateBoundaryLine();
            }
            returnLine += generateBoundaryLine() + generateBoundaryLine();
        }
        return returnLine;
    }
}
