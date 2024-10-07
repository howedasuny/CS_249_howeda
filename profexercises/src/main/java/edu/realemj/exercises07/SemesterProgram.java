package edu.realemj.exercises07;

import java.util.*;

public class SemesterProgram {
    public static void main(String [] args) {
        System.out.println("Number of args: " + args.length);
        for(int i = 0; i < args.length; i++) {
            System.out.println("\tArg " + i + ": " + args[i]);
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int studentCnt = input.nextInt();

        for(int i = 0; i < studentCnt; i++) {
            double r = Math.random(); // [0,1)
            // [50,100]
            // 51 different grades
            int score = 50 + (int)(51*r); // + [0,51)
            String letter = GradingUtil.getGradeLetter(score);
            //System.out.println("Student " + (i+1) + ": "
            //                    + score + " (" + letter + ")");
            System.out.printf("Student %d: %d (%s)\n",
                    (i+1), score, letter);
        }
    }
}
