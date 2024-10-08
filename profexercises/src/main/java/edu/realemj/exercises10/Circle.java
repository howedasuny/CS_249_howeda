package edu.realemj.exercises10;

import edu.realemj.exercises09.Matrix;

public class Circle {
    private double radius = 1.0;
    private Matrix center = Matrix.makePoint2D(0,0);

    public Circle() {}

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(double radius, Matrix center) {
        if(!setRadius(radius)) {
            System.err.println("Invalid radius; using default...");
        }
        setCenter(center);
    }

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

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String toString() {
        return String.format("Circle (r=%.2f, p=%s)",
                radius, center.toPointString());
    }
}
