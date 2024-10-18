package edu.realemj.exercises10;

public class ShapeLand {
    public static void main(String [] args) {
        Circle c1 = new Circle(8.9);
        double area = c1.getArea();
        System.out.println(c1);
        System.out.println("Area: " + area);
    }
}
