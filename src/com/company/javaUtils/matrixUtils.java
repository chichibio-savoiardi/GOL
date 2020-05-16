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

    public static void printColumn(int[][] matr) { //non usato
        for (int i = 0; i < matr[0].length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matr.length; j++) {
                System.out.print(matr[j][i] + " ");
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

    public static void fill0123(int[][] matr) {
        int count = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = count;
                count++;
            }
        }
    }

    public static void numFiller(int[][] matr, int filler) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = filler;
            }
        }
    }
}
