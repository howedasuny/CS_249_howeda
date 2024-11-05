package edu.realemj.exercises13;

import java.util.*;
import java.io.*;

public class Quotient {
    public static String readFromFile(String filename)
        throws IOException {

        throw new IOException("HELP!");
    }

    public static int divide(int x, int y) {
        if(y != 0) {
            int r = x / y;
            return r;
        }
        else {
            throw new ArithmeticException("DIVISION BY ZERO!");
        }
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int result = divide(a, b);
            System.out.println("Answer: " + result);
            readFromFile("test.txt");
        }
        catch(ArithmeticException e) {
            System.err.println("Don't divide by zero for fear of explosion.");
            System.err.println(e.getMessage());
        }
        catch(InputMismatchException e) {
            System.err.println("Bad inputs.");
        }
        catch(Exception e) {
            System.err.println(e);
        }


        System.out.println("DONE");
    }
}
