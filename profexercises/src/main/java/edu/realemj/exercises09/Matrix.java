package edu.realemj.exercises09;

public class Matrix {
    private double [][] m;

    public Matrix(int rowCnt, int colCnt) {
        m = new double[rowCnt][colCnt];
    }

    public Matrix(double [][] numbers) {
        m = new double[numbers.length][numbers[0].length];
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = numbers[i][j];
            }
        }
    }

    public int getRowCnt() {
        return m.length;
    }

    public int getColCnt() {
        return m[0].length;
    }

    public boolean isInBounds(int r, int c) {
        return (r >= 0 && r < getRowCnt()
                && c >= 0 && c < getColCnt());
    }

    public double get(int r, int c) {
        /*
        if(isInBounds(r,c)) {
            return m[r][c];
        }
        else {
            return 0;
        }*/
        return isInBounds(r,c) ? m[r][c] : 0;
    }

    public boolean set(int r, int c, double val) {
        boolean success = isInBounds(r,c);
        if(success) {
            m[r][c] = val;
        }
        return success;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(double [] row : m) {
            for(double v : row) {
                sb.append(v);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
