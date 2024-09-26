package edu.realemj.oregon;

public class Party {

    private int partyCnt = 5;
    // TODO
    public int getPartyCnt() {
        // TODO
        return partyCnt;
    }

    public void killEveryone() {
        partyCnt = 0;
    }

    public String toString() {
        String s = "PARTY:\n";
        s += partyCnt + " souls alive.\n";
        return s;
    }
}
