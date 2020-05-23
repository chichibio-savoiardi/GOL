package com.company.javaUtils;

import java.util.*;
import java.lang.*;

public class matrixUtils {
    static Scanner in = new Scanner(System.in);

    public static void print(int[][] matr) {

        for (int i = 0; i < matr.length; i++) { // Loop through all rows
            System.out.print("[ ");
            for (int j = 0; j < matr[i].length; j++) { // Loop through all elements of current row
                System.out.print(matr[i][j] + " "); }
            System.out.println("]");
        }
    }

    public static void print(char[][] matr) {

        for (int i = 0; i < matr.length; i++) { // Loop through all rows
            System.out.print("[ ");
            for (int j = 0; j < matr[i].length; j++) { // Loop through all elements of current row
                System.out.print(matr[i][j] + " "); }
            System.out.println("]");
        }
    }

    public static void print(double[][] matr) {

        for (int i = 0; i < matr.length; i++) { // Loop through all rows
            System.out.print("[ ");
            for (int j = 0; j < matr[i].length; j++) { // Loop through all elements of current row
                System.out.print(matr[i][j] + " "); }
            System.out.println("]");
        }
    }

    public static void printColumn(int[][] matr) {
        for (int i = 0; i < matr[0].length; i++) {
            System.out.print("[ ");
            for (int[] ints : matr) {
                System.out.print(ints[i] + " ");
            }
            System.out.println("]");
        }
    }

    public static void printColumn(char[][] matr) {
        for (int i = 0; i < matr[0].length; i++) {
            System.out.print("[ ");
            for (char[] chars : matr) {
                System.out.print(chars[i] + " ");
            }
            System.out.println("]");
        }
    }

    public static void randomFill(int[][] matr, int bound) {
        Random randNum = new Random();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = randNum.nextInt(bound);
            }
        }
    }

    public static void randomBoolFill(int[][] matr) {
        Random randNum = new Random();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = randNum.nextInt(1);
            }
        }
    }

    public static void randomBoolFill(char[][] matr) {
        Random randNum = new Random();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (randNum.nextInt(2) == 1) {
                    matr[i][j] = '#';
                }
            }
        }
    }

    public static void fill0123(int[][] matr) {
        int count = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = count;
                count++;
            }
        }
    }

    public static void fill(int[][] matr, int filler) {
        for (int[] ints : matr) {
            Arrays.fill(ints, filler);
        }
    }

    public static void fill(char[][] matr, char filler) {
        for (char[] chars : matr) {
            Arrays.fill(chars, filler);
        }
    }

    public static int mulDiag(int[][] mat) {
        int dp = 1, ds = 1, det;
        for (int i = 0; i < mat.length; i++) {
            dp = mat[i][i] * dp;
            ds = mat[mat.length - 1 - i][i] * ds;
        }
        det = dp - ds;
        return det;
    }

    public static void copy(char[][] matr0, char[][] matr1)
    {
        for (int i = 1; i < 10; i++) {
            System.arraycopy(matr0[i], 1, matr1[i], 1, 9);
        }
    }
}
