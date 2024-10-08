package edu.realemj.exercises10;

import edu.realemj.exercises09.Matrix;

public class Circle {
    private double radius = 1.0;
    private Matrix center = Matrix.makePoint2D(0,0);

    public double getRadius() { return radius; }

    public boolean setRadius(double radius) {
        if(radius >= 0) {
            this.radius = radius;
            return true;
        }
        return false;
    }

    public Matrix getCenter() {
        return new Matrix(center);
    }

    public void setCenter(Matrix c) {
        center = new Matrix(c);
    }
}
