package edu.realemj.exercises13;

import edu.realemj.exercises09.Matrix;

public class BunnyTime {
    public static void main(String [] args) {
        OBJModel model = new OBJModel();
        try {
            model.load("bunny1.obj");
            Matrix S = Matrix.makeScaling3D(
                    1.0,2.0, 1.0);
            Matrix R = Matrix.makeRotateZ3D(45);

            Matrix Rinv = Matrix.makeRotateZ3D(-45);
            Matrix T = Rinv.multiply(S.multiply(R));

            model.applyTransformation(T);
            model.save("bunnyMod.obj");
        }
        catch(Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}
