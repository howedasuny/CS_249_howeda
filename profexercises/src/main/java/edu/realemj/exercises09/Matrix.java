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

    public Matrix(Matrix other) {
        m = new double[other.getRowCnt()][other.getColCnt()];
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = other.m[i][j];
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

    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(this.getRowCnt(),
                                    other.getColCnt());

        for(int i = 0; i < result.getRowCnt(); i++) {
            for(int j = 0; j < result.getColCnt(); j++) {
                // result[i,j] = ...
                for(int k = 0; k < this.getColCnt(); k++) {
                    result.m[i][j] += this.m[i][k]*other.m[k][j];
                }
            }
        }

        return result;
    }

    public static Matrix makeTranslation2D(double offx,
                                           double offy) {
        return new Matrix(new double[][] {
                {1,0,offx},
                {0,1,offy},
                {0,0,1}
        });
    }

    public static Matrix makePoint2D(double x, double y) {
        return new Matrix(new double[][] {
                {x},
                {y},
                {1}
        });
    }

    public String toPointString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for(int row = 0; row < (getRowCnt()-1); row++) {
            if(row != 0) {
                sb.append(",");
            }
            sb.append(m[row][0]);
        }
        sb.append(")");
        return sb.toString();
    }

}
