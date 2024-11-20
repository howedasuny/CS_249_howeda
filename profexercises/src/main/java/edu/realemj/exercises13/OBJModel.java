package edu.realemj.exercises13;

import java.util.*;
import java.io.*;
import edu.realemj.exercises09.Matrix;

public class OBJModel {
    private ArrayList<Matrix> vertices = new ArrayList<>();
    private ArrayList<Face> faces = new ArrayList<>();

    public void clear() {
        vertices.clear();
        faces.clear();
    }

    public void load(String filename)
            throws IOException {
        try (
           Scanner fileInput = new Scanner(new File(filename));
           ) {
            while(fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                line = line.trim();
                if(!line.isEmpty()) {
                    Scanner parse = new Scanner(line);
                    String token = parse.next();
                    if(token.equals("v")) {
                        // Vertex
                        double x = parse.nextDouble();
                        double y = parse.nextDouble();
                        double z = parse.nextDouble();
                        Matrix v = Matrix.makePoint3D(x,y,z);
                        vertices.add(v);
                    }
                    else if(token.equals("f")) {
                        // Face
                        Face f = new Face();
                        f.read(parse);
                        faces.add(f);
                    }
                }
            }

        }
        catch(Exception e) {
            clear();
            throw new IOException("Bad file load", e);
        }
    }

    public void save(String filename) throws IOException {
        try (
                PrintWriter output = new PrintWriter(filename);
                ) {
            for(Matrix v: vertices) {
                output.println(v.to3DVertexOBJString());
            }

            for(Face f: faces) {
                output.println(f.toFaceOBJString());
            }
        }
    }

    public void applyTransformation(Matrix M) {
        for(int i = 0; i < vertices.size(); i++) {
            Matrix v = vertices.get(i);
            v = M.multiply(v);
            vertices.set(i, v);
        }
    }

}
