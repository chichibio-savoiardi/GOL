package com.company;

import java.util.*;
import java.lang.*;
import com.company.javaUtils.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static final int dim = 11;
    static char[][] matrix0 = new char[dim][dim];
    static char[][] matrix1 = new char[dim][dim];

    public static void main(String[] args) {
        boolean check = false;
        int tatty = 0;
        matrixUtils.fill(matrix0, ' ');
        matrixUtils.randomBoolFill(matrix0);
        matrixUtils.print(matrix0);
        System.out.println();
        matrixUtils.copy(matrix0, matrix1);
        for (int k = 0; k < 10; k++)
        {
            for (int i = 1; i < 10; i++)
            {
                for (int j = 1; j < 10; j++)
                {
                    if (matrix0[i][j] == '#')
                    {
                        check = true;
                    }
                    else
                    {
                        check = false;
                    }
                    tatty = funx.conta(i, j, matrix0, check);
                    switch (tatty)
                    {
                        case 0:
                            if (check)
                            {
                                funx.rule1(i, j, matrix0);
                            }
                            break;
                        case 1:
                        case 2:
                            if (check)
                            {
                                funx.rule2(i, j, matrix0);
                            }
                            break;
                        case 3:
                            if (!check)
                            {
                                funx.rule4(i, j, matrix0);
                            }
                            else
                            {
                                funx.rule2(i, j, matrix0);
                            }
                            break;
                        default:
                            if (check)
                            {
                                funx.rule3(i, j, matrix0);
                            }
                            break;
                    }
                }
            }
            matrixUtils.copy(matrix1, matrix0);
            matrixUtils.print(matrix0);
            System.out.println();
        }
    }
}
/* fin */