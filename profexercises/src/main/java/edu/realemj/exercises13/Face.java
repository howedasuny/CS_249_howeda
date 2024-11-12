package edu.realemj.exercises13;

import java.util.*;

public class Face {
    private int [] indices = new int[3];

    public int getIndex(int pos) {
        return indices[pos];
    }

    public void setIndex(int pos, int val) {
        indices[pos] = val;
    }

    public void read(Scanner parse) {
        indices[0] = parse.nextInt();
        indices[1] = parse.nextInt();
        indices[2] = parse.nextInt();
    }

    public String toFaceOBJString() {
        StringBuilder sb = new StringBuilder();
        sb.append("f");
        for(int i: indices) {
            sb.append(" ");
            sb.append(i);
        }
        return sb.toString();
    }
}
