package edu.realemj.midterm;

public class Snippets {
    public static void main(String [] args) {
        int [] dwarves = new int[7];

        int [] hist = new int[100];

        for(int i = 0; i < hist.length; i++) {
            hist[i] = 5;
        }

        String [] crew = new String[10];

        for(String c: crew) {
            System.out.println(c);
        }

        String message = "Hi";

        for(int i = 0; i < message.length(); i++) {
            System.out.println(message.charAt(i));
        }

        Toilet privy = new Toilet(9.1);

        System.out.println(privy.flush(27));

        System.out.println(Toilet.computeGallons(30, 4.2));

    }
}
