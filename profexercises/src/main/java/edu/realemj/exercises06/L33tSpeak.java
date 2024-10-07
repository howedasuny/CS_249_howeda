package edu.realemj.exercises06;

import java.util.*;

public class L33tSpeak {
    public static String makeL33t(String line) {
        StringBuilder lb = new StringBuilder();
        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            char nc = switch(c) {
                case 'a','A' -> '4';
                case 'e','E' -> '3';
                case 'i','I' -> '1';
                case 'o','O' -> '0';
                default -> c;
            };
            lb.append(nc);
        }

        return lb.toString();
    }
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        String line = "";
        do {
            System.out.println("Enter message:");
            line = userInput.nextLine();
            String l33tLine = makeL33t(line);
            System.out.println(l33tLine);
            //} while(!line.isEmpty());
            //} while(line.length() != 0);
        } while(line != null && !line.equals(""));

    }
}
