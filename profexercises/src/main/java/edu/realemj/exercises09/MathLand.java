package edu.realemj.exercises09;

public class MathLand {
    public static void main(String [] args) {
        Matrix A = new Matrix(new double[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        });
        System.out.println(A);

        Matrix T = Matrix.makeTranslation2D(
                4,
                7);
        Matrix v = new Matrix(new double[][] {
                {3},
                {2},
                {1}
        });

        Matrix w = T.multiply(v);
        System.out.println(w);
    }
}
