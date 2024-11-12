package edu.realemj.exercises12;

import java.util.*;
import edu.realemj.exercises09.Matrix;
import edu.realemj.exercises13.InvalidRadiusException;

public class ShapeWorld {
    public static void printArea(Shape s) {
        System.out.println("Area: " + s.getArea());
        if(s instanceof Circle) {
            double r = ((Circle) s).getRadius();
        }
    }

    public static void main(String [] args) {
        Shape s1 = new Circle(); //new Shape(8, -4, true);
        Shape s2 = new Circle(); //new Shape(-7,-2, false);
        Circle c1 = new Circle();
        c1.setPos(Matrix.makePoint2D(2,3));

        printArea(s1);
        printArea(c1);

        Circle c2 = new Circle(
                        Matrix.makePoint2D(1,2),
                        false);

        Circle c3 = new Circle(9,-2, false);

        try {
            Circle c4 = new Circle(5.3);
            System.out.println(c4);
            Circle c5 = new Circle(-3);
            System.out.println(c5);
            Circle c6 = new Circle(2.9);
            System.out.println(c6);
        }
        catch(InvalidRadiusException ir) {
            System.out.println(ir);
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c1);
        System.out.println(c3);

        ArrayList<Shape> allShapes = new ArrayList<>();
        ArrayList<String> allNames = new ArrayList<>();

        allShapes.add(s1);
        allShapes.add(s2);
        allShapes.add(c1);
        allShapes.add(c3);

        allNames.add("Bob");

        System.out.println(allShapes.size());
        System.out.println(allShapes);

        allShapes.remove(new Circle()); //new Shape(8,-4,true));

        for(int i = 0; i < allShapes.size(); i++) {
            System.out.println(
                    "Item " + i
                    + ": " + allShapes.get(i));
        }

        allShapes.clear();

        System.out.println(allShapes);

        Scanner input = SystemInputSingleton
                .getInstance()
                .getScanner();


    }
}
