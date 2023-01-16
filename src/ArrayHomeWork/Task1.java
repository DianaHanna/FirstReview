package ArrayHomeWork;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Task1 {
    public static void main(String[] args) {

        /*
        Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B
        (use 2 different ways of creating an array).
         */
        char[] grades={'A','B','C','D','E','F'};

        System.out.println(grades[1]);

        System.out.println("**********************************");
        char[] grades1=new char[6];
        grades1[0]='A';
        grades1[1]='B';
        grades1[2]='C';
        grades1[3]='D';
        grades1[4]='E';
        grades1[5]='F';

        System.out.println(grades1[1]);
        }
    }

