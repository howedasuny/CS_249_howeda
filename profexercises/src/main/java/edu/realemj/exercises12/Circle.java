package edu.realemj.exercises12;
import edu.realemj.exercises09.Matrix;
import edu.realemj.exercises09.MathUtil;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        // super();
    }

    public Circle(double radius) {
        // super();
        this.radius = radius;
    }

    public Circle(double x, double y, boolean filled) {
        this(Matrix.makePoint2D(x,y), filled);
        //this.filled = filled;
        //setPos(Matrix.makePoint2D(x,y));
    }

    public Circle(Matrix pos, boolean filled) {
        super(pos, filled);
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        String s = "Circle (r=" + radius + ") ";
        s += "which is also a " + super.toString();
        return s;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Circle otherCircle) {
            return (MathUtil.isDoubleEqual(
                        radius,
                        otherCircle.radius)
                    && super.equals(otherCircle));        }
        else {
            return false;
        }
    }
}
